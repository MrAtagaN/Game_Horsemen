package com.plekhanov.game.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.sound.sampled.*;

/**
 * Class AudioPlayer provides functionality to process sound files.
 * Sounds can be loaded, played, paused, resumed, and stopped.
 *
 * The sound engine accepts files in WAV, AIFF, and AU formats (although
 * not all WAV files - it depends on the encoding in the file).
 */
public class AudioPlayer
{
    private int lastSoundFrameLength = 0;
    private List<Clip> audioTracksCurrentPlayer = new ArrayList<>();
    private static List<Clip> allAudioTracks = new ArrayList<>();
    private static List<AudioPlayer> audioPlayers = new ArrayList<>();

    /**
     * Create a AudioPlayer that can play sound files.
     */
    public AudioPlayer()
    {
        audioPlayers.add(this);
    }

    public void play(String path) {
        loadSoundAndPlay(path, 100);
    }

    public void play(String path, int volume) {
        loadSoundAndPlay(path, volume);
    }

    /**
     * Stop the all playing sound this AudioPlayer
     */
    public void stop()
    {
        audioTracksCurrentPlayer.forEach(clip -> {clip.stop(); clip = null;});
    }

    public static void stopAllMusic() {
        audioPlayers.forEach(AudioPlayer::stop);
    }

    public void pause()
    {
        audioTracksCurrentPlayer.forEach(Clip::stop);
    }

    public void resume()
    {
        audioTracksCurrentPlayer.forEach(Clip::start);
    }

    /**
     * Set the current playing position in the last playing sound to 'value'.
     * 'value' is a percentage value (0 to 100). If there is no sound currently
     * playing, this method has no effect.
     *
     * @param value  The target position in the sound file, as a percentage.
     */
    public void seek(int value) {
        audioTracksCurrentPlayer.forEach(clip -> {
            clip.setFramePosition(lastSoundFrameLength / 100 * value);
        });
    }

    /**
     * Set the playback volume of the all tracks this audioPlayer.
     *
     * @param vol  Volume level as a percentage (0..100).
     */
    public void setVolume(int vol)
    {
        if(vol < 0 || vol > 100) {
            vol = 100;
        }
       final int volume = vol;
        audioTracksCurrentPlayer.forEach(clip -> {

            double val = volume / 100.0;

            try {
                FloatControl volControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
                float dB = (float)(Math.log(val == 0.0 ? 0.0001 : val) / Math.log(10.0) * 20.0);
                volControl.setValue(dB);
            } catch (Exception ex) {
                System.out.println("could not set volume");
            }
        });
    }

    private void loadSoundAndPlay(String path, int val) {
        try {
            File file = new File(path);
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            AudioFormat format = stream.getFormat();

            // we cannot play ALAW/ULAW, so we convert them to PCM

            if ((format.getEncoding() == AudioFormat.Encoding.ULAW) ||
                    (format.getEncoding() == AudioFormat.Encoding.ALAW)) {
                AudioFormat tmp = new AudioFormat(
                        AudioFormat.Encoding.PCM_SIGNED,
                        format.getSampleRate(),
                        format.getSampleSizeInBits() * 2,
                        format.getChannels(),
                        format.getFrameSize() * 2,
                        format.getFrameRate(),
                        true);
                stream = AudioSystem.getAudioInputStream(tmp, stream);
                format = tmp;
            }
            DataLine.Info info = new DataLine.Info(Clip.class,
                    stream.getFormat(),
                    ((int) stream.getFrameLength() *
                            format.getFrameSize()));

            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            lastSoundFrameLength = (int) stream.getFrameLength();
            audioTracksCurrentPlayer.add(clip);
            allAudioTracks.add(clip);
            setVolume(val);
            clip.start();
        } catch (Exception e) {

        }
    }
}
