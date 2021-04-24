package com.plekhanov.game.gameLevels;

import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.Player;
import com.plekhanov.game.gameObjects.BackGround;


public class Level_3 {

    public static void load(int width, int height, Model model) {

        int y = -0; // смещение фона вверх
        int imageHeight = 0;  // растягивание фона

        //статический фон
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundLevel3Image1(), width + imageHeight, height + imageHeight, 1));  //background1
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundLevel3Image2(), width, height + imageHeight, 2));  //background2

        //динамический фон
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.1, 0, ImageLoader.getBackgroundLevel3Image3(), width, height + imageHeight, 4));  //background3
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.1, 0, ImageLoader.getBackgroundLevel3Image3(), width, height + imageHeight, 4));  //background3
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundLevel3Image4(), width, height + imageHeight, 4));  //background4
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundLevel3Image4(), width, height + imageHeight, 4));  //background4
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundLevel3Image5(), width, height + imageHeight, 5));  //background5
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundLevel3Image5(), width, height + imageHeight, 5));  //background5

        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.3, 0, ImageLoader.getBackgroundLevel3Image6(), width, height + imageHeight, 6));  //background6
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.3, 0, ImageLoader.getBackgroundLevel3Image6(), width, height + imageHeight, 6));  //background6
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundLevel3Image7(), width, height + imageHeight, 7));  //background7
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundLevel3Image7(), width, height + imageHeight, 7));  //background7
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundLevel3Image8(), width, height + imageHeight, 8));  //background8
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundLevel3Image8(), width, height + imageHeight, 8));  //background8
        model.getGameObjects().add(new BackGround(width / 2, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundLevel3Image9(), width, height + imageHeight, 9));  //background9
        model.getGameObjects().add(new BackGround(width / 2 + width, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundLevel3Image9(), width, height + imageHeight, 9));  //background9


        // Игрок
        Player player = new Player(500, 960, 0, 0, 960, model);
        model.getGameObjects().add(player);
        model.setPlayer(player);


    }
}
