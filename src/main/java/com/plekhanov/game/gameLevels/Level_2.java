package com.plekhanov.game.gameLevels;

import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioPlayer;
import com.plekhanov.game.utils.GameObjectName;
import com.plekhanov.game.utils.GameObjectsFactory;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.Player;
import com.plekhanov.game.gameObjects.BackGround;



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

        //Музыка
        AudioPlayer audioPlayer = new AudioPlayer();
        AudioPlayer.stopAllMusic();
       audioPlayer.play(AudioHelper.BACKGROUNDTRACK_2, 20);

    }

    public static void addGameObjectSheduler(int gameLevelCount, Model model) {
        if (gameLevelCount == 100) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.OGRE, model);
        } else if (gameLevelCount == 1000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.MUMMY_ZOMBIE, model);
        } else if (gameLevelCount == 2500) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.FOX_MUMMY, model);
        } else if (gameLevelCount == 4000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.HEART, model);
        } else if (gameLevelCount == 5000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.FIRE_ELEMENTAL, model);
        } else if (gameLevelCount == 7000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.FOX_MUMMY, model);
        } else if (gameLevelCount == 9000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.HEART, model);
        } else if (gameLevelCount == 9500) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.OGRE, model);
        } else if (gameLevelCount == 12000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.FIRE_ELEMENTAL, model);
        } else if (gameLevelCount == 14000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.MUMMY_ZOMBIE, model);
        } else if (gameLevelCount == 15000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.HEART, model);
        } else if (gameLevelCount == 18000) {
            GameObjectsFactory.addGameObjectToLevel(GameObjectName.GENIE, model);
        }
    }

}
