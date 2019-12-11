package com.plekhanov.game.gameLevels;

import com.plekhanov.game.gameObjects.enemies.Ghost;
import com.plekhanov.game.gameObjects.enemies.Zombie;
import com.plekhanov.game.gameObjects.enemies.archer.Archer;
import com.plekhanov.game.gameObjects.enemies.druid.Druid;
import com.plekhanov.game.gameObjects.enemies.fire_elemental.FireElemental;
import com.plekhanov.game.gameObjects.enemies.gargoly.Gargoly;
import com.plekhanov.game.gameObjects.enemies.husk.Husk;
import com.plekhanov.game.gameObjects.enemies.necromancer.Necromancer;
import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioPlayer;
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
        List<GameObject> gameObjects = new CopyOnWriteArrayList<>();
        model.setGameObjects(gameObjects);

        int y = 225; // смещение фона вверх
        int imageHeight = 500;  // растягивание фона

        //статический фон
        gameObjects.add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundImage1(), width, height + imageHeight, 1));  //background1
        gameObjects.add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundImage2(), width, height + imageHeight, 2));  //background2
        gameObjects.add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundImage3(), width, height + imageHeight, 3));  //background3
        gameObjects.add(new BackGround(width / 2, height / 2 - y, 0, 0, ImageLoader.getBackgroundImage4(), width, height + imageHeight, 4));  //background4

        //динамический фон
        gameObjects.add(new BackGround(width / 2, height / 2 - y, -0.1, 0, ImageLoader.getBackgroundImage5(), width, height + imageHeight, 5));  //background5
        gameObjects.add(new BackGround(width / 2 + width, height / 2 - y, -0.1, 0, ImageLoader.getBackgroundImage5(), width, height + imageHeight, 5));  //background5
        gameObjects.add(new BackGround(width / 2, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundImage6(), width, height + imageHeight, 6));  //background6
        gameObjects.add(new BackGround(width / 2 + width, height / 2 - y, -0.2, 0, ImageLoader.getBackgroundImage6(), width, height + imageHeight, 6));  //background6
        gameObjects.add(new BackGround(width / 2, height / 2 - y, -0.3, 0, ImageLoader.getBackgroundImage7(), width, height + imageHeight, 7));  //background7
        gameObjects.add(new BackGround(width / 2 + width, height / 2 - y, -0.3, 0, ImageLoader.getBackgroundImage7(), width, height + imageHeight, 7));  //background7
        gameObjects.add(new BackGround(width / 2, height / 2 - y, -0.3, 0, ImageLoader.getBackgroundImage8(), width, height + imageHeight, 8));  //background8
        gameObjects.add(new BackGround(width / 2 + width, height / 2 - y, -0.3, 0, ImageLoader.getBackgroundImage8(), width, height + imageHeight, 8));  //background8
        gameObjects.add(new BackGround(width / 2, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundImage9(), width, height + imageHeight, 9));  //background9
        gameObjects.add(new BackGround(width / 2 + width, height / 2 - y, -0.5, 0, ImageLoader.getBackgroundImage9(), width, height + imageHeight, 9));  //background9


        // Игрок
        Player player = new Player(500, 900, 0, 0, 900, model);
        gameObjects.add(player);
        model.setPlayer(player);

        // Враги
       // gameObjects.add(new Carrion(2000, 965, -0.5, 0, model));  //Carrion
//        gameObjects.add(new Husk(2200, 580, -0.3, 0, model));  //Husk
//        gameObjects.add(new Gargoly(2200, 370, -1, 0, model));  //Gargoly
     //  gameObjects.add(new Ghost(2000, 370, -0.7, 0, model));
        // gameObjects.add(new Zombie(2000, 913, -0.7, 0, model));
       //  gameObjects.add(new Archer(2000, 500, -0.5, 0, model));
       // gameObjects.add(new Necromancer(2000, 913, -0.6, 0, model));
        gameObjects.add(new Druid(2000, 913, -0.3, 0, model));
       // gameObjects.add(new FireElemental(2200, 500, 0,0, model));

        // Предметы

        // Музыка
        AudioPlayer audioPlayer = new AudioPlayer();
        AudioPlayer.stopAllMusic();
        audioPlayer.play(AudioHelper.backGroundTrack_1(), 40);

        Collections.sort(gameObjects);
    }


}
