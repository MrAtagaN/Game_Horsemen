package com.plekhanov.game.gameLevels;

import com.plekhanov.game.utils.AudioFilePlayer;
import com.plekhanov.game.gameObjects.enemies.Ghost;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.GameObject;
import com.plekhanov.game.gameObjects.Player;
import com.plekhanov.game.gameObjects.BackGround;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class Level_1 {

    public static void load(int width, int height, Model model) {

        ImageLoader.ImagesLevel_1 imagesLevel_1 = ImageLoader.getImagesLevel_1();
        List<GameObject> gameObjects = new CopyOnWriteArrayList<>();
        model.setGameObjects(gameObjects);

        int y = 225; // смещение фона вверх
        int imageHeight = 500;  // растягивание фона

        //статический фон
        gameObjects.add(new BackGround(width / 2, height / 2 - y, 0, 0, imagesLevel_1.getBackgroundImage1(), width, height + imageHeight, 1));  //background1
        gameObjects.add(new BackGround(width / 2, height / 2 - y, 0, 0, imagesLevel_1.getBackgroundImage2(), width, height + imageHeight, 2));  //background2
        gameObjects.add(new BackGround(width / 2, height / 2 - y, 0, 0, imagesLevel_1.getBackgroundImage3(), width, height + imageHeight, 3));  //background3
        gameObjects.add(new BackGround(width / 2, height / 2 - y, 0, 0, imagesLevel_1.getBackgroundImage4(), width, height + imageHeight, 4));  //background4

        //динамический фон
        gameObjects.add(new BackGround(width / 2, height / 2 - y, -0.1, 0, imagesLevel_1.getBackgroundImage5(), width, height + imageHeight, 5));  //background5
        gameObjects.add(new BackGround(width / 2 + width, height / 2 - y, -0.1, 0, imagesLevel_1.getBackgroundImage5(), width, height + imageHeight, 5));  //background5
        gameObjects.add(new BackGround(width / 2, height / 2 - y, -0.2, 0, imagesLevel_1.getBackgroundImage6(), width, height + imageHeight, 6));  //background6
        gameObjects.add(new BackGround(width / 2 + width, height / 2 - y, -0.2, 0, imagesLevel_1.getBackgroundImage6(), width, height + imageHeight, 6));  //background6
        gameObjects.add(new BackGround(width / 2, height / 2 - y, -0.3, 0, imagesLevel_1.getBackgroundImage7(), width, height + imageHeight, 7));  //background7
        gameObjects.add(new BackGround(width / 2 + width, height / 2 - y, -0.3, 0, imagesLevel_1.getBackgroundImage7(), width, height + imageHeight, 7));  //background7
        gameObjects.add(new BackGround(width / 2, height / 2 - y, -0.3, 0, imagesLevel_1.getBackgroundImage8(), width, height + imageHeight, 8));  //background8
        gameObjects.add(new BackGround(width / 2 + width, height / 2 - y, -0.3, 0, imagesLevel_1.getBackgroundImage8(), width, height + imageHeight, 8));  //background8
        gameObjects.add(new BackGround(width / 2, height / 2 - y, -0.5, 0, imagesLevel_1.getBackgroundImage9(), width, height + imageHeight, 9));  //background9
        gameObjects.add(new BackGround(width / 2 + width, height / 2 - y, -0.5, 0, imagesLevel_1.getBackgroundImage9(), width, height + imageHeight, 9));  //background9

        // Враги
        //gameObjects.add(new Carrion(2000, 965, -0.5, 0, model));  //Carrion
        //gameObjects.add(new Husk(2200, 580, -0.3, 0, model));  //Husk
        //gameObjects.add(new Gargoly(2200, 370, -1, 0, model));  //Gargoly
       gameObjects.add(new Ghost(2000, 370, -0.7, 0, model));
     //    gameObjects.add(new Zombie(2000, 913, -0.7, 0, model));
       //  gameObjects.add(new Archer(2000, 500, -0.5, 0, model));

        // Игрок
        Player player = new Player(500, 900, 0, 0, 900, model);
        gameObjects.add(player);
        model.setPlayer(player);

        // Предметы

        // Музыка
        final AudioFilePlayer audioFilePlayer = new AudioFilePlayer();
        AudioFilePlayer.stopAllmusic();
        new Thread(() -> {audioFilePlayer.play("src/main/resources/sounds/Rampad.mp3");}).start();


        Collections.sort(gameObjects);
    }


}
