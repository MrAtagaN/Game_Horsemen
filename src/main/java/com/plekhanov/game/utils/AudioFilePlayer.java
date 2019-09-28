package com.plekhanov.game.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.*;
import javax.sound.sampled.DataLine.Info;

public class AudioFilePlayer {


    private boolean play = true;

    private static List<AudioFilePlayer> allAudioTracks = new ArrayList<>();

//    public static void main(String[] args) throws InterruptedException {            // для отладки, потом удалить
//        final AudioFilePlayer player = new AudioFilePlayer ();
//
//      new Thread(() -> {player.play("src/main/resources/sounds/Win_Battle.mp3");}).start();
//
//        Thread.sleep(1500);
//         player.play = false;
//    }

    public AudioFilePlayer() {
        allAudioTracks.add(this);
    }

    public void play(String filePath) {
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
        }
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

    public static void stopAllmusic() {
        allAudioTracks.forEach(AudioFilePlayer::stopMusic);
    }
}
