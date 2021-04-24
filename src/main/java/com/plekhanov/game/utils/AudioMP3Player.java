package com.plekhanov.game.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioMP3Player {


    private boolean play = true;

    private static List<AudioMP3Player> allAudioTracks = new ArrayList<>();

    public AudioMP3Player() {
        allAudioTracks.add(this);
    }

    public void play(String filePath) {
        new Thread(() -> {
            play = true;
            final File file = new File(filePath);
            try (final AudioInputStream in = AudioSystem.getAudioInputStream(file)) {
                final AudioFormat outFormat = getOutFormat(in.getFormat());
                final Info info = new Info(SourceDataLine.class, outFormat);
                try (final SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info)) {
                    if (line != null) {
                        line.open(outFormat);
                        line.start();
                        stream(AudioSystem.getAudioInputStream(outFormat, in), line);
                        line.drain();
                        line.stop();
                        line.flush();
                    }
                }
            } catch (UnsupportedAudioFileException
                    | LineUnavailableException
                    | IOException e) {
                throw new IllegalStateException(e);
            }}).start();
    }

    private AudioFormat getOutFormat(AudioFormat inFormat) {
        final int ch = inFormat.getChannels();
        final float rate = inFormat.getSampleRate();
        return new AudioFormat(AudioFormat.Encoding.PCM_SIGNED, rate, 16, ch, ch * 2, rate, false);
    }


    private void stream(AudioInputStream in, SourceDataLine line)
            throws IOException {
        final byte[] buffer = new byte[4096];
        for (int n = 0; (n != -1 && play); n = in.read(buffer, 0, buffer.length)) {
            line.write(buffer, 0, n);
        }
    }

    public void stopMusic() {
        play = false;
    }

    public static void stopAllMusic() {
        allAudioTracks.forEach(AudioMP3Player::stopMusic);
    }
}
