package com.plekhanov.game.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ImageLoader {

    private static BufferedImage invisiblePicture;

    private static BufferedImage menu1;
    private static BufferedImage menu2;
    private static BufferedImage menu3;
    private static BufferedImage menu4;
    private static BufferedImage menuScreenSize100;
    private static BufferedImage menuScreenSize80;
    private static BufferedImage menuScreenSize60;
    private static BufferedImage menuScreenSize50;
    private static BufferedImage menuControls;

    private static BufferedImage backgroundImage1;
    private static BufferedImage backgroundImage2;
    private static BufferedImage backgroundImage3;
    private static BufferedImage backgroundImage4;
    private static BufferedImage backgroundImage5;
    private static BufferedImage backgroundImage6;
    private static BufferedImage backgroundImage7;
    private static BufferedImage backgroundImage8;
    private static BufferedImage backgroundImage9;

    private static BufferedImage backgroundLevel2Image1;
    private static BufferedImage backgroundLevel2Image2;
    private static BufferedImage backgroundLevel2Image3;
    private static BufferedImage backgroundLevel2Image4;
    private static BufferedImage backgroundLevel2Image5;

    private static BufferedImage backgroundLevel3Image1;
    private static BufferedImage backgroundLevel3Image2;
    private static BufferedImage backgroundLevel3Image3;
    private static BufferedImage backgroundLevel3Image4;
    private static BufferedImage backgroundLevel3Image5;
    private static BufferedImage backgroundLevel3Image6;
    private static BufferedImage backgroundLevel3Image7;
    private static BufferedImage backgroundLevel3Image8;
    private static BufferedImage backgroundLevel3Image9;

    private static BufferedImage gameOverImage;
    private static BufferedImage energyBar;
    private static BufferedImage BombImage;
    private static BufferedImage ScreamerImage;

    private static BufferedImage enemyCarrionImage;
    private static BufferedImage hungryCarrion;
    private static BufferedImage enemyHuskImage;
    private static BufferedImage enemyHuskShootImage;
    private static BufferedImage enemyPestilenceImage;
    private static BufferedImage fireBallImage;
    private static BufferedImage enemyMummyZombieLeftImage;
    private static BufferedImage enemyMummyZombieRightImage;

    private static BufferedImage enemyMummyZombieRageLeftImage_1;
    private static BufferedImage enemyMummyZombieRageLeftImage_2;
    private static BufferedImage enemyMummyZombieRageRightImage_1;
    private static BufferedImage enemyMummyZombieRageRightImage_2;

    private static BufferedImage enemyFoxMummyWalkImage_1;
    private static BufferedImage enemyFoxMummyWalkImage_2;
    private static BufferedImage enemyFoxMummyWalkImage_3;
    private static BufferedImage enemyFoxMummyWalkImage_4;
    private static BufferedImage enemyFoxMummyShoot_Image;

    private static BufferedImage mummyFireBallImage_1;
    private static BufferedImage mummyFireBallImage_2;
    private static BufferedImage mummyFireBallImage_3;
    private static BufferedImage mummyFireBallImage_4;
    private static BufferedImage mummyFireBallImage_5;
    private static BufferedImage mummyFireBallImage_6;
    private static BufferedImage mummyFireBallImage_7;
    private static BufferedImage mummyFireBallImage_8;
    private static BufferedImage mummyFireBallImage_9;
    private static BufferedImage mummyFireBallImage_10;
    private static BufferedImage mummyFireBallImage_11;
    private static BufferedImage mummyFireBallImage_12;
    private static BufferedImage mummyFireBallImage_13;
    private static BufferedImage mummyFireBallImage_14;
    private static BufferedImage mummyFireBallImage_15;
    private static BufferedImage mummyFireBallImage_16;

    private static BufferedImage enemyOgreWalkImage_1;
    private static BufferedImage enemyOgreWalkImage_2;
    private static BufferedImage enemyOgreWalkImage_3;
    private static BufferedImage enemyOgreWalkImage_4;
    private static BufferedImage enemyOgreWalkImage_5;
    private static BufferedImage enemyOgreWalkImage_6;
    private static BufferedImage enemyOgreWalkImage_7;
    private static BufferedImage enemyOgreJumpImage_1;
    private static BufferedImage enemyOgreJumpImage_2;
    private static BufferedImage enemyOgreJumpImage_3;
    private static BufferedImage enemyOgreJumpImage_4;
    private static BufferedImage enemyOgreJumpImage_5;
    private static BufferedImage enemyOgreJumpImage_6;
    private static BufferedImage enemyOgreJumpImage_7;

    private static BufferedImage enemyGenieMoveLeftImage_1;
    private static BufferedImage enemyGenieMoveLeftImage_2;
    private static BufferedImage enemyGenieMoveLeftImage_3;
    private static BufferedImage enemyGenieMoveLeftImage_4;
    private static BufferedImage enemyGenieMoveLeftImage_5;

    private static BufferedImage enemyGenieMoveRightImage_1;
    private static BufferedImage enemyGenieMoveRightImage_2;
    private static BufferedImage enemyGenieMoveRightImage_3;
    private static BufferedImage enemyGenieMoveRightImage_4;
    private static BufferedImage enemyGenieMoveRightImage_5;

    private static BufferedImage enemyGenieCastImage_1;
    private static BufferedImage enemyGenieCastImage_2;
    private static BufferedImage enemyGenieCastImage_3;

    private static BufferedImage genieSwordMoveRightImage_1;
    private static BufferedImage genieSwordMoveRightImage_2;
    private static BufferedImage genieSwordMoveRightImage_3;
    private static BufferedImage genieSwordMoveRightImage_4;
    private static BufferedImage genieSwordMoveRightImage_5;
    private static BufferedImage genieSwordMoveRightImage_6;
    private static BufferedImage genieSwordMoveRightImage_7;
    private static BufferedImage genieSwordMoveRightImage_8;
    private static BufferedImage genieSwordMoveRightImage_9;
    private static BufferedImage genieSwordMoveRightImage_10;
    private static BufferedImage genieSwordMoveRightImage_11;
    private static BufferedImage genieSwordMoveRightImage_12;
    private static BufferedImage genieSwordMoveRightImage_13;
    private static BufferedImage genieSwordMoveRightImage_14;
    private static BufferedImage genieSwordMoveRightImage_15;
    private static BufferedImage genieSwordMoveRightImage_16;

    private static BufferedImage genieSwordMoveLeftImage_1;
    private static BufferedImage genieSwordMoveLeftImage_2;
    private static BufferedImage genieSwordMoveLeftImage_3;
    private static BufferedImage genieSwordMoveLeftImage_4;
    private static BufferedImage genieSwordMoveLeftImage_5;
    private static BufferedImage genieSwordMoveLeftImage_6;
    private static BufferedImage genieSwordMoveLeftImage_7;
    private static BufferedImage genieSwordMoveLeftImage_8;
    private static BufferedImage genieSwordMoveLeftImage_9;
    private static BufferedImage genieSwordMoveLeftImage_10;
    private static BufferedImage genieSwordMoveLeftImage_11;
    private static BufferedImage genieSwordMoveLeftImage_12;
    private static BufferedImage genieSwordMoveLeftImage_13;
    private static BufferedImage genieSwordMoveLeftImage_14;
    private static BufferedImage genieSwordMoveLeftImage_15;
    private static BufferedImage genieSwordMoveLeftImage_16;

    private static BufferedImage sawFireBallImage_1;
    private static BufferedImage sawFireBallImage_2;
    private static BufferedImage sawFireBallImage_3;
    private static BufferedImage sawFireBallImage_4;
    private static BufferedImage sawFireBallImage_5;
    private static BufferedImage sawFireBallImage_6;
    private static BufferedImage sawFireBallImage_7;
    private static BufferedImage sawFireBallImage_8;
    private static BufferedImage sawFireBallImage_9;
    private static BufferedImage sawFireBallImage_10;
    private static BufferedImage sawFireBallImage_11;
    private static BufferedImage sawFireBallImage_12;
    private static BufferedImage sawFireBallImage_13;
    private static BufferedImage sawFireBallImage_14;
    private static BufferedImage sawFireBallImage_15;
    private static BufferedImage sawFireBallImage_16;

    //Gargoly
    private static BufferedImage gargolyFlyRight_1;
    private static BufferedImage gargolyFlyRight_2;
    private static BufferedImage gargolyFlyRight_3;
    private static BufferedImage gargolyFlyRight_4;
    private static BufferedImage gargolyFlyRight_5;
    private static BufferedImage gargolyFlyLeft_1;
    private static BufferedImage gargolyFlyLeft_2;
    private static BufferedImage gargolyFlyLeft_3;
    private static BufferedImage gargolyFlyLeft_4;
    private static BufferedImage gargolyFlyLeft_5;
    private static BufferedImage gargolyWalkRight_1;
    private static BufferedImage gargolyWalkRight_2;
    private static BufferedImage gargolyWalkRight_3;
    private static BufferedImage gargolyWalkLeft_1;
    private static BufferedImage gargolyWalkLeft_2;
    private static BufferedImage gargolyWalkLeft_3;
    private static BufferedImage gargolyJumpLeft_1;
    private static BufferedImage gargolyJumpLeft_2;
    private static BufferedImage gargolyJumpRight_1;
    private static BufferedImage gargolyJumpRight_2;

    //GargolyFireBall
    private static BufferedImage gargolyFireBall_1;
    private static BufferedImage gargolyFireBall_2;


    //Ghost
    private static BufferedImage ghostFlyRight_1;
    private static BufferedImage ghostFlyRight_2;
    private static BufferedImage ghostFlyRight_3;
    private static BufferedImage ghostFlyRight_4;
    private static BufferedImage ghostFlyLeft_1;
    private static BufferedImage ghostFlyLeft_2;
    private static BufferedImage ghostFlyLeft_3;
    private static BufferedImage ghostFlyLeft_4;

    private static BufferedImage eagleFlyRight_1;
    private static BufferedImage eagleFlyRight_2;
    private static BufferedImage eagleFlyLeft_1;
    private static BufferedImage eagleFlyLeft_2;

    //Zombie
    private static BufferedImage zombieWalk_1;
    private static BufferedImage zombieWalk_2;
    private static BufferedImage zombieWalk_3;

    //FireElemental
    private static BufferedImage fireElementalFlyRight_1;
    private static BufferedImage fireElementalFlyRight_2;
    private static BufferedImage fireElementalFlyRight_3;
    private static BufferedImage fireElementalFlyLeft_1;
    private static BufferedImage fireElementalFlyLeft_2;
    private static BufferedImage fireElementalFlyLeft_3;

    private static BufferedImage fireElementalIdleRight_1;
    private static BufferedImage fireElementalIdleRight_2;
    private static BufferedImage fireElementalIdleRight_3;
    private static BufferedImage fireElementalIdleLeft_1;
    private static BufferedImage fireElementalIdleLeft_2;
    private static BufferedImage fireElementalIdleLeft_3;

    private static BufferedImage fireElementalFireBall_1;
    private static BufferedImage fireElementalFireBall_2;
    private static BufferedImage fireElementalFireBall_3;
    private static BufferedImage fireElementalFireBall_4;
    private static BufferedImage fireElementalFireBall_5;
    private static BufferedImage fireElementalFireBall_6;
    private static BufferedImage fireElementalFireBall_7;
    private static BufferedImage fireElementalFireBall_8;
    private static BufferedImage fireElementalFireBall_9;
    private static BufferedImage fireElementalFireBall_10;
    private static BufferedImage fireElementalFireBall_11;
    private static BufferedImage fireElementalFireBall_12;
    private static BufferedImage fireElementalFireBall_13;
    private static BufferedImage fireElementalFireBall_14;
    private static BufferedImage fireElementalFireBall_15;
    private static BufferedImage fireElementalFireBall_16;

    //Archer
    private static BufferedImage archer_shoot_1;
    private static BufferedImage archer_shoot_2;
    private static BufferedImage archer_shoot_3;
    private static BufferedImage archer_shoot_4;
    private static BufferedImage archer_shoot_5;
    private static BufferedImage archer_shoot_6;

    private static BufferedImage archer_jump_left;
    private static BufferedImage archer_jump_right;

    private static BufferedImage archer_run_left_1;
    private static BufferedImage archer_run_left_2;
    private static BufferedImage archer_run_left_3;

    private static BufferedImage archer_run_right_1;
    private static BufferedImage archer_run_right_2;
    private static BufferedImage archer_run_right_3;

    private static BufferedImage arrow;

    private static BufferedImage rope;

    //Necromancer
    private static BufferedImage necromancer_walk_left_1;
    private static BufferedImage necromancer_walk_left_2;
    private static BufferedImage necromancer_walk_left_3;
    private static BufferedImage necromancer_walk_right_1;
    private static BufferedImage necromancer_walk_right_2;
    private static BufferedImage necromancer_walk_right_3;
    private static BufferedImage necromancer_cast_1;
    private static BufferedImage necromancer_cast_2;
    private static BufferedImage necromancer_cast_3;
    private static BufferedImage necromancer_cast_4;
    private static BufferedImage necromancer_cast_vacuum_1;
    private static BufferedImage necromancer_cast_vacuum_2;
    private static BufferedImage necromancer_cast_vacuum_3;

    //Druid
    private static BufferedImage druid_walk_right_1;
    private static BufferedImage druid_walk_right_2;
    private static BufferedImage druid_walk_right_3;
    private static BufferedImage druid_shoot_right_1;
    private static BufferedImage druid_shoot_right_2;
    private static BufferedImage druid_shoot_right_3;
    private static BufferedImage druid_fire_ball_right_1;
    private static BufferedImage druid_summon_right_1;
    private static BufferedImage druid_summon_right_2;
    private static BufferedImage druid_summon_right_3;
    private static BufferedImage druid_summon_right_4;
    private static BufferedImage druid_summon_right_5;
    private static BufferedImage druid_walk_left_1;
    private static BufferedImage druid_walk_left_2;
    private static BufferedImage druid_walk_left_3;
    private static BufferedImage druid_shoot_left_1;
    private static BufferedImage druid_shoot_left_2;
    private static BufferedImage druid_shoot_left_3;
    private static BufferedImage druid_fire_ball_left_1;
    private static BufferedImage druid_summon_left_1;
    private static BufferedImage druid_summon_left_2;
    private static BufferedImage druid_summon_left_3;
    private static BufferedImage druid_summon_left_4;
    private static BufferedImage druid_summon_left_5;

    //Skeleton
    private static BufferedImage skeleton_walk_left_1;
    private static BufferedImage skeleton_walk_left_2;
    private static BufferedImage skeleton_walk_left_3;
    private static BufferedImage skeleton_walk_right_1;
    private static BufferedImage skeleton_walk_right_2;
    private static BufferedImage skeleton_walk_right_3;
    private static BufferedImage skeleton_appear_left_1;
    private static BufferedImage skeleton_appear_left_2;
    private static BufferedImage skeleton_appear_left_3;

    //Player
    private static BufferedImage playerImage;
    private static BufferedImage playerWoundedImage;
    private static BufferedImage playerMoveRightImage;
    private static BufferedImage playerMoveRightWoundedImage;
    private static BufferedImage playerMoveLeftImage;
    private static BufferedImage playerMoveLeftWoundedImage;
    private static BufferedImage playerJumpImage;
    private static BufferedImage playerJumpWoundedImage;

    private static BufferedImage playerImageLookLeft;
    private static BufferedImage playerWoundedImageLookLeft;
    private static BufferedImage playerMoveRightImageLookLeft;
    private static BufferedImage playerMoveRightWoundedImageLookLeft;
    private static BufferedImage playerMoveLeftImageLookLeft;
    private static BufferedImage playerMoveLeftWoundedImageLookLeft;
    private static BufferedImage playerJumpImageLookLeft;
    private static BufferedImage playerJumpWoundedImageLookLeft;


    //Player FireBall
    private static BufferedImage playerFireBallImage_1;
    private static BufferedImage playerFireBallImage_2;
    private static BufferedImage playerFireBallImage_1_Left;
    private static BufferedImage playerFireBallImage_2_Left;

    private static BufferedImage heartImage;

    private static final String FS = File.separator;
    private static String PATH_TO_RESOURCE = "src" + FS + "main" + FS + "resources" + FS + "images" + FS;


    static {

        try {

            invisiblePicture = ImageIO.read(new File(PATH_TO_RESOURCE + "menu" + FS + "Invisible_picture.png"));
            menu1 = ImageIO.read(new File(PATH_TO_RESOURCE + "menu" + FS + "Menu1.png"));
            menu2 = ImageIO.read(new File(PATH_TO_RESOURCE + "menu" + FS + "Menu2.png"));
            menu3 = ImageIO.read(new File(PATH_TO_RESOURCE + "menu" + FS + "Menu3.png"));
            menu4 = ImageIO.read(new File(PATH_TO_RESOURCE + "menu" + FS + "Menu4.png"));
            menuScreenSize100 = ImageIO.read(new File(PATH_TO_RESOURCE + "menu" + FS + "ScreenSize_100.png"));
            menuScreenSize80 = ImageIO.read(new File(PATH_TO_RESOURCE + "menu" + FS + "ScreenSize_80.png"));
            menuScreenSize60 = ImageIO.read(new File(PATH_TO_RESOURCE + "menu" + FS + "ScreenSize_60.png"));
            menuScreenSize50 = ImageIO.read(new File(PATH_TO_RESOURCE + "menu" + FS + "ScreenSize_50.png"));
            menuControls = ImageIO.read(new File(PATH_TO_RESOURCE + "menu" + FS + "Controls.png"));


            //Картинки для уровня 1

            // Статический фон
            backgroundImage1 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_1" + FS + "Layer_0010_1.png"));
            backgroundImage2 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_1" + FS + "Layer_0009_2.png"));
            backgroundImage3 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_1" + FS + "Layer_0008_3.png"));
            backgroundImage4 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_1" + FS + "Layer_0006_4.png"));

            // Динамический фон
            backgroundImage5 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_1" + FS + "Layer_0005_5.png"));
            backgroundImage6 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_1" + FS + "Layer_0003_6.png"));
            backgroundImage7 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_1" + FS + "Layer_0002_7.png"));
            backgroundImage8 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_1" + FS + "Layer_0001_8.png"));
            backgroundImage9 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_1" + FS + "Layer_0000_9.png"));

            //Конец игры
            gameOverImage = ImageIO.read(new File(PATH_TO_RESOURCE + "Game_Over.png"));
            //Полоса энергии
            energyBar = ImageIO.read(new File(PATH_TO_RESOURCE + "EnergyBar.png"));

            // Враги
            fireBallImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "FireBall.png"));
            enemyCarrionImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "Carrion.png"));
            enemyHuskImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "Husk.png"));
            enemyHuskShootImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "EnemyHuskShoot.png"));
            hungryCarrion = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "carrion2.png"));
            enemyPestilenceImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "Pestilence.png"));
            enemyMummyZombieLeftImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "mummy_zombie" + FS + "MummyZombieLeft.png"));
            enemyMummyZombieRightImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "mummy_zombie" + FS + "MummyZombieRight.png"));

            // Mummy zombie
            enemyMummyZombieRageLeftImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "mummy_zombie" + FS + "MummyZombieRageLeft_1.png"));
            enemyMummyZombieRageLeftImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "mummy_zombie" + FS + "MummyZombieRageLeft_2.png"));

            enemyMummyZombieRageRightImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "mummy_zombie" + FS + "MummyZombieRageRight_1.png"));
            enemyMummyZombieRageRightImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "mummy_zombie" + FS + "MummyZombieRageRight_2.png"));

            //Fox Mummy
            enemyFoxMummyWalkImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "FoxMummyWalk_1.png"));
            enemyFoxMummyWalkImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "FoxMummyWalk_2.png"));
            enemyFoxMummyWalkImage_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "FoxMummyWalk_3.png"));
            enemyFoxMummyWalkImage_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "FoxMummyWalk_4.png"));
            enemyFoxMummyShoot_Image = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "FoxMummyShoot.png"));

            mummyFireBallImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_1.png"));
            mummyFireBallImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_2.png"));
            mummyFireBallImage_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_3.png"));
            mummyFireBallImage_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_4.png"));
            mummyFireBallImage_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_5.png"));
            mummyFireBallImage_6 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_6.png"));
            mummyFireBallImage_7 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_7.png"));
            mummyFireBallImage_8 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_8.png"));
            mummyFireBallImage_9 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_9.png"));
            mummyFireBallImage_10 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_10.png"));
            mummyFireBallImage_11 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_11.png"));
            mummyFireBallImage_12 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_12.png"));
            mummyFireBallImage_13 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_13.png"));
            mummyFireBallImage_14 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_14.png"));
            mummyFireBallImage_15 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_15.png"));
            mummyFireBallImage_16 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fox_mummy" + FS + "mummy_fire_balls" + FS + "MummyFireBall_16.png"));

            // Enemy Ogre
            enemyOgreWalkImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "walk" + FS + "ogre_walk_1.png"));
            enemyOgreWalkImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "walk" + FS + "ogre_walk_2.png"));
            enemyOgreWalkImage_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "walk" + FS + "ogre_walk_3.png"));
            enemyOgreWalkImage_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "walk" + FS + "ogre_walk_4.png"));
            enemyOgreWalkImage_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "walk" + FS + "ogre_walk_5.png"));
            enemyOgreWalkImage_6 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "walk" + FS + "ogre_walk_6.png"));
            enemyOgreWalkImage_7 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "walk" + FS + "ogre_walk_7.png"));

            enemyOgreJumpImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "jump" + FS + "ogre_jump_1.png"));
            enemyOgreJumpImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "jump" + FS + "ogre_jump_2.png"));
            enemyOgreJumpImage_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "jump" + FS + "ogre_jump_3.png"));
            enemyOgreJumpImage_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "jump" + FS + "ogre_jump_4.png"));
            enemyOgreJumpImage_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "jump" + FS + "ogre_jump_5.png"));
            enemyOgreJumpImage_6 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "jump" + FS + "ogre_jump_6.png"));
            enemyOgreJumpImage_7 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ogre" + FS + "jump" + FS + "ogre_jump_7.png"));

            // Genie
            enemyGenieMoveLeftImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieMoveLeft_1.png"));
            enemyGenieMoveLeftImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieMoveLeft_2.png"));
            enemyGenieMoveLeftImage_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieMoveLeft_3.png"));
            enemyGenieMoveLeftImage_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieMoveLeft_4.png"));
            enemyGenieMoveLeftImage_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieMoveLeft_5.png"));

            enemyGenieMoveRightImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieMoveRight_1.png"));
            enemyGenieMoveRightImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieMoveRight_2.png"));
            enemyGenieMoveRightImage_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieMoveRight_3.png"));
            enemyGenieMoveRightImage_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieMoveRight_4.png"));
            enemyGenieMoveRightImage_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieMoveRight_5.png"));

            enemyGenieCastImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieCast_1.png"));
            enemyGenieCastImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieCast_2.png"));
            enemyGenieCastImage_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "GenieCast_3.png"));

            genieSwordMoveLeftImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_1.png"));
            genieSwordMoveLeftImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_2.png"));
            genieSwordMoveLeftImage_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_3.png"));
            genieSwordMoveLeftImage_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_4.png"));
            genieSwordMoveLeftImage_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_5.png"));
            genieSwordMoveLeftImage_6 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_6.png"));
            genieSwordMoveLeftImage_7 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_7.png"));
            genieSwordMoveLeftImage_8 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_8.png"));
            genieSwordMoveLeftImage_9 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_9.png"));
            genieSwordMoveLeftImage_10 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_10.png"));
            genieSwordMoveLeftImage_11 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_11.png"));
            genieSwordMoveLeftImage_12 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_12.png"));
            genieSwordMoveLeftImage_13 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_13.png"));
            genieSwordMoveLeftImage_14 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_14.png"));
            genieSwordMoveLeftImage_15 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_15.png"));
            genieSwordMoveLeftImage_16 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_left" + FS + "GenieSwordMoveLeft_16.png"));

            genieSwordMoveRightImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_1.png"));
            genieSwordMoveRightImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_2.png"));
            genieSwordMoveRightImage_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_3.png"));
            genieSwordMoveRightImage_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_4.png"));
            genieSwordMoveRightImage_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_5.png"));
            genieSwordMoveRightImage_6 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_6.png"));
            genieSwordMoveRightImage_7 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_7.png"));
            genieSwordMoveRightImage_8 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_8.png"));
            genieSwordMoveRightImage_9 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_9.png"));
            genieSwordMoveRightImage_10 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_10.png"));
            genieSwordMoveRightImage_11 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_11.png"));
            genieSwordMoveRightImage_12 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_12.png"));
            genieSwordMoveRightImage_13 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_13.png"));
            genieSwordMoveRightImage_14 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_14.png"));
            genieSwordMoveRightImage_15 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_15.png"));
            genieSwordMoveRightImage_16 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "genie_sword_move_right" + FS + "GenieSwordMoveRight_16.png"));

            // SawFireBall
            sawFireBallImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_1.png"));
            sawFireBallImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_2.png"));
            sawFireBallImage_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_3.png"));
            sawFireBallImage_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_4.png"));
            sawFireBallImage_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_5.png"));
            sawFireBallImage_6 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_6.png"));
            sawFireBallImage_7 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_7.png"));
            sawFireBallImage_8 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_8.png"));
            sawFireBallImage_9 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_9.png"));
            sawFireBallImage_10 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_10.png"));
            sawFireBallImage_11 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_11.png"));
            sawFireBallImage_12 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_12.png"));
            sawFireBallImage_13 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_13.png"));
            sawFireBallImage_14 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_14.png"));
            sawFireBallImage_15 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_15.png"));
            sawFireBallImage_16 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "genie" + FS + "saw_fire_balls" + FS + "SawFireBall_16.png"));

            //Gargoly
            gargolyFlyRight_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "right" + FS + "fly" + FS + "gargoly_fly_right_1.png"));
            gargolyFlyRight_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "right" + FS + "fly" + FS + "gargoly_fly_right_2.png"));
            gargolyFlyRight_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "right" + FS + "fly" + FS + "gargoly_fly_right_3.png"));
            gargolyFlyRight_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "right" + FS + "fly" + FS + "gargoly_fly_right_4.png"));
            gargolyFlyRight_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "right" + FS + "fly" + FS + "gargoly_fly_right_5.png"));
            gargolyFlyLeft_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "left" + FS + "fly" + FS + "gargoly_fly_left_1.png"));
            gargolyFlyLeft_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "left" + FS + "fly" + FS + "gargoly_fly_left_2.png"));
            gargolyFlyLeft_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "left" + FS + "fly" + FS + "gargoly_fly_left_3.png"));
            gargolyFlyLeft_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "left" + FS + "fly" + FS + "gargoly_fly_left_4.png"));
            gargolyFlyLeft_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "left" + FS + "fly" + FS + "gargoly_fly_left_5.png"));
            gargolyWalkRight_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "right" + FS + "walk" + FS + "gargoly_walk_right_1.png"));
            gargolyWalkRight_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "right" + FS + "walk" + FS + "gargoly_walk_right_2.png"));
            gargolyWalkRight_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "right" + FS + "walk" + FS + "gargoly_walk_right_3.png"));
            gargolyWalkLeft_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "left" + FS + "walk" + FS + "gargoly_walk_left_1.png"));
            gargolyWalkLeft_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "left" + FS + "walk" + FS + "gargoly_walk_left_2.png"));
            gargolyWalkLeft_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "left" + FS + "walk" + FS + "gargoly_walk_left_3.png"));
            gargolyJumpLeft_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "left" + FS + "jump" + FS + "gargoly_jump_left_1.png"));
            gargolyJumpLeft_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "left" + FS + "jump" + FS + "gargoly_jump_left_2.png"));
            gargolyJumpRight_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "right" + FS + "jump" + FS + "gargoly_jump_right_1.png"));
            gargolyJumpRight_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "right" + FS + "jump" + FS + "gargoly_jump_right_2.png"));

            gargolyFireBall_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "fireball" + FS + "GargolyFireBall_1.png"));
            gargolyFireBall_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "fireball" + FS + "GargolyFireBall_2.png"));


            //Ghost
            ghostFlyRight_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "right" + FS + "fly" + FS + "GhostFlyRight_1.png"));
            ghostFlyRight_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "right" + FS + "fly" + FS + "GhostFlyRight_2.png"));
            ghostFlyRight_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "right" + FS + "fly" + FS + "GhostFlyRight_3.png"));
            ghostFlyRight_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "right" + FS + "fly" + FS + "GhostFlyRight_4.png"));
            ghostFlyLeft_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "left" + FS + "fly" + FS + "GhostFlyLeft_1.png"));
            ghostFlyLeft_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "left" + FS + "fly" + FS + "GhostFlyLeft_2.png"));
            ghostFlyLeft_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "left" + FS + "fly" + FS + "GhostFlyLeft_3.png"));
            ghostFlyLeft_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "left" + FS + "fly" + FS + "GhostFlyLeft_4.png"));

            //Druid
            druid_walk_right_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "walk" + FS + "druid_walk_right_1.png"));
            druid_walk_right_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "walk" + FS + "druid_walk_right_2.png"));
            druid_walk_right_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "walk" + FS + "druid_walk_right_3.png"));
            druid_shoot_right_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "shoot" + FS + "druid_shoot_right_1.png"));
            druid_shoot_right_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "shoot" + FS + "druid_shoot_right_2.png"));
            druid_shoot_right_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "shoot" + FS + "druid_shoot_right_3.png"));
            druid_fire_ball_right_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "shoot" + FS + "druid_fire_ball_right_1.png"));
            druid_summon_right_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "summon" + FS + "druid_summon_right_1.png"));
            druid_summon_right_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "summon" + FS + "druid_summon_right_2.png"));
            druid_summon_right_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "summon" + FS + "druid_summon_right_3.png"));
            druid_summon_right_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "summon" + FS + "druid_summon_right_4.png"));
            druid_summon_right_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "right" + FS + "summon" + FS + "druid_summon_right_5.png"));
            druid_walk_left_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "walk" + FS + "druid_walk_left_1.png"));
            druid_walk_left_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "walk" + FS + "druid_walk_left_2.png"));
            druid_walk_left_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "walk" + FS + "druid_walk_left_3.png"));
            druid_shoot_left_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "shoot" + FS + "druid_shoot_left_1.png"));
            druid_shoot_left_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "shoot" + FS + "druid_shoot_left_2.png"));
            druid_shoot_left_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "shoot" + FS + "druid_shoot_left_3.png"));
            druid_fire_ball_left_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "shoot" + FS + "druid_fire_ball_left_1.png"));
            druid_summon_left_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "summon" + FS + "druid_summon_left_1.png"));
            druid_summon_left_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "summon" + FS + "druid_summon_left_2.png"));
            druid_summon_left_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "summon" + FS + "druid_summon_left_3.png"));
            druid_summon_left_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "summon" + FS + "druid_summon_left_4.png"));
            druid_summon_left_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "druid" + FS + "left" + FS + "summon" + FS + "druid_summon_left_5.png"));


            //Zombie
            zombieWalk_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "zombie" + FS + "Zombie_walk_1.png"));
            zombieWalk_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "zombie" + FS + "Zombie_walk_2.png"));
            zombieWalk_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "zombie" + FS + "Zombie_walk_3.png"));

            //Archer
            archer_shoot_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "shoot" + FS + "Archer_shoot_1.png"));
            archer_shoot_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "shoot" + FS + "Archer_shoot_2.png"));
            archer_shoot_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "shoot" + FS + "Archer_shoot_3.png"));
            archer_shoot_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "shoot" + FS + "Archer_shoot_4.png"));
            archer_shoot_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "shoot" + FS + "Archer_shoot_5.png"));
            archer_shoot_6 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "shoot" + FS + "Archer_shoot_6.png"));

            archer_jump_left = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "jump" + FS + "Archer_jump_left.png"));
            archer_jump_right = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "jump" + FS + "Archer_jump_right.png"));

            archer_run_left_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "run" + FS + "Archer_run_left_1.png"));
            archer_run_left_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "run" + FS + "Archer_run_left_2.png"));
            archer_run_left_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "run" + FS + "Archer_run_left_3.png"));

            archer_run_right_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "run" + FS + "Archer_run_right_1.png"));
            archer_run_right_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "run" + FS + "Archer_run_right_2.png"));
            archer_run_right_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "run" + FS + "Archer_run_right_3.png"));

            arrow = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "Arrow.png"));
            rope = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "archer" + FS + "Rope.png"));

            //Eagle
            eagleFlyLeft_1 =  ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "eagle" + FS + "left" + FS + "eagle_fly_left1.png"));
            eagleFlyLeft_2 =  ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "eagle" + FS + "left" + FS + "eagle_fly_left2.png"));
            eagleFlyRight_1 =  ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "eagle" + FS + "right" + FS + "eagle_fly_right1.png"));
            eagleFlyRight_2 =  ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "eagle" + FS + "right" + FS + "eagle_fly_right2.png"));

            //FireElemental
            fireElementalFlyRight_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "right" + FS + "fly" + FS + "fire_elemental_fly_right_1.png"));
            fireElementalFlyRight_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "right" + FS + "fly" + FS + "fire_elemental_fly_right_2.png"));
            fireElementalFlyRight_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "right" + FS + "fly" + FS + "fire_elemental_fly_right_3.png"));
            fireElementalFlyLeft_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "left" + FS + "fly" + FS + "fire_elemental_fly_left_1.png"));
            fireElementalFlyLeft_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "left" + FS + "fly" + FS + "fire_elemental_fly_left_2.png"));
            fireElementalFlyLeft_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "left" + FS + "fly" + FS + "fire_elemental_fly_left_3.png"));

            fireElementalIdleRight_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "right" + FS + "idle" + FS + "fire_elemental_idle_right_1.png"));
            fireElementalIdleRight_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "right" + FS + "idle" + FS + "fire_elemental_idle_right_2.png"));
            fireElementalIdleRight_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "right" + FS + "idle" + FS + "fire_elemental_idle_right_3.png"));
            fireElementalIdleLeft_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "left" + FS + "idle" + FS + "fire_elemental_idle_left_1.png"));
            fireElementalIdleLeft_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "left" + FS + "idle" + FS + "fire_elemental_idle_left_2.png"));
            fireElementalIdleLeft_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "left" + FS + "idle" + FS + "fire_elemental_idle_left_3.png"));

            fireElementalFireBall_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_1.png"));
            fireElementalFireBall_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_2.png"));
            fireElementalFireBall_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_3.png"));
            fireElementalFireBall_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_4.png"));
            fireElementalFireBall_5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_5.png"));
            fireElementalFireBall_6 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_6.png"));
            fireElementalFireBall_7 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_7.png"));
            fireElementalFireBall_8 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_8.png"));
            fireElementalFireBall_9 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_9.png"));
            fireElementalFireBall_10 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_10.png"));
            fireElementalFireBall_11 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_11.png"));
            fireElementalFireBall_12 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_12.png"));
            fireElementalFireBall_13 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_13.png"));
            fireElementalFireBall_14 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_14.png"));
            fireElementalFireBall_15 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_15.png"));
            fireElementalFireBall_16 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "fire_elemental" + FS + "fire_elemental_fire_ball" + FS + "fire_elemental_fire_ball_16.png"));


            //Necromancer
            necromancer_walk_left_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "walk" + FS + "Necromancer_walk_left_1.png"));
            necromancer_walk_left_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "walk" + FS + "Necromancer_walk_left_2.png"));
            necromancer_walk_left_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "walk" + FS + "Necromancer_walk_left_3.png"));
            necromancer_walk_right_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "walk" + FS + "Necromancer_walk_right_1.png"));
            necromancer_walk_right_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "walk" + FS + "Necromancer_walk_right_2.png"));
            necromancer_walk_right_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "walk" + FS + "Necromancer_walk_right_3.png"));
            necromancer_cast_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "cast" + FS + "Necromancer_cast_1.png"));
            necromancer_cast_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "cast" + FS + "Necromancer_cast_2.png"));
            necromancer_cast_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "cast" + FS + "Necromancer_cast_3.png"));
            necromancer_cast_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "cast" + FS + "Necromancer_cast_4.png"));
            necromancer_cast_vacuum_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "cast_vacuum" + FS + "Necromancer_cast_vacuum_1.png"));
            necromancer_cast_vacuum_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "cast_vacuum" + FS + "Necromancer_cast_vacuum_2.png"));
            necromancer_cast_vacuum_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "necromancer" + FS + "cast_vacuum" + FS + "Necromancer_cast_vacuum_3.png"));

            //Skeleton
            skeleton_walk_left_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "skeleton" + FS + "walk" + FS + "Skeleton_walk_left_1.png"));
            skeleton_walk_left_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "skeleton" + FS + "walk" + FS + "Skeleton_walk_left_2.png"));
            skeleton_walk_left_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "skeleton" + FS + "walk" + FS + "Skeleton_walk_left_3.png"));
            skeleton_walk_right_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "skeleton" + FS + "walk" + FS + "Skeleton_walk_right_1.png"));
            skeleton_walk_right_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "skeleton" + FS + "walk" + FS + "Skeleton_walk_right_2.png"));
            skeleton_walk_right_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "skeleton" + FS + "walk" + FS + "Skeleton_walk_right_3.png"));
            skeleton_appear_left_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "skeleton" + FS + "appear" + FS + "Skeleton_appear_left_1.png"));
            skeleton_appear_left_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "skeleton" + FS + "appear" + FS + "Skeleton_appear_left_2.png"));
            skeleton_appear_left_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "skeleton" + FS + "appear" + FS + "Skeleton_appear_left_3.png"));

            // Игрок
            playerImage = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "Player.png"));
            playerWoundedImage = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "PlayerWounded.png"));
            playerMoveRightImage = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "PlayerMoveRight.png"));
            playerMoveRightWoundedImage = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "PlayerMoveRightWounded.png"));
            playerMoveLeftImage = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "PlayerMoveLeft.png"));
            playerMoveLeftWoundedImage = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "PlayerMoveLeftWounded.png"));
            playerJumpImage = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "PlayerJump.png"));
            playerJumpWoundedImage = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "PlayerJumpWounded.png"));
            playerImageLookLeft = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "lookLeft" + FS + "Player_LookLeft.png"));
            playerWoundedImageLookLeft = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "lookLeft" + FS + "PlayerWounded_LookLeft.png"));
            playerMoveRightImageLookLeft = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "lookLeft" + FS + "PlayerMoveRight_LookLeft.png"));
            playerMoveRightWoundedImageLookLeft = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "lookLeft" + FS + "PlayerMoveRightWounded_LookLeft.png"));
            playerMoveLeftImageLookLeft = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "lookLeft" + FS + "PlayerMoveLeft_LookLeft.png"));
            playerMoveLeftWoundedImageLookLeft = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "lookLeft" + FS + "PlayerMoveLeftWounded_LookLeft.png"));
            playerJumpImageLookLeft = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "lookLeft" + FS + "PlayerJump_LookLeft.png"));
            playerJumpWoundedImageLookLeft = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "lookLeft" + FS + "PlayerJumpWounded_LookLeft.png"));

            // огненные шары игрока
            playerFireBallImage_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "player_fire_balls" + FS + "PlayerFireBall_1.png"));
            playerFireBallImage_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "player_fire_balls" + FS + "PlayerFireBall_2.png"));
            playerFireBallImage_1_Left = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "player_fire_balls" + FS + "PlayerFireBall_1_Left.png"));
            playerFireBallImage_2_Left = ImageIO.read(new File(PATH_TO_RESOURCE + "player" + FS + "player_fire_balls" + FS + "PlayerFireBall_2_Left.png"));

            // Предметы
            heartImage = ImageIO.read(new File(PATH_TO_RESOURCE + "heart.png"));

            BombImage = ImageIO.read(new File(PATH_TO_RESOURCE +  "items" + FS + "Bomb.png"));
            ScreamerImage = ImageIO.read(new File(PATH_TO_RESOURCE +  "items" + FS + "Screamer.png"));


            //Картинки для уровня 2

            //Фон
            backgroundLevel2Image1 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_2" + FS + "1.png"));
            backgroundLevel2Image2 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_2" + FS + "2.png"));
            backgroundLevel2Image3 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_2" + FS + "3.png"));
            backgroundLevel2Image4 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_2" + FS + "4.png"));
            backgroundLevel2Image5 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_2" + FS + "5.png"));


            //Картинки для уровня 3

            //Фон
            backgroundLevel3Image1 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_3" + FS + "sky.png"));
            backgroundLevel3Image2 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_3" + FS + "rocks.png"));
            backgroundLevel3Image3 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_3" + FS + "clouds_1.png"));
            backgroundLevel3Image4 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_3" + FS + "clouds_2.png"));
            backgroundLevel3Image5 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_3" + FS + "ground_1.png"));
            backgroundLevel3Image6 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_3" + FS + "ground_2.png"));
            backgroundLevel3Image7 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_3" + FS + "ground_3.png"));
            backgroundLevel3Image8 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_3" + FS + "plant.png"));
            backgroundLevel3Image9 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_3" + FS + "layer_01_1920 x 1080.png"));

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static BufferedImage getInvisiblePicture() {
        return invisiblePicture;
    }

    public static BufferedImage getMenu1() {
        return menu1;
    }

    public static BufferedImage getMenu2() {
        return menu2;
    }

    public static BufferedImage getMenu3() {
        return menu3;
    }

    public static BufferedImage getMenu4() {
        return menu4;
    }

    public static BufferedImage getMenuScreenSize100() {
        return menuScreenSize100;
    }

    public static BufferedImage getMenuScreenSize80() {
        return menuScreenSize80;
    }

    public static BufferedImage getMenuScreenSize60() {
        return menuScreenSize60;
    }

    public static BufferedImage getMenuScreenSize50() {
        return menuScreenSize50;
    }

    public static BufferedImage getMenuControls() {
        return menuControls;
    }

    public static BufferedImage getGargolyFireBall_1() {
        return gargolyFireBall_1;
    }

    public static BufferedImage getGargolyFireBall_2() {
        return gargolyFireBall_2;
    }

    public static BufferedImage getGhostFlyLeft_1() {
        return ghostFlyLeft_1;
    }

    public static BufferedImage getGhostFlyLeft_2() {
        return ghostFlyLeft_2;
    }

    public static BufferedImage getGhostFlyLeft_3() {
        return ghostFlyLeft_3;
    }

    public static BufferedImage getGhostFlyLeft_4() {
        return ghostFlyLeft_4;
    }

    public static BufferedImage getGhostFlyRight_1() {
        return ghostFlyRight_1;
    }

    public static BufferedImage getGhostFlyRight_2() {
        return ghostFlyRight_2;
    }

    public static BufferedImage getGhostFlyRight_3() {
        return ghostFlyRight_3;
    }

    public static BufferedImage getGhostFlyRight_4() {
        return ghostFlyRight_4;
    }

    public static BufferedImage getGargolyJumpLeft_1() {
        return gargolyJumpLeft_1;
    }

    public static BufferedImage getGargolyJumpLeft_2() {
        return gargolyJumpLeft_2;
    }

    public static BufferedImage getGargolyJumpRight_1() {
        return gargolyJumpRight_1;
    }

    public static BufferedImage getGargolyJumpRight_2() {
        return gargolyJumpRight_2;
    }

    public static BufferedImage getGargolyWalkRight_1() {
        return gargolyWalkRight_1;
    }

    public static BufferedImage getGargolyWalkRight_2() {
        return gargolyWalkRight_2;
    }

    public static BufferedImage getGargolyWalkRight_3() {
        return gargolyWalkRight_3;
    }

    public static BufferedImage getGargolyWalkLeft_1() {
        return gargolyWalkLeft_1;
    }

    public static BufferedImage getGargolyWalkLeft_2() {
        return gargolyWalkLeft_2;
    }

    public static BufferedImage getGargolyWalkLeft_3() {
        return gargolyWalkLeft_3;
    }

    public static BufferedImage getGargolyFlyLeft_1() {
        return gargolyFlyLeft_1;
    }

    public static BufferedImage getGargolyFlyLeft_2() {
        return gargolyFlyLeft_2;
    }

    public static BufferedImage getGargolyFlyLeft_3() {
        return gargolyFlyLeft_3;
    }

    public static BufferedImage getGargolyFlyLeft_4() {
        return gargolyFlyLeft_4;
    }

    public static BufferedImage getGargolyFlyLeft_5() {
        return gargolyFlyLeft_5;
    }

    public static BufferedImage getPlayerImageLookLeft() {
        return playerImageLookLeft;
    }

    public static BufferedImage getPlayerWoundedImageLookLeft() {
        return playerWoundedImageLookLeft;
    }

    public static BufferedImage getPlayerMoveRightImageLookLeft() {
        return playerMoveRightImageLookLeft;
    }

    public static BufferedImage getPlayerMoveRightWoundedImageLookLeft() {
        return playerMoveRightWoundedImageLookLeft;
    }

    public static BufferedImage getPlayerMoveLeftImageLookLeft() {
        return playerMoveLeftImageLookLeft;
    }

    public static BufferedImage getPlayerMoveLeftWoundedImageLookLeft() {
        return playerMoveLeftWoundedImageLookLeft;
    }

    public static BufferedImage getPlayerJumpImageLookLeft() {
        return playerJumpImageLookLeft;
    }

    public static BufferedImage getPlayerJumpWoundedImageLookLeft() {
        return playerJumpWoundedImageLookLeft;
    }

    public static BufferedImage getGargolyFlyRight_1() {
        return gargolyFlyRight_1;
    }

    public static BufferedImage getGargolyFlyRight_2() {
        return gargolyFlyRight_2;
    }

    public static BufferedImage getGargolyFlyRight_3() {
        return gargolyFlyRight_3;
    }

    public static BufferedImage getGargolyFlyRight_4() {
        return gargolyFlyRight_4;
    }

    public static BufferedImage getGargolyFlyRight_5() {
        return gargolyFlyRight_5;
    }

    public static BufferedImage getPlayerFireBallImage_1_Left() {
        return playerFireBallImage_1_Left;
    }

    public static BufferedImage getPlayerFireBallImage_2_Left() {
        return playerFireBallImage_2_Left;
    }

    public static BufferedImage getEnergyBar() {
        return energyBar;
    }

    public static BufferedImage getBombImage() {
        return BombImage;
    }

    public static BufferedImage getScreamerImage() {
        return ScreamerImage;
    }

    public static BufferedImage getEnemyOgreJumpImage_1() {
        return enemyOgreJumpImage_1;
    }

    public static BufferedImage getEnemyOgreJumpImage_2() {
        return enemyOgreJumpImage_2;
    }

    public static BufferedImage getEnemyOgreJumpImage_3() {
        return enemyOgreJumpImage_3;
    }

    public static BufferedImage getEnemyOgreJumpImage_4() {
        return enemyOgreJumpImage_4;
    }

    public static BufferedImage getEnemyOgreJumpImage_5() {
        return enemyOgreJumpImage_5;
    }

    public static BufferedImage getEnemyOgreJumpImage_6() {
        return enemyOgreJumpImage_6;
    }

    public static BufferedImage getEnemyOgreJumpImage_7() {
        return enemyOgreJumpImage_7;
    }

    public static BufferedImage getEnemyOgreWalkImage_1() {
        return enemyOgreWalkImage_1;
    }

    public static BufferedImage getEnemyOgreWalkImage_2() {
        return enemyOgreWalkImage_2;
    }

    public static BufferedImage getEnemyOgreWalkImage_3() {
        return enemyOgreWalkImage_3;
    }

    public static BufferedImage getEnemyOgreWalkImage_4() {
        return enemyOgreWalkImage_4;
    }

    public static BufferedImage getEnemyOgreWalkImage_5() {
        return enemyOgreWalkImage_5;
    }

    public static BufferedImage getEnemyOgreWalkImage_6() {
        return enemyOgreWalkImage_6;
    }

    public static BufferedImage getEnemyOgreWalkImage_7() {
        return enemyOgreWalkImage_7;
    }

    public static BufferedImage getSawFireBallImage_1() {
        return sawFireBallImage_1;
    }

    public static BufferedImage getSawFireBallImage_2() {
        return sawFireBallImage_2;
    }

    public static BufferedImage getSawFireBallImage_3() {
        return sawFireBallImage_3;
    }

    public static BufferedImage getSawFireBallImage_4() {
        return sawFireBallImage_4;
    }

    public static BufferedImage getSawFireBallImage_5() {
        return sawFireBallImage_5;
    }

    public static BufferedImage getSawFireBallImage_6() {
        return sawFireBallImage_6;
    }

    public static BufferedImage getSawFireBallImage_7() {
        return sawFireBallImage_7;
    }

    public static BufferedImage getSawFireBallImage_8() {
        return sawFireBallImage_8;
    }

    public static BufferedImage getSawFireBallImage_9() {
        return sawFireBallImage_9;
    }

    public static BufferedImage getSawFireBallImage_10() {
        return sawFireBallImage_10;
    }

    public static BufferedImage getSawFireBallImage_11() {
        return sawFireBallImage_11;
    }

    public static BufferedImage getSawFireBallImage_12() {
        return sawFireBallImage_12;
    }

    public static BufferedImage getSawFireBallImage_13() {
        return sawFireBallImage_13;
    }

    public static BufferedImage getSawFireBallImage_14() {
        return sawFireBallImage_14;
    }

    public static BufferedImage getSawFireBallImage_15() {
        return sawFireBallImage_15;
    }

    public static BufferedImage getSawFireBallImage_16() {
        return sawFireBallImage_16;
    }

    public static BufferedImage getEnemyGenieMoveLeftImage_1() {
        return enemyGenieMoveLeftImage_1;
    }

    public static BufferedImage getEnemyGenieMoveLeftImage_2() {
        return enemyGenieMoveLeftImage_2;
    }

    public static BufferedImage getEnemyGenieMoveLeftImage_3() {
        return enemyGenieMoveLeftImage_3;
    }

    public static BufferedImage getEnemyGenieMoveLeftImage_4() {
        return enemyGenieMoveLeftImage_4;
    }

    public static BufferedImage getEnemyGenieMoveLeftImage_5() {
        return enemyGenieMoveLeftImage_5;
    }

    public static BufferedImage getEnemyGenieMoveRightImage_1() {
        return enemyGenieMoveRightImage_1;
    }

    public static BufferedImage getEnemyGenieMoveRightImage_2() {
        return enemyGenieMoveRightImage_2;
    }

    public static BufferedImage getEnemyGenieMoveRightImage_3() {
        return enemyGenieMoveRightImage_3;
    }

    public static BufferedImage getEnemyGenieMoveRightImage_4() {
        return enemyGenieMoveRightImage_4;
    }

    public static BufferedImage getEnemyGenieMoveRightImage_5() {
        return enemyGenieMoveRightImage_5;
    }

    public static BufferedImage getEnemyGenieCastImage_1() {
        return enemyGenieCastImage_1;
    }

    public static BufferedImage getEnemyGenieCastImage_2() {
        return enemyGenieCastImage_2;
    }

    public static BufferedImage getEnemyGenieCastImage_3() {
        return enemyGenieCastImage_3;
    }

    public static BufferedImage getGenieSwordMoveRightImage_1() {
        return genieSwordMoveRightImage_1;
    }

    public static BufferedImage getGenieSwordMoveRightImage_2() {
        return genieSwordMoveRightImage_2;
    }

    public static BufferedImage getGenieSwordMoveRightImage_3() {
        return genieSwordMoveRightImage_3;
    }

    public static BufferedImage getGenieSwordMoveRightImage_4() {
        return genieSwordMoveRightImage_4;
    }

    public static BufferedImage getGenieSwordMoveRightImage_5() {
        return genieSwordMoveRightImage_5;
    }

    public static BufferedImage getGenieSwordMoveRightImage_6() {
        return genieSwordMoveRightImage_6;
    }

    public static BufferedImage getGenieSwordMoveRightImage_7() {
        return genieSwordMoveRightImage_7;
    }

    public static BufferedImage getGenieSwordMoveRightImage_8() {
        return genieSwordMoveRightImage_8;
    }

    public static BufferedImage getGenieSwordMoveRightImage_9() {
        return genieSwordMoveRightImage_9;
    }

    public static BufferedImage getGenieSwordMoveRightImage_10() {
        return genieSwordMoveRightImage_10;
    }

    public static BufferedImage getGenieSwordMoveRightImage_11() {
        return genieSwordMoveRightImage_11;
    }

    public static BufferedImage getGenieSwordMoveRightImage_12() {
        return genieSwordMoveRightImage_12;
    }

    public static BufferedImage getGenieSwordMoveRightImage_13() {
        return genieSwordMoveRightImage_13;
    }

    public static BufferedImage getGenieSwordMoveRightImage_14() {
        return genieSwordMoveRightImage_14;
    }

    public static BufferedImage getGenieSwordMoveRightImage_15() {
        return genieSwordMoveRightImage_15;
    }

    public static BufferedImage getGenieSwordMoveRightImage_16() {
        return genieSwordMoveRightImage_16;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_1() {
        return genieSwordMoveLeftImage_1;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_2() {
        return genieSwordMoveLeftImage_2;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_3() {
        return genieSwordMoveLeftImage_3;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_4() {
        return genieSwordMoveLeftImage_4;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_5() {
        return genieSwordMoveLeftImage_5;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_6() {
        return genieSwordMoveLeftImage_6;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_7() {
        return genieSwordMoveLeftImage_7;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_8() {
        return genieSwordMoveLeftImage_8;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_9() {
        return genieSwordMoveLeftImage_9;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_10() {
        return genieSwordMoveLeftImage_10;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_11() {
        return genieSwordMoveLeftImage_11;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_12() {
        return genieSwordMoveLeftImage_12;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_13() {
        return genieSwordMoveLeftImage_13;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_14() {
        return genieSwordMoveLeftImage_14;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_15() {
        return genieSwordMoveLeftImage_15;
    }

    public static BufferedImage getGenieSwordMoveLeftImage_16() {
        return genieSwordMoveLeftImage_16;
    }

    public static BufferedImage getEnemyCarrionImage() {
        return enemyCarrionImage;
    }

    public static BufferedImage getEnemyHuskImage() {
        return enemyHuskImage;
    }

    public static BufferedImage getEnemyHuskShootImage() {
        return enemyHuskShootImage;
    }

    public static BufferedImage getEnemyPestilenceImage() {
        return enemyPestilenceImage;
    }

    public static BufferedImage getEnemyMummyZombieLeftImage() {
        return enemyMummyZombieLeftImage;
    }

    public static BufferedImage getEnemyMummyZombieRightImage() {
        return enemyMummyZombieRightImage;
    }

    public static BufferedImage getEnemyMummyZombieRageLeftImage_1() {
        return enemyMummyZombieRageLeftImage_1;
    }

    public static BufferedImage getEnemyMummyZombieRageLeftImage_2() {
        return enemyMummyZombieRageLeftImage_2;
    }

    public static BufferedImage getEnemyMummyZombieRageRightImage_1() {
        return enemyMummyZombieRageRightImage_1;
    }

    public static BufferedImage getEnemyMummyZombieRageRightImage_2() {
        return enemyMummyZombieRageRightImage_2;
    }

    public static BufferedImage getEnemyFoxMummyWalkImage_1() {
        return enemyFoxMummyWalkImage_1;
    }

    public static BufferedImage getEnemyFoxMummyWalkImage_2() {
        return enemyFoxMummyWalkImage_2;
    }

    public static BufferedImage getEnemyFoxMummyWalkImage_3() {
        return enemyFoxMummyWalkImage_3;
    }

    public static BufferedImage getEnemyFoxMummyWalkImage_4() {
        return enemyFoxMummyWalkImage_4;
    }

    public static BufferedImage getEnemyFoxMummyShoot_Image() {
        return enemyFoxMummyShoot_Image;
    }

    public static BufferedImage getMummyFireBallImage_1() {
        return mummyFireBallImage_1;
    }

    public static BufferedImage getMummyFireBallImage_2() {
        return mummyFireBallImage_2;
    }

    public static BufferedImage getMummyFireBallImage_3() {
        return mummyFireBallImage_3;
    }

    public static BufferedImage getMummyFireBallImage_4() {
        return mummyFireBallImage_4;
    }

    public static BufferedImage getMummyFireBallImage_5() {
        return mummyFireBallImage_5;
    }

    public static BufferedImage getMummyFireBallImage_6() {
        return mummyFireBallImage_6;
    }

    public static BufferedImage getMummyFireBallImage_7() {
        return mummyFireBallImage_7;
    }

    public static BufferedImage getMummyFireBallImage_8() {
        return mummyFireBallImage_8;
    }

    public static BufferedImage getMummyFireBallImage_9() {
        return mummyFireBallImage_9;
    }

    public static BufferedImage getMummyFireBallImage_10() {
        return mummyFireBallImage_10;
    }

    public static BufferedImage getMummyFireBallImage_11() {
        return mummyFireBallImage_11;
    }

    public static BufferedImage getMummyFireBallImage_12() {
        return mummyFireBallImage_12;
    }

    public static BufferedImage getMummyFireBallImage_13() {
        return mummyFireBallImage_13;
    }

    public static BufferedImage getMummyFireBallImage_14() {
        return mummyFireBallImage_14;
    }

    public static BufferedImage getMummyFireBallImage_15() {
        return mummyFireBallImage_15;
    }

    public static BufferedImage getMummyFireBallImage_16() {
        return mummyFireBallImage_16;
    }

    public static BufferedImage getZombieWalk_1() {
        return zombieWalk_1;
    }

    public static BufferedImage getZombieWalk_2() {
        return zombieWalk_2;
    }

    public static BufferedImage getZombieWalk_3() {
        return zombieWalk_3;
    }

    public static BufferedImage getPlayerImage() {
        return playerImage;
    }

    public static BufferedImage getArcher_shoot_1() {
        return archer_shoot_1;
    }

    public static BufferedImage getArcher_shoot_2() {
        return archer_shoot_2;
    }

    public static BufferedImage getArcher_shoot_3() {
        return archer_shoot_3;
    }

    public static BufferedImage getArcher_shoot_4() {
        return archer_shoot_4;
    }

    public static BufferedImage getArcher_shoot_5() {
        return archer_shoot_5;
    }

    public static BufferedImage getArcher_shoot_6() {
        return archer_shoot_6;
    }

    public static BufferedImage getArcher_jump_left() {
        return archer_jump_left;
    }

    public static BufferedImage getArcher_jump_right() {
        return archer_jump_right;
    }

    public static BufferedImage getArcher_run_left_1() {
        return archer_run_left_1;
    }

    public static BufferedImage getArcher_run_left_2() {
        return archer_run_left_2;
    }

    public static BufferedImage getArcher_run_left_3() {
        return archer_run_left_3;
    }

    public static BufferedImage getArcher_run_right_1() {
        return archer_run_right_1;
    }

    public static BufferedImage getArcher_run_right_2() {
        return archer_run_right_2;
    }

    public static BufferedImage getArcher_run_right_3() {
        return archer_run_right_3;
    }

    public static BufferedImage getArrow() {
        return arrow;
    }

    public static BufferedImage getRope() {
        return rope;
    }

    public static BufferedImage getNecromancer_walk_left_1() {
        return necromancer_walk_left_1;
    }

    public static BufferedImage getNecromancer_walk_left_2() {
        return necromancer_walk_left_2;
    }

    public static BufferedImage getNecromancer_walk_left_3() {
        return necromancer_walk_left_3;
    }

    public static BufferedImage getNecromancer_walk_right_1() {
        return necromancer_walk_right_1;
    }

    public static BufferedImage getNecromancer_walk_right_2() {
        return necromancer_walk_right_2;
    }

    public static BufferedImage getNecromancer_walk_right_3() {
        return necromancer_walk_right_3;
    }

    public static BufferedImage getNecromancer_cast_1() {
        return necromancer_cast_1;
    }

    public static BufferedImage getNecromancer_cast_2() {
        return necromancer_cast_2;
    }

    public static BufferedImage getNecromancer_cast_3() {
        return necromancer_cast_3;
    }

    public static BufferedImage getNecromancer_cast_4() {
        return necromancer_cast_4;
    }

    public static BufferedImage getNecromancer_cast_vacuum_1() {
        return necromancer_cast_vacuum_1;
    }

    public static BufferedImage getNecromancer_cast_vacuum_2() {
        return necromancer_cast_vacuum_2;
    }

    public static BufferedImage getNecromancer_cast_vacuum_3() {
        return necromancer_cast_vacuum_3;
    }

    public static BufferedImage getSkeleton_walk_left_1() {
        return skeleton_walk_left_1;
    }

    public static BufferedImage getSkeleton_walk_left_2() {
        return skeleton_walk_left_2;
    }

    public static BufferedImage getSkeleton_walk_left_3() {
        return skeleton_walk_left_3;
    }

    public static BufferedImage getSkeleton_walk_right_1() {
        return skeleton_walk_right_1;
    }

    public static BufferedImage getSkeleton_walk_right_2() {
        return skeleton_walk_right_2;
    }

    public static BufferedImage getSkeleton_walk_right_3() {
        return skeleton_walk_right_3;
    }

    public static BufferedImage getSkeleton_appear_left_1() {
        return skeleton_appear_left_1;
    }

    public static BufferedImage getSkeleton_appear_left_2() {
        return skeleton_appear_left_2;
    }

    public static BufferedImage getSkeleton_appear_left_3() {
        return skeleton_appear_left_3;
    }

    public static BufferedImage getPlayerMoveRightImage() {
        return playerMoveRightImage;
    }

    public static BufferedImage getPlayerMoveRightWoundedImage() {
        return playerMoveRightWoundedImage;
    }

    public static BufferedImage getPlayerMoveLeftImage() {
        return playerMoveLeftImage;
    }

    public static BufferedImage getPlayerMoveLeftWoundedImage() {
        return playerMoveLeftWoundedImage;
    }

    public static BufferedImage getPlayerJumpImage() {
        return playerJumpImage;
    }

    public static BufferedImage getPlayerJumpWoundedImage() {
        return playerJumpWoundedImage;
    }

    public static BufferedImage getPlayerFireBallImage_1() {
        return playerFireBallImage_1;
    }

    public static BufferedImage getPlayerFireBallImage_2() {
        return playerFireBallImage_2;
    }

    public static BufferedImage getFireBallImage() {
        return fireBallImage;
    }

    public static BufferedImage getBackgroundImage1() {
        return backgroundImage1;
    }

    public static BufferedImage getBackgroundImage2() {
        return backgroundImage2;
    }

    public static BufferedImage getBackgroundImage3() {
        return backgroundImage3;
    }

    public static BufferedImage getBackgroundImage4() {
        return backgroundImage4;
    }

    public static BufferedImage getBackgroundImage5() {
        return backgroundImage5;
    }

    public static BufferedImage getBackgroundImage6() {
        return backgroundImage6;
    }

    public static BufferedImage getBackgroundImage7() {
        return backgroundImage7;
    }

    public static BufferedImage getBackgroundImage8() {
        return backgroundImage8;
    }

    public static BufferedImage getBackgroundImage9() {
        return backgroundImage9;
    }

    public static BufferedImage getHeartImage() {
        return heartImage;
    }

    public static BufferedImage getPlayerWoundedImage() {
        return playerWoundedImage;
    }

    public static BufferedImage getHungryCarrion() {
        return hungryCarrion;
    }

    public static BufferedImage getGameOverImage() {
        return gameOverImage;
    }

    public static BufferedImage getBackgroundLevel2Image1() {
        return backgroundLevel2Image1;
    }

    public static BufferedImage getBackgroundLevel2Image2() {
        return backgroundLevel2Image2;
    }

    public static BufferedImage getBackgroundLevel2Image3() {
        return backgroundLevel2Image3;
    }

    public static BufferedImage getBackgroundLevel2Image4() {
        return backgroundLevel2Image4;
    }

    public static BufferedImage getBackgroundLevel2Image5() {
        return backgroundLevel2Image5;
    }

    public static BufferedImage getBackgroundLevel3Image1() {
        return backgroundLevel3Image1;
    }

    public static BufferedImage getBackgroundLevel3Image2() {
        return backgroundLevel3Image2;
    }

    public static BufferedImage getBackgroundLevel3Image3() {
        return backgroundLevel3Image3;
    }

    public static BufferedImage getBackgroundLevel3Image4() {
        return backgroundLevel3Image4;
    }

    public static BufferedImage getBackgroundLevel3Image5() {
        return backgroundLevel3Image5;
    }

    public static BufferedImage getBackgroundLevel3Image6() {
        return backgroundLevel3Image6;
    }

    public static BufferedImage getBackgroundLevel3Image7() {
        return backgroundLevel3Image7;
    }

    public static BufferedImage getBackgroundLevel3Image8() {
        return backgroundLevel3Image8;
    }

    public static BufferedImage getBackgroundLevel3Image9() {
        return backgroundLevel3Image9;
    }

    public static BufferedImage getFireElementalFlyRight_1() {
        return fireElementalFlyRight_1;
    }

    public static BufferedImage getFireElementalFlyRight_2() {
        return fireElementalFlyRight_2;
    }

    public static BufferedImage getFireElementalFlyRight_3() {
        return fireElementalFlyRight_3;
    }

    public static BufferedImage getFireElementalFlyLeft_1() {
        return fireElementalFlyLeft_1;
    }

    public static BufferedImage getFireElementalFlyLeft_2() {
        return fireElementalFlyLeft_2;
    }

    public static BufferedImage getFireElementalFlyLeft_3() {
        return fireElementalFlyLeft_3;
    }

    public static BufferedImage getFireElementalIdleRight_1() {
        return fireElementalIdleRight_1;
    }

    public static BufferedImage getFireElementalIdleRight_2() {
        return fireElementalIdleRight_2;
    }

    public static BufferedImage getFireElementalIdleRight_3() {
        return fireElementalIdleRight_3;
    }

    public static BufferedImage getFireElementalIdleLeft_1() {
        return fireElementalIdleLeft_1;
    }

    public static BufferedImage getFireElementalIdleLeft_2() {
        return fireElementalIdleLeft_2;
    }

    public static BufferedImage getFireElementalIdleLeft_3() {
        return fireElementalIdleLeft_3;
    }

    public static BufferedImage getFireElementalFireBall_1() {
        return fireElementalFireBall_1;
    }

    public static BufferedImage getFireElementalFireBall_2() {
        return fireElementalFireBall_2;
    }

    public static BufferedImage getFireElementalFireBall_3() {
        return fireElementalFireBall_3;
    }

    public static BufferedImage getFireElementalFireBall_4() {
        return fireElementalFireBall_4;
    }

    public static BufferedImage getFireElementalFireBall_5() {
        return fireElementalFireBall_5;
    }

    public static BufferedImage getFireElementalFireBall_6() {
        return fireElementalFireBall_6;
    }

    public static BufferedImage getFireElementalFireBall_7() {
        return fireElementalFireBall_7;
    }

    public static BufferedImage getFireElementalFireBall_8() {
        return fireElementalFireBall_8;
    }

    public static BufferedImage getFireElementalFireBall_9() {
        return fireElementalFireBall_9;
    }

    public static BufferedImage getFireElementalFireBall_10() {
        return fireElementalFireBall_10;
    }

    public static BufferedImage getFireElementalFireBall_11() {
        return fireElementalFireBall_11;
    }

    public static BufferedImage getFireElementalFireBall_12() {
        return fireElementalFireBall_12;
    }

    public static BufferedImage getFireElementalFireBall_13() {
        return fireElementalFireBall_13;
    }

    public static BufferedImage getFireElementalFireBall_14() {
        return fireElementalFireBall_14;
    }

    public static BufferedImage getFireElementalFireBall_15() {
        return fireElementalFireBall_15;
    }

    public static BufferedImage getFireElementalFireBall_16() {
        return fireElementalFireBall_16;
    }

    public static BufferedImage getDruid_walk_right_1() {
        return druid_walk_right_1;
    }

    public static BufferedImage getDruid_walk_right_2() {
        return druid_walk_right_2;
    }

    public static BufferedImage getDruid_walk_right_3() {
        return druid_walk_right_3;
    }

    public static BufferedImage getDruid_shoot_right_1() {
        return druid_shoot_right_1;
    }

    public static BufferedImage getDruid_shoot_right_2() {
        return druid_shoot_right_2;
    }

    public static BufferedImage getDruid_shoot_right_3() {
        return druid_shoot_right_3;
    }

    public static BufferedImage getDruid_fire_ball_right_1() {
        return druid_fire_ball_right_1;
    }

    public static BufferedImage getDruid_summon_right_1() {
        return druid_summon_right_1;
    }

    public static BufferedImage getDruid_summon_right_2() {
        return druid_summon_right_2;
    }

    public static BufferedImage getDruid_summon_right_3() {
        return druid_summon_right_3;
    }

    public static BufferedImage getDruid_summon_right_4() {
        return druid_summon_right_4;
    }

    public static BufferedImage getDruid_summon_right_5() {
        return druid_summon_right_5;
    }

    public static BufferedImage getDruid_walk_left_1() {
        return druid_walk_left_1;
    }

    public static BufferedImage getDruid_walk_left_2() {
        return druid_walk_left_2;
    }

    public static BufferedImage getDruid_walk_left_3() {
        return druid_walk_left_3;
    }

    public static BufferedImage getDruid_shoot_left_1() {
        return druid_shoot_left_1;
    }

    public static BufferedImage getDruid_shoot_left_2() {
        return druid_shoot_left_2;
    }

    public static BufferedImage getDruid_shoot_left_3() {
        return druid_shoot_left_3;
    }

    public static BufferedImage getDruid_fire_ball_left_1() {
        return druid_fire_ball_left_1;
    }

    public static BufferedImage getDruid_summon_left_1() {
        return druid_summon_left_1;
    }

    public static BufferedImage getDruid_summon_left_2() {
        return druid_summon_left_2;
    }

    public static BufferedImage getDruid_summon_left_3() {
        return druid_summon_left_3;
    }

    public static BufferedImage getDruid_summon_left_4() {
        return druid_summon_left_4;
    }

    public static BufferedImage getDruid_summon_left_5() {
        return druid_summon_left_5;
    }

    public static BufferedImage getEagleFlyRight_1() {
        return eagleFlyRight_1;
    }

    public static BufferedImage getEagleFlyRight_2() {
        return eagleFlyRight_2;
    }

    public static BufferedImage getEagleFlyLeft_1() {
        return eagleFlyLeft_1;
    }

    public static BufferedImage getEagleFlyLeft_2() {
        return eagleFlyLeft_2;
    }
}
