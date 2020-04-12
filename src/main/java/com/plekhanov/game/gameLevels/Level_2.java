package com.plekhanov.game.gameLevels;

import com.plekhanov.game.gameObjects.GameObject;
import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioPlayer;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.Player;
import com.plekhanov.game.gameObjects.BackGround;

import java.util.List;

import static com.plekhanov.game.utils.GameObjectName.*;
import static com.plekhanov.game.utils.GameObjectsFactory.createGameObject;


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
        List<GameObject> gameObjects = model.getGameObjects();
        //начало уровня
        if (gameLevelCount == 100) {
            gameObjects.add(createGameObject(OGRE, model));
        } else if (gameLevelCount == 1500) {
            gameObjects.add(createGameObject(FOX_MUMMY, model));
        } else if (gameLevelCount == 3000) {
            gameObjects.add(createGameObject(MUMMY_ZOMBIE, model));
        } else if (gameLevelCount == 5000) {
            gameObjects.add(createGameObject(DRUID, model));
        } else if (gameLevelCount == 7000) {
            gameObjects.add(createGameObject(FIRE_ELEMENTAL, model));
        } else if (gameLevelCount == 8000) {
            gameObjects.add(createGameObject(HEART, model));
        }
        //середина
        else if (gameLevelCount == 12000) {
            gameObjects.add(createGameObject(MUMMY_ZOMBIE, model));
        } else if (gameLevelCount == 12001) {
            gameObjects.add(createGameObject(FOX_MUMMY, model));
        }


//        else if (gameLevelCount == 1000) {
//            gameObjects.add(createGameObject(MUMMY_ZOMBIE, model));
//        } else if (gameLevelCount == 2500) {
//            gameObjects.add(createGameObject(FOX_MUMMY, model));
//        } else if (gameLevelCount == 4000) {
//            gameObjects.add(createGameObject(HEART, model));
//        } else if (gameLevelCount == 5000) {
//            gameObjects.add(createGameObject(FIRE_ELEMENTAL, model));
//        } else if (gameLevelCount == 7000) {
//            gameObjects.add(createGameObject(FOX_MUMMY, model));
//        } else if (gameLevelCount == 9000) {
//            gameObjects.add(createGameObject(HEART, model));
//        } else if (gameLevelCount == 9500) {
//            gameObjects.add(createGameObject(OGRE, model));
//        } else if (gameLevelCount == 12000) {
//            gameObjects.add(createGameObject(FIRE_ELEMENTAL, model));
//        } else if (gameLevelCount == 14000) {
//            gameObjects.add(createGameObject(MUMMY_ZOMBIE, model));
//        } else if (gameLevelCount == 15000) {
//            gameObjects.add(createGameObject(HEART, model));
//        } else if (gameLevelCount == 18000) {
//            gameObjects.add(createGameObject(GENIE, model));
//        }
    }

}
