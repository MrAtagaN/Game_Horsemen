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
        List<GameObject> gameObjects = model.getGameObjects();
        if (gameLevelCount == 100) {
            gameObjects.add(createGameObject(ZOMBIE, model));
        } else if (gameLevelCount == 500) {
            gameObjects.add(createGameObject(ARCHER, model));
        } else if (gameLevelCount == 1000) {
            gameObjects.add(createGameObject(NECROMANCER, model));
        } else if (gameLevelCount == 3000) {
            gameObjects.add(createGameObject(HUSK, model));
        } else if (gameLevelCount == 6000) {
            gameObjects.add(createGameObject(ZOMBIE, model));
        } else if (gameLevelCount == 6100) {
            gameObjects.add(createGameObject(HEART, model));
        } else if (gameLevelCount == 9000) {
            gameObjects.add(createGameObject(GHOST, model));
        }  else if (gameLevelCount == 9500) {
            gameObjects.add(createGameObject(HEART, model));
        } else if (gameLevelCount == 11000) {
            gameObjects.add(createGameObject(ARCHER, model));
        } else if (gameLevelCount == 14000) {
            gameObjects.add(createGameObject(HUSK, model));
        } else if (gameLevelCount == 15000) {
            gameObjects.add(createGameObject(HEART, model));
        } else if (gameLevelCount == 17500) {
            gameObjects.add(createGameObject(NECROMANCER, model));
        } else if (gameLevelCount == 18000) {
            //GameObjectsFactory.addGameObjectToLevel(GameObjectName.BOMB, model);
        } else if (gameLevelCount == 20000) {
            gameObjects.add(createGameObject(GHOST, model));
        } else if (gameLevelCount == 21000) {
            gameObjects.add(createGameObject(HEART, model));
        } else if (gameLevelCount == 24000) {
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
