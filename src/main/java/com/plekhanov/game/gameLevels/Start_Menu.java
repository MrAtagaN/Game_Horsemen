package com.plekhanov.game.gameLevels;

import com.plekhanov.game.Model;
import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioPlayer;


public class Start_Menu {

    public static void load(int width, int height, Model model) {

        Level_1.loadLevel_1_BackGround(width, height, model);

        // Музыка
//        AudioPlayer audioPlayer = new AudioPlayer();
//        AudioPlayer.stopAllMusic();
//        audioPlayer.play(AudioHelper.menuMusic(), 40);
    }
}
