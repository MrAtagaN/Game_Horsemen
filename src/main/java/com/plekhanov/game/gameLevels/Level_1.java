package com.plekhanov.game.gameLevels;

import com.plekhanov.game.gameObjects.GameObject;
import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioPlayer;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.Player;
import com.plekhanov.game.gameObjects.BackGround;

import java.util.List;

import static com.plekhanov.game.utils.GameObjectName.ARCHER;
import static com.plekhanov.game.utils.GameObjectName.GARGOLY;
import static com.plekhanov.game.utils.GameObjectName.GHOST;
import static com.plekhanov.game.utils.GameObjectName.HEART;
import static com.plekhanov.game.utils.GameObjectName.HUSK;
import static com.plekhanov.game.utils.GameObjectName.NECROMANCER;
import static com.plekhanov.game.utils.GameObjectName.ZOMBIE;
import static com.plekhanov.game.utils.GameObjectsFactory.createGameObject;


public class Level_1 {


    public static void load(Model model) {

        // Игрок
        Player player = new Player(500, 900, 0, 0, 900, model);
        model.getGameObjects().add(player);
        model.setPlayer(player);

        // Музыка
        AudioPlayer audioPlayer = new AudioPlayer();
        AudioPlayer.stopAllMusic();
        audioPlayer.play(AudioHelper.BACKGROUNDTRACK_1, 15);

    }

    public static void addGameObjectScheduler(int gameLevelCount, Model model) {
        //начало
        List<GameObject> gameObjects = model.getGameObjects();
        if (gameLevelCount == 100) {
            gameObjects.add(createGameObject(ZOMBIE, model));
        } else if (gameLevelCount == 1200) {
            gameObjects.add(createGameObject(HUSK, model));
        } else if (gameLevelCount == 1500) {
            gameObjects.add(createGameObject(ZOMBIE, model));
        } else if (gameLevelCount == 5000) {
            gameObjects.add(createGameObject(ARCHER, model));
        } else if (gameLevelCount == 9000) {
            gameObjects.add(createGameObject(NECROMANCER, model));
        } else if (gameLevelCount == 12000) {
            gameObjects.add(createGameObject(HEART, model));
        } else if (gameLevelCount == 13000) {
            gameObjects.add(createGameObject(GHOST, model));
        }
        //середина
        else if (gameLevelCount == 17000) {
            gameObjects.add(createGameObject(ZOMBIE, model));
        } else if (gameLevelCount == 16500) {
            gameObjects.add(createGameObject(ARCHER, model));
        } else if (gameLevelCount == 20000) {
            gameObjects.add(createGameObject(HUSK, model));
        } else if (gameLevelCount == 21000) {
            gameObjects.add(createGameObject(NECROMANCER, model));
        } else if (gameLevelCount == 26000) {
            gameObjects.add(createGameObject(GHOST, model));
        } else if (gameLevelCount == 25500) {
            gameObjects.add(createGameObject(ZOMBIE, model));
        } else if (gameLevelCount == 27000) {
            gameObjects.add(createGameObject(HEART, model));
        } else if (gameLevelCount == 29000) {
            gameObjects.add(createGameObject(NECROMANCER, model));
        } else if (gameLevelCount == 29001) {
            gameObjects.add(createGameObject(ARCHER, model));
        } else if (gameLevelCount == 35000) {
            gameObjects.add(createGameObject(HUSK, model));
        } else if (gameLevelCount == 35500) {
            gameObjects.add(createGameObject(ZOMBIE, model));
        } else if (gameLevelCount == 36000) {
            gameObjects.add(createGameObject(GHOST, model));
        }  else if (gameLevelCount == 43000) {
            gameObjects.add(createGameObject(HEART, model));
        } else if (gameLevelCount == 45000) {
            gameObjects.add(createGameObject(GARGOLY, model));
        }

    }

    public static void loadBackGround(int width, int height, Model model) {

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
