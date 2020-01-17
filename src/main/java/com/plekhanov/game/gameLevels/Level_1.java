package com.plekhanov.game.gameLevels;

import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioPlayer;
import com.plekhanov.game.utils.GameObjectsFactory;
import com.plekhanov.game.utils.GameObjectName;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.Player;
import com.plekhanov.game.gameObjects.BackGround;



public class Level_1 {


    public static void load(int width, int height, Model model) {

        // Игрок
        Player player = new Player(500, 900, 0, 0, 900, model);
        model.getGameObjects().add(player);
        model.setPlayer(player);

        // Музыка
        AudioPlayer audioPlayer = new AudioPlayer();
        AudioPlayer.stopAllMusic();
        audioPlayer.play(AudioHelper.BACKGROUNDTRACK_1, 15);

    }

    public static void addGameObjectSheduler(int gameLevelCount, Model model) {
        if (gameLevelCount == 100) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.ZOMBIE, model);
        } else if (gameLevelCount == 500) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.ARCHER, model);
        } else if (gameLevelCount == 1000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.NECROMANCER, model);
        } else if (gameLevelCount == 3000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.HUSK, model);
        } else if (gameLevelCount == 6000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.ZOMBIE, model);
        } else if (gameLevelCount == 6100) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.HEART, model);
        } else if (gameLevelCount == 9000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.GHOST, model);
        }  else if (gameLevelCount == 9500) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.HEART, model);
        } else if (gameLevelCount == 11000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.ARCHER, model);
        } else if (gameLevelCount == 14000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.HUSK, model);
        } else if (gameLevelCount == 15000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.HEART, model);
        } else if (gameLevelCount == 17500) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.NECROMANCER, model);
        } else if (gameLevelCount == 18000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.BOMB, model);
        } else if (gameLevelCount == 20000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.GHOST, model);
        } else if (gameLevelCount == 21000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.HEART, model);
        } else if (gameLevelCount == 24000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.GARGOLY, model);
        }
    }

    public static void loadLevel_1_BackGround(int width, int height, Model model) {

        int y = 225; // смещение фона вверх
        int imageHeight = 500;  // растягивание фона

        //статический фон
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundImage1(), width, height + imageHeight, 1));  //background1
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundImage2(), width, height + imageHeight, 2));  //background2
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundImage3(), width, height + imageHeight, 3));  //background3
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundImage4(), width, height + imageHeight, 4));  //background4

        //динамический фон
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.1, 0, ImageLoader.getBackgroundImage5(), width, height + imageHeight, 5));  //background5
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.1, 0, ImageLoader.getBackgroundImage5(), width, height + imageHeight, 5));  //background5
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundImage6(), width, height + imageHeight, 6));  //background6
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundImage6(), width, height + imageHeight, 6));  //background6
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.3, 0, ImageLoader.getBackgroundImage7(), width, height + imageHeight, 7));  //background7
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.3, 0, ImageLoader.getBackgroundImage7(), width, height + imageHeight, 7));  //background7
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.3, 0, ImageLoader.getBackgroundImage8(), width, height + imageHeight, 8));  //background8
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.3, 0, ImageLoader.getBackgroundImage8(), width, height + imageHeight, 8));  //background8
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundImage9(), width, height + imageHeight, 9));  //background9
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundImage9(), width, height + imageHeight, 9));  //background9

    }
}
