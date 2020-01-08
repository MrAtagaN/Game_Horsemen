package com.plekhanov.game.gameLevels;

import com.plekhanov.game.gameObjects.enemies.genie.Genie;
import com.plekhanov.game.gameObjects.enemies.foxMummy.FoxMummy;
import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioMP3FilePlayer;
import com.plekhanov.game.utils.AudioPlayer;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.Player;
import com.plekhanov.game.gameObjects.BackGround;
import com.plekhanov.game.gameObjects.enemies.*;



public class Level_2 {

    public static void load(int width, int height, Model model) {

        int y = -0; // смещение фона вверх
        int imageHeight = 0;  // растягивание фона

        //статический фон
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundLevel2Image1(), width + imageHeight, height + imageHeight, 1));  //background1
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundLevel2Image2(), width, height + imageHeight, 2));  //background2

        //динамический фон
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundLevel2Image3(), width, height + imageHeight, 4));  //background4
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundLevel2Image3(), width, height + imageHeight, 4));  //background4
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundLevel2Image4(), width, height + imageHeight, 4));  //background4
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundLevel2Image4(), width, height + imageHeight, 4));  //background4
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundLevel2Image5(), width, height + imageHeight, 5));  //background5
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundLevel2Image5(), width, height + imageHeight, 5));  //background5

        // Игрок
        Player player = new Player(500, 900, 0, 0, 900, model);
        model.getGameObjects().add(player);
        model.setPlayer(player);

        // Враги
        //gameObjects.add(new Carrion(2000, 965, -0.5, 0, model)); //enemyCarrion
      //  gameObjects.add(new Husk(2200, 580, -0.3, 0, model)); //enemyHusk
       // gameObjects.add(new Pestilence(2200, 370, -0.7, 0, model)); //enemyPestilence
        model.getGameObjects().add(new MummyZombie(2200, 500, -0.7, 0, model)); //enemyMummyZombie
        model.getGameObjects().add(new Ogre(2200, 900, -0.75, 0, model)); //enemyOgre
        model.getGameObjects().add(new FoxMummy(2500, 900, -0.6, 0, model)); // enemyFoxMummy

        new Thread(() -> {
            try {
                Thread.sleep(10000);
                model.getGameObjects().add(new Genie(2300, 500, -1, 0, model)); //enemy Genie
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Предметы

        //Музыка
     //   AudioPlayer audioPlayer = new AudioPlayer();
     //   AudioPlayer.stopAllMusic();
     //  audioPlayer.play(AudioHelper.backGroundTrack_1(), 20);

    }
}
