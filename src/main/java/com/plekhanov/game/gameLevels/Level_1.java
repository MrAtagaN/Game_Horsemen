package com.plekhanov.game.gameLevels;

import com.plekhanov.game.gameObjects.enemies.Ghost;
import com.plekhanov.game.gameObjects.enemies.Zombie;
import com.plekhanov.game.gameObjects.enemies.archer.Archer;
import com.plekhanov.game.gameObjects.enemies.druid.Druid;
import com.plekhanov.game.gameObjects.enemies.fire_elemental.FireElemental;
import com.plekhanov.game.gameObjects.enemies.gargoly.Gargoly;
import com.plekhanov.game.gameObjects.enemies.husk.Husk;
import com.plekhanov.game.gameObjects.enemies.necromancer.Necromancer;
import com.plekhanov.game.gameObjects.items.HeartItem;
import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioPlayer;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.Player;
import com.plekhanov.game.gameObjects.BackGround;

import java.util.Collections;



public class Level_1 {

    public static void load(int width, int height, Model model) {

        // Игрок
        Player player = new Player(500, 900, 0, 0, 900, model);
        model.getGameObjects().add(player);
        model.setPlayer(player);

        // Враги
       // gameObjects.add(new Carrion(2000, 965, -0.5, 0, model));  //Carrion
//        gameObjects.add(new Husk(2200, 580, -0.3, 0, model));  //Husk
//        gameObjects.add(new Gargoly(2200, 370, -1, 0, model));  //Gargoly
        model.getGameObjects().add(new Ghost(2000, 370, -0.7, 0, model));
        // gameObjects.add(new Zombie(2000, 913, -0.7, 0, model));
       //  gameObjects.add(new Archer(2000, 500, -0.5, 0, model));
       // gameObjects.add(new Necromancer(2000, 913, -0.6, 0, model));
        model.getGameObjects().add(new Druid(2000, 913, -0.3, 0, model));
       // gameObjects.add(new FireElemental(2200, 500, 0,0, model));

        // Предметы

        model.getGameObjects().add(new HeartItem(1000, 500, 0, 0, model));
        model.getGameObjects().add(new HeartItem(500, 500, 0, 0, model));

        // Музыка
        AudioPlayer audioPlayer = new AudioPlayer();
        AudioPlayer.stopAllMusic();
        audioPlayer.play(AudioHelper.BACKGROUNDTRACK_1, 15);

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
