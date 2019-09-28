package com.plekhanov.game.utils;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ImageLoader {

    private static ImagesLevel_1 imagesLevel_1;
    private static ImagesLevel_2 imagesLevel_2;
    private static ImagesLevel_3 imagesLevel_3;

    /**
     * Возвращает объект с картинками для первого уровня
     * Удаляет объекты с картинками для других уровней
     */
    public static ImagesLevel_1 getImagesLevel_1() {
        imagesLevel_2 = null;
        imagesLevel_3 = null;
        if (imagesLevel_1 == null) {
            imagesLevel_1 = new ImagesLevel_1();
        }
        return imagesLevel_1;
    }

    /**
     * Возвращает объект с картинками для второго уровня
     * Удаляет объекты с картинками для других уровней
     */
    public static ImagesLevel_2 getImagesLevel_2() {
        imagesLevel_1 = null;
        imagesLevel_3 = null;
        if (imagesLevel_2 == null) {
            imagesLevel_2 = new ImagesLevel_2();
        }
        return imagesLevel_2;
    }

    /**
     * Возвращает объект с картинками для третьего уровня
     * Удаляет объекты с картинками для других уровней
     */
    public static ImagesLevel_3 getImagesLevel_3() {
        imagesLevel_1 = null;
        imagesLevel_2 = null;
        if (imagesLevel_3 == null) {
            imagesLevel_3 = new ImagesLevel_3();
        }
        return imagesLevel_3;
    }

    /**
     * Класс с картинками для первого уровня
     */
    public static class ImagesLevel_1 {

        //Фон
        private BufferedImage backgroundImage1;
        private BufferedImage backgroundImage2;
        private BufferedImage backgroundImage3;
        private BufferedImage backgroundImage4;
        private BufferedImage backgroundImage5;
        private BufferedImage backgroundImage6;
        private BufferedImage backgroundImage7;
        private BufferedImage backgroundImage8;
        private BufferedImage backgroundImage9;

        //Враги
        private BufferedImage enemyCarrionImage;
        private BufferedImage hungryCarrion;
        private BufferedImage enemyHuskImage;
        private BufferedImage enemyHuskShootImage;
        private BufferedImage enemyPestilenceImage;
        private BufferedImage fireBallImage;

        //Gargoly
        private BufferedImage gargolyFlyRight_1;
        private BufferedImage gargolyFlyRight_2;
        private BufferedImage gargolyFlyRight_3;
        private BufferedImage gargolyFlyRight_4;
        private BufferedImage gargolyFlyRight_5;
        private BufferedImage gargolyFlyLeft_1;
        private BufferedImage gargolyFlyLeft_2;
        private BufferedImage gargolyFlyLeft_3;
        private BufferedImage gargolyFlyLeft_4;
        private BufferedImage gargolyFlyLeft_5;
        private BufferedImage gargolyWalkRight_1;
        private BufferedImage gargolyWalkRight_2;
        private BufferedImage gargolyWalkRight_3;
        private BufferedImage gargolyWalkLeft_1;
        private BufferedImage gargolyWalkLeft_2;
        private BufferedImage gargolyWalkLeft_3;
        private BufferedImage gargolyJumpLeft_1;
        private BufferedImage gargolyJumpLeft_2;
        private BufferedImage gargolyJumpRight_1;
        private BufferedImage gargolyJumpRight_2;

        //Stone
        private BufferedImage stone1_pos1;
        private BufferedImage stone1_pos2;
        private BufferedImage stone1_pos3;
        private BufferedImage stone1_pos4;
        private BufferedImage stone1_pos5;
        private BufferedImage stone1_pos6;
        private BufferedImage stone1_pos7;
        private BufferedImage stone1_pos8;
        private BufferedImage stone1_pos9;
        private BufferedImage stone1_pos10;
        private BufferedImage stone1_pos11;
        private BufferedImage stone1_pos12;
        private BufferedImage stone1_pos13;
        private BufferedImage stone1_pos14;
        private BufferedImage stone1_pos15;
        private BufferedImage stone1_pos16;

        //Ghost
        private BufferedImage ghostFlyRight_1;
        private BufferedImage ghostFlyRight_2;
        private BufferedImage ghostFlyRight_3;
        private BufferedImage ghostFlyRight_4;
        private BufferedImage ghostFlyLeft_1;
        private BufferedImage ghostFlyLeft_2;
        private BufferedImage ghostFlyLeft_3;
        private BufferedImage ghostFlyLeft_4;

        //Zombie
        private BufferedImage zombieWalk_1;
        private BufferedImage zombieWalk_2;
        private BufferedImage zombieWalk_3;

        //archer
        private BufferedImage archer_shoot_1;
        private BufferedImage archer_shoot_2;
        private BufferedImage archer_shoot_3;
        private BufferedImage archer_shoot_4;
        private BufferedImage archer_shoot_5;
        private BufferedImage archer_shoot_6;

        private BufferedImage archer_jump_left;
        private BufferedImage archer_jump_right;

        private BufferedImage archer_run_left_1;
        private BufferedImage archer_run_left_2;
        private BufferedImage archer_run_left_3;

        private BufferedImage archer_run_right_1;
        private BufferedImage archer_run_right_2;
        private BufferedImage archer_run_right_3;

        private BufferedImage arrow;
        private BufferedImage rope;


        /**
         * В конструкторе загружаются все картинки для первого уровня
         */
        private ImagesLevel_1() {
            try {
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

                //Враги
                enemyCarrionImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "Carrion.png"));
                enemyHuskImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "Husk.png"));
                enemyHuskShootImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "EnemyHuskShoot.png"));
                hungryCarrion = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "carrion2.png"));
                enemyPestilenceImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "Pestilence.png"));
                fireBallImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "FireBall.png"));

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

                //Stone
                stone1_pos1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos1.png"));
                stone1_pos2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos2.png"));
                stone1_pos3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos3.png"));
                stone1_pos4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos4.png"));
                stone1_pos5 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos5.png"));
                stone1_pos6 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos6.png"));
                stone1_pos7 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos7.png"));
                stone1_pos8 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos8.png"));
                stone1_pos9 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos9.png"));
                stone1_pos10 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos10.png"));
                stone1_pos11 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos11.png"));
                stone1_pos12 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos12.png"));
                stone1_pos13 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos13.png"));
                stone1_pos14 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos14.png"));
                stone1_pos15 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos15.png"));
                stone1_pos16 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "gargoly" + FS + "stones" + FS + "stone1" + FS + "stone1_pos16.png"));

                //Ghost
                ghostFlyRight_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "right" + FS + "fly" + FS + "GhostFlyRight_1.png"));
                ghostFlyRight_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "right" + FS + "fly" + FS + "GhostFlyRight_2.png"));
                ghostFlyRight_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "right" + FS + "fly" + FS + "GhostFlyRight_3.png"));
                ghostFlyRight_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "right" + FS + "fly" + FS + "GhostFlyRight_4.png"));
                ghostFlyLeft_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "left" + FS + "fly" + FS + "GhostFlyLeft_1.png"));
                ghostFlyLeft_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "left" + FS + "fly" + FS + "GhostFlyLeft_2.png"));
                ghostFlyLeft_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "left" + FS + "fly" + FS + "GhostFlyLeft_3.png"));
                ghostFlyLeft_4 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "ghost" + FS + "left" + FS + "fly" + FS + "GhostFlyLeft_4.png"));

                //Zombie
                zombieWalk_1 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "zombie" + FS + "Zombie_walk_1.png"));
                zombieWalk_2 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "zombie" + FS + "Zombie_walk_2.png"));
                zombieWalk_3 = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "zombie" + FS + "Zombie_walk_3.png"));

                //archer
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


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public BufferedImage getBackgroundImage1() {
            return backgroundImage1;
        }

        public BufferedImage getBackgroundImage2() {
            return backgroundImage2;
        }

        public BufferedImage getBackgroundImage3() {
            return backgroundImage3;
        }

        public BufferedImage getBackgroundImage4() {
            return backgroundImage4;
        }

        public BufferedImage getBackgroundImage5() {
            return backgroundImage5;
        }

        public BufferedImage getBackgroundImage6() {
            return backgroundImage6;
        }

        public BufferedImage getBackgroundImage7() {
            return backgroundImage7;
        }

        public BufferedImage getBackgroundImage8() {
            return backgroundImage8;
        }

        public BufferedImage getBackgroundImage9() {
            return backgroundImage9;
        }

        public BufferedImage getEnemyCarrionImage() {
            return enemyCarrionImage;
        }

        public BufferedImage getHungryCarrion() {
            return hungryCarrion;
        }

        public BufferedImage getEnemyHuskImage() {
            return enemyHuskImage;
        }

        public BufferedImage getEnemyHuskShootImage() {
            return enemyHuskShootImage;
        }

        public BufferedImage getEnemyPestilenceImage() {
            return enemyPestilenceImage;
        }

        public BufferedImage getFireBallImage() {
            return fireBallImage;
        }

        public BufferedImage getGargolyFlyRight_1() {
            return gargolyFlyRight_1;
        }

        public BufferedImage getGargolyFlyRight_2() {
            return gargolyFlyRight_2;
        }

        public BufferedImage getGargolyFlyRight_3() {
            return gargolyFlyRight_3;
        }

        public BufferedImage getGargolyFlyRight_4() {
            return gargolyFlyRight_4;
        }

        public BufferedImage getGargolyFlyRight_5() {
            return gargolyFlyRight_5;
        }

        public BufferedImage getGargolyFlyLeft_1() {
            return gargolyFlyLeft_1;
        }

        public BufferedImage getGargolyFlyLeft_2() {
            return gargolyFlyLeft_2;
        }

        public BufferedImage getGargolyFlyLeft_3() {
            return gargolyFlyLeft_3;
        }

        public BufferedImage getGargolyFlyLeft_4() {
            return gargolyFlyLeft_4;
        }

        public BufferedImage getGargolyFlyLeft_5() {
            return gargolyFlyLeft_5;
        }

        public BufferedImage getGargolyWalkRight_1() {
            return gargolyWalkRight_1;
        }

        public BufferedImage getGargolyWalkRight_2() {
            return gargolyWalkRight_2;
        }

        public BufferedImage getGargolyWalkRight_3() {
            return gargolyWalkRight_3;
        }

        public BufferedImage getGargolyWalkLeft_1() {
            return gargolyWalkLeft_1;
        }

        public BufferedImage getGargolyWalkLeft_2() {
            return gargolyWalkLeft_2;
        }

        public BufferedImage getGargolyWalkLeft_3() {
            return gargolyWalkLeft_3;
        }

        public BufferedImage getGargolyJumpLeft_1() {
            return gargolyJumpLeft_1;
        }

        public BufferedImage getGargolyJumpLeft_2() {
            return gargolyJumpLeft_2;
        }

        public BufferedImage getGargolyJumpRight_1() {
            return gargolyJumpRight_1;
        }

        public BufferedImage getGargolyJumpRight_2() {
            return gargolyJumpRight_2;
        }

        public BufferedImage getStone1_pos1() {
            return stone1_pos1;
        }

        public BufferedImage getStone1_pos2() {
            return stone1_pos2;
        }

        public BufferedImage getStone1_pos3() {
            return stone1_pos3;
        }

        public BufferedImage getStone1_pos4() {
            return stone1_pos4;
        }

        public BufferedImage getStone1_pos5() {
            return stone1_pos5;
        }

        public BufferedImage getStone1_pos6() {
            return stone1_pos6;
        }

        public BufferedImage getStone1_pos7() {
            return stone1_pos7;
        }

        public BufferedImage getStone1_pos8() {
            return stone1_pos8;
        }

        public BufferedImage getStone1_pos9() {
            return stone1_pos9;
        }

        public BufferedImage getStone1_pos10() {
            return stone1_pos10;
        }

        public BufferedImage getStone1_pos11() {
            return stone1_pos11;
        }

        public BufferedImage getStone1_pos12() {
            return stone1_pos12;
        }

        public BufferedImage getStone1_pos13() {
            return stone1_pos13;
        }

        public BufferedImage getStone1_pos14() {
            return stone1_pos14;
        }

        public BufferedImage getStone1_pos15() {
            return stone1_pos15;
        }

        public BufferedImage getStone1_pos16() {
            return stone1_pos16;
        }

        public BufferedImage getGhostFlyRight_1() {
            return ghostFlyRight_1;
        }

        public BufferedImage getGhostFlyRight_2() {
            return ghostFlyRight_2;
        }

        public BufferedImage getGhostFlyRight_3() {
            return ghostFlyRight_3;
        }

        public BufferedImage getGhostFlyRight_4() {
            return ghostFlyRight_4;
        }

        public BufferedImage getGhostFlyLeft_1() {
            return ghostFlyLeft_1;
        }

        public BufferedImage getGhostFlyLeft_2() {
            return ghostFlyLeft_2;
        }

        public BufferedImage getGhostFlyLeft_3() {
            return ghostFlyLeft_3;
        }

        public BufferedImage getGhostFlyLeft_4() {
            return ghostFlyLeft_4;
        }

        public BufferedImage getZombieWalk_1() {
            return zombieWalk_1;
        }

        public BufferedImage getZombieWalk_2() {
            return zombieWalk_2;
        }

        public BufferedImage getZombieWalk_3() {
            return zombieWalk_3;
        }

        public BufferedImage getArcher_shoot_1() {
            return archer_shoot_1;
        }

        public BufferedImage getArcher_shoot_2() {
            return archer_shoot_2;
        }

        public BufferedImage getArcher_shoot_3() {
            return archer_shoot_3;
        }

        public BufferedImage getArcher_shoot_4() {
            return archer_shoot_4;
        }

        public BufferedImage getArcher_shoot_5() {
            return archer_shoot_5;
        }

        public BufferedImage getArcher_shoot_6() {
            return archer_shoot_6;
        }

        public BufferedImage getArcher_jump_left() {
            return archer_jump_left;
        }

        public BufferedImage getArcher_jump_right() {
            return archer_jump_right;
        }

        public BufferedImage getArcher_run_left_1() {
            return archer_run_left_1;
        }

        public BufferedImage getArcher_run_left_2() {
            return archer_run_left_2;
        }

        public BufferedImage getArcher_run_left_3() {
            return archer_run_left_3;
        }

        public BufferedImage getArcher_run_right_1() {
            return archer_run_right_1;
        }

        public BufferedImage getArcher_run_right_2() {
            return archer_run_right_2;
        }

        public BufferedImage getArcher_run_right_3() {
            return archer_run_right_3;
        }

        public BufferedImage getArrow() {
            return arrow;
        }

        public BufferedImage getRope() {
            return rope;
        }


    }

    /**
     * Класс с картинками для второго уровня
     */
    public static class ImagesLevel_2 {

        //Фон
        private BufferedImage backgroundLevel2Image1;
        private BufferedImage backgroundLevel2Image2;
        private BufferedImage backgroundLevel2Image3;
        private BufferedImage backgroundLevel2Image4;
        private BufferedImage backgroundLevel2Image5;

        //Враги
        private BufferedImage enemyMummyZombieLeftImage;
        private BufferedImage enemyMummyZombieRightImage;

        private BufferedImage enemyMummyZombieRageLeftImage_1;
        private BufferedImage enemyMummyZombieRageLeftImage_2;
        private BufferedImage enemyMummyZombieRageRightImage_1;
        private BufferedImage enemyMummyZombieRageRightImage_2;

        private BufferedImage enemyFoxMummyWalkImage_1;
        private BufferedImage enemyFoxMummyWalkImage_2;
        private BufferedImage enemyFoxMummyWalkImage_3;
        private BufferedImage enemyFoxMummyWalkImage_4;
        private BufferedImage enemyFoxMummyShoot_Image;

        private BufferedImage mummyFireBallImage_1;
        private BufferedImage mummyFireBallImage_2;
        private BufferedImage mummyFireBallImage_3;
        private BufferedImage mummyFireBallImage_4;
        private BufferedImage mummyFireBallImage_5;
        private BufferedImage mummyFireBallImage_6;
        private BufferedImage mummyFireBallImage_7;
        private BufferedImage mummyFireBallImage_8;
        private BufferedImage mummyFireBallImage_9;
        private BufferedImage mummyFireBallImage_10;
        private BufferedImage mummyFireBallImage_11;
        private BufferedImage mummyFireBallImage_12;
        private BufferedImage mummyFireBallImage_13;
        private BufferedImage mummyFireBallImage_14;
        private BufferedImage mummyFireBallImage_15;
        private BufferedImage mummyFireBallImage_16;
        private BufferedImage fireBallImage;

        private BufferedImage enemyOgreWalkImage_1;
        private BufferedImage enemyOgreWalkImage_2;
        private BufferedImage enemyOgreWalkImage_3;
        private BufferedImage enemyOgreWalkImage_4;
        private BufferedImage enemyOgreWalkImage_5;
        private BufferedImage enemyOgreWalkImage_6;
        private BufferedImage enemyOgreWalkImage_7;
        private BufferedImage enemyOgreJumpImage_1;
        private BufferedImage enemyOgreJumpImage_2;
        private BufferedImage enemyOgreJumpImage_3;
        private BufferedImage enemyOgreJumpImage_4;
        private BufferedImage enemyOgreJumpImage_5;
        private BufferedImage enemyOgreJumpImage_6;
        private BufferedImage enemyOgreJumpImage_7;

        private BufferedImage enemyGenieMoveLeftImage_1;
        private BufferedImage enemyGenieMoveLeftImage_2;
        private BufferedImage enemyGenieMoveLeftImage_3;
        private BufferedImage enemyGenieMoveLeftImage_4;
        private BufferedImage enemyGenieMoveLeftImage_5;

        private BufferedImage enemyGenieMoveRightImage_1;
        private BufferedImage enemyGenieMoveRightImage_2;
        private BufferedImage enemyGenieMoveRightImage_3;
        private BufferedImage enemyGenieMoveRightImage_4;
        private BufferedImage enemyGenieMoveRightImage_5;

        private BufferedImage enemyGenieCastImage_1;
        private BufferedImage enemyGenieCastImage_2;
        private BufferedImage enemyGenieCastImage_3;

        private BufferedImage genieSwordMoveRightImage_1;
        private BufferedImage genieSwordMoveRightImage_2;
        private BufferedImage genieSwordMoveRightImage_3;
        private BufferedImage genieSwordMoveRightImage_4;
        private BufferedImage genieSwordMoveRightImage_5;
        private BufferedImage genieSwordMoveRightImage_6;
        private BufferedImage genieSwordMoveRightImage_7;
        private BufferedImage genieSwordMoveRightImage_8;
        private BufferedImage genieSwordMoveRightImage_9;
        private BufferedImage genieSwordMoveRightImage_10;
        private BufferedImage genieSwordMoveRightImage_11;
        private BufferedImage genieSwordMoveRightImage_12;
        private BufferedImage genieSwordMoveRightImage_13;
        private BufferedImage genieSwordMoveRightImage_14;
        private BufferedImage genieSwordMoveRightImage_15;
        private BufferedImage genieSwordMoveRightImage_16;

        private BufferedImage genieSwordMoveLeftImage_1;
        private BufferedImage genieSwordMoveLeftImage_2;
        private BufferedImage genieSwordMoveLeftImage_3;
        private BufferedImage genieSwordMoveLeftImage_4;
        private BufferedImage genieSwordMoveLeftImage_5;
        private BufferedImage genieSwordMoveLeftImage_6;
        private BufferedImage genieSwordMoveLeftImage_7;
        private BufferedImage genieSwordMoveLeftImage_8;
        private BufferedImage genieSwordMoveLeftImage_9;
        private BufferedImage genieSwordMoveLeftImage_10;
        private BufferedImage genieSwordMoveLeftImage_11;
        private BufferedImage genieSwordMoveLeftImage_12;
        private BufferedImage genieSwordMoveLeftImage_13;
        private BufferedImage genieSwordMoveLeftImage_14;
        private BufferedImage genieSwordMoveLeftImage_15;
        private BufferedImage genieSwordMoveLeftImage_16;

        private BufferedImage sawFireBallImage_1;
        private BufferedImage sawFireBallImage_2;
        private BufferedImage sawFireBallImage_3;
        private BufferedImage sawFireBallImage_4;
        private BufferedImage sawFireBallImage_5;
        private BufferedImage sawFireBallImage_6;
        private BufferedImage sawFireBallImage_7;
        private BufferedImage sawFireBallImage_8;
        private BufferedImage sawFireBallImage_9;
        private BufferedImage sawFireBallImage_10;
        private BufferedImage sawFireBallImage_11;
        private BufferedImage sawFireBallImage_12;
        private BufferedImage sawFireBallImage_13;
        private BufferedImage sawFireBallImage_14;
        private BufferedImage sawFireBallImage_15;
        private BufferedImage sawFireBallImage_16;



        /**
         * В конструкторе загружаются все картинки для второго уровня
         */
        private ImagesLevel_2() {
            try {
                //Фон
                backgroundLevel2Image1 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_2" + FS + "1.png"));
                backgroundLevel2Image2 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_2" + FS + "2.png"));
                backgroundLevel2Image3 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_2" + FS + "3.png"));
                backgroundLevel2Image4 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_2" + FS + "4.png"));
                backgroundLevel2Image5 = ImageIO.read(new File(PATH_TO_RESOURCE + "background" + FS + "level_2" + FS + "5.png"));

                //Враги
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
                fireBallImage = ImageIO.read(new File(PATH_TO_RESOURCE + "enemies" + FS + "FireBall.png"));

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


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public BufferedImage getBackgroundLevel2Image1() {
            return backgroundLevel2Image1;
        }

        public BufferedImage getBackgroundLevel2Image2() {
            return backgroundLevel2Image2;
        }

        public BufferedImage getBackgroundLevel2Image3() {
            return backgroundLevel2Image3;
        }

        public BufferedImage getBackgroundLevel2Image4() {
            return backgroundLevel2Image4;
        }

        public BufferedImage getBackgroundLevel2Image5() {
            return backgroundLevel2Image5;
        }

        public BufferedImage getEnemyMummyZombieLeftImage() {
            return enemyMummyZombieLeftImage;
        }

        public BufferedImage getEnemyMummyZombieRightImage() {
            return enemyMummyZombieRightImage;
        }

        public BufferedImage getEnemyMummyZombieRageLeftImage_1() {
            return enemyMummyZombieRageLeftImage_1;
        }

        public BufferedImage getEnemyMummyZombieRageLeftImage_2() {
            return enemyMummyZombieRageLeftImage_2;
        }

        public BufferedImage getEnemyMummyZombieRageRightImage_1() {
            return enemyMummyZombieRageRightImage_1;
        }

        public BufferedImage getEnemyMummyZombieRageRightImage_2() {
            return enemyMummyZombieRageRightImage_2;
        }

        public BufferedImage getEnemyFoxMummyWalkImage_1() {
            return enemyFoxMummyWalkImage_1;
        }

        public BufferedImage getEnemyFoxMummyWalkImage_2() {
            return enemyFoxMummyWalkImage_2;
        }

        public BufferedImage getEnemyFoxMummyWalkImage_3() {
            return enemyFoxMummyWalkImage_3;
        }

        public BufferedImage getEnemyFoxMummyWalkImage_4() {
            return enemyFoxMummyWalkImage_4;
        }

        public BufferedImage getEnemyFoxMummyShoot_Image() {
            return enemyFoxMummyShoot_Image;
        }

        public BufferedImage getMummyFireBallImage_1() {
            return mummyFireBallImage_1;
        }

        public BufferedImage getMummyFireBallImage_2() {
            return mummyFireBallImage_2;
        }

        public BufferedImage getMummyFireBallImage_3() {
            return mummyFireBallImage_3;
        }

        public BufferedImage getMummyFireBallImage_4() {
            return mummyFireBallImage_4;
        }

        public BufferedImage getMummyFireBallImage_5() {
            return mummyFireBallImage_5;
        }

        public BufferedImage getMummyFireBallImage_6() {
            return mummyFireBallImage_6;
        }

        public BufferedImage getMummyFireBallImage_7() {
            return mummyFireBallImage_7;
        }

        public BufferedImage getMummyFireBallImage_8() {
            return mummyFireBallImage_8;
        }

        public BufferedImage getMummyFireBallImage_9() {
            return mummyFireBallImage_9;
        }

        public BufferedImage getMummyFireBallImage_10() {
            return mummyFireBallImage_10;
        }

        public BufferedImage getMummyFireBallImage_11() {
            return mummyFireBallImage_11;
        }

        public BufferedImage getMummyFireBallImage_12() {
            return mummyFireBallImage_12;
        }

        public BufferedImage getMummyFireBallImage_13() {
            return mummyFireBallImage_13;
        }

        public BufferedImage getMummyFireBallImage_14() {
            return mummyFireBallImage_14;
        }

        public BufferedImage getMummyFireBallImage_15() {
            return mummyFireBallImage_15;
        }

        public BufferedImage getMummyFireBallImage_16() {
            return mummyFireBallImage_16;
        }

        public BufferedImage getFireBallImage() {
            return fireBallImage;
        }

        public BufferedImage getEnemyOgreWalkImage_1() {
            return enemyOgreWalkImage_1;
        }

        public BufferedImage getEnemyOgreWalkImage_2() {
            return enemyOgreWalkImage_2;
        }

        public BufferedImage getEnemyOgreWalkImage_3() {
            return enemyOgreWalkImage_3;
        }

        public BufferedImage getEnemyOgreWalkImage_4() {
            return enemyOgreWalkImage_4;
        }

        public BufferedImage getEnemyOgreWalkImage_5() {
            return enemyOgreWalkImage_5;
        }

        public BufferedImage getEnemyOgreWalkImage_6() {
            return enemyOgreWalkImage_6;
        }

        public BufferedImage getEnemyOgreWalkImage_7() {
            return enemyOgreWalkImage_7;
        }

        public BufferedImage getEnemyOgreJumpImage_1() {
            return enemyOgreJumpImage_1;
        }

        public BufferedImage getEnemyOgreJumpImage_2() {
            return enemyOgreJumpImage_2;
        }

        public BufferedImage getEnemyOgreJumpImage_3() {
            return enemyOgreJumpImage_3;
        }

        public BufferedImage getEnemyOgreJumpImage_4() {
            return enemyOgreJumpImage_4;
        }

        public BufferedImage getEnemyOgreJumpImage_5() {
            return enemyOgreJumpImage_5;
        }

        public BufferedImage getEnemyOgreJumpImage_6() {
            return enemyOgreJumpImage_6;
        }

        public BufferedImage getEnemyOgreJumpImage_7() {
            return enemyOgreJumpImage_7;
        }

        public BufferedImage getEnemyGenieMoveLeftImage_1() {
            return enemyGenieMoveLeftImage_1;
        }

        public BufferedImage getEnemyGenieMoveLeftImage_2() {
            return enemyGenieMoveLeftImage_2;
        }

        public BufferedImage getEnemyGenieMoveLeftImage_3() {
            return enemyGenieMoveLeftImage_3;
        }

        public BufferedImage getEnemyGenieMoveLeftImage_4() {
            return enemyGenieMoveLeftImage_4;
        }

        public BufferedImage getEnemyGenieMoveLeftImage_5() {
            return enemyGenieMoveLeftImage_5;
        }

        public BufferedImage getEnemyGenieMoveRightImage_1() {
            return enemyGenieMoveRightImage_1;
        }

        public BufferedImage getEnemyGenieMoveRightImage_2() {
            return enemyGenieMoveRightImage_2;
        }

        public BufferedImage getEnemyGenieMoveRightImage_3() {
            return enemyGenieMoveRightImage_3;
        }

        public BufferedImage getEnemyGenieMoveRightImage_4() {
            return enemyGenieMoveRightImage_4;
        }

        public BufferedImage getEnemyGenieMoveRightImage_5() {
            return enemyGenieMoveRightImage_5;
        }

        public BufferedImage getEnemyGenieCastImage_1() {
            return enemyGenieCastImage_1;
        }

        public BufferedImage getEnemyGenieCastImage_2() {
            return enemyGenieCastImage_2;
        }

        public BufferedImage getEnemyGenieCastImage_3() {
            return enemyGenieCastImage_3;
        }

        public BufferedImage getGenieSwordMoveRightImage_1() {
            return genieSwordMoveRightImage_1;
        }

        public BufferedImage getGenieSwordMoveRightImage_2() {
            return genieSwordMoveRightImage_2;
        }

        public BufferedImage getGenieSwordMoveRightImage_3() {
            return genieSwordMoveRightImage_3;
        }

        public BufferedImage getGenieSwordMoveRightImage_4() {
            return genieSwordMoveRightImage_4;
        }

        public BufferedImage getGenieSwordMoveRightImage_5() {
            return genieSwordMoveRightImage_5;
        }

        public BufferedImage getGenieSwordMoveRightImage_6() {
            return genieSwordMoveRightImage_6;
        }

        public BufferedImage getGenieSwordMoveRightImage_7() {
            return genieSwordMoveRightImage_7;
        }

        public BufferedImage getGenieSwordMoveRightImage_8() {
            return genieSwordMoveRightImage_8;
        }

        public BufferedImage getGenieSwordMoveRightImage_9() {
            return genieSwordMoveRightImage_9;
        }

        public BufferedImage getGenieSwordMoveRightImage_10() {
            return genieSwordMoveRightImage_10;
        }

        public BufferedImage getGenieSwordMoveRightImage_11() {
            return genieSwordMoveRightImage_11;
        }

        public BufferedImage getGenieSwordMoveRightImage_12() {
            return genieSwordMoveRightImage_12;
        }

        public BufferedImage getGenieSwordMoveRightImage_13() {
            return genieSwordMoveRightImage_13;
        }

        public BufferedImage getGenieSwordMoveRightImage_14() {
            return genieSwordMoveRightImage_14;
        }

        public BufferedImage getGenieSwordMoveRightImage_15() {
            return genieSwordMoveRightImage_15;
        }

        public BufferedImage getGenieSwordMoveRightImage_16() {
            return genieSwordMoveRightImage_16;
        }

        public BufferedImage getGenieSwordMoveLeftImage_1() {
            return genieSwordMoveLeftImage_1;
        }

        public BufferedImage getGenieSwordMoveLeftImage_2() {
            return genieSwordMoveLeftImage_2;
        }

        public BufferedImage getGenieSwordMoveLeftImage_3() {
            return genieSwordMoveLeftImage_3;
        }

        public BufferedImage getGenieSwordMoveLeftImage_4() {
            return genieSwordMoveLeftImage_4;
        }

        public BufferedImage getGenieSwordMoveLeftImage_5() {
            return genieSwordMoveLeftImage_5;
        }

        public BufferedImage getGenieSwordMoveLeftImage_6() {
            return genieSwordMoveLeftImage_6;
        }

        public BufferedImage getGenieSwordMoveLeftImage_7() {
            return genieSwordMoveLeftImage_7;
        }

        public BufferedImage getGenieSwordMoveLeftImage_8() {
            return genieSwordMoveLeftImage_8;
        }

        public BufferedImage getGenieSwordMoveLeftImage_9() {
            return genieSwordMoveLeftImage_9;
        }

        public BufferedImage getGenieSwordMoveLeftImage_10() {
            return genieSwordMoveLeftImage_10;
        }

        public BufferedImage getGenieSwordMoveLeftImage_11() {
            return genieSwordMoveLeftImage_11;
        }

        public BufferedImage getGenieSwordMoveLeftImage_12() {
            return genieSwordMoveLeftImage_12;
        }

        public BufferedImage getGenieSwordMoveLeftImage_13() {
            return genieSwordMoveLeftImage_13;
        }

        public BufferedImage getGenieSwordMoveLeftImage_14() {
            return genieSwordMoveLeftImage_14;
        }

        public BufferedImage getGenieSwordMoveLeftImage_15() {
            return genieSwordMoveLeftImage_15;
        }

        public BufferedImage getGenieSwordMoveLeftImage_16() {
            return genieSwordMoveLeftImage_16;
        }

        public BufferedImage getSawFireBallImage_1() {
            return sawFireBallImage_1;
        }

        public BufferedImage getSawFireBallImage_2() {
            return sawFireBallImage_2;
        }

        public BufferedImage getSawFireBallImage_3() {
            return sawFireBallImage_3;
        }

        public BufferedImage getSawFireBallImage_4() {
            return sawFireBallImage_4;
        }

        public BufferedImage getSawFireBallImage_5() {
            return sawFireBallImage_5;
        }

        public BufferedImage getSawFireBallImage_6() {
            return sawFireBallImage_6;
        }

        public BufferedImage getSawFireBallImage_7() {
            return sawFireBallImage_7;
        }

        public BufferedImage getSawFireBallImage_8() {
            return sawFireBallImage_8;
        }

        public BufferedImage getSawFireBallImage_9() {
            return sawFireBallImage_9;
        }

        public BufferedImage getSawFireBallImage_10() {
            return sawFireBallImage_10;
        }

        public BufferedImage getSawFireBallImage_11() {
            return sawFireBallImage_11;
        }

        public BufferedImage getSawFireBallImage_12() {
            return sawFireBallImage_12;
        }

        public BufferedImage getSawFireBallImage_13() {
            return sawFireBallImage_13;
        }

        public BufferedImage getSawFireBallImage_14() {
            return sawFireBallImage_14;
        }

        public BufferedImage getSawFireBallImage_15() {
            return sawFireBallImage_15;
        }

        public BufferedImage getSawFireBallImage_16() {
            return sawFireBallImage_16;
        }


    }

    /**
     * Класс с картинками для третьего уровня
     */
    public static class ImagesLevel_3 {

        //фон
        private BufferedImage backgroundLevel3Image1;
        private BufferedImage backgroundLevel3Image2;
        private BufferedImage backgroundLevel3Image3;
        private BufferedImage backgroundLevel3Image4;
        private BufferedImage backgroundLevel3Image5;
        private BufferedImage backgroundLevel3Image6;
        private BufferedImage backgroundLevel3Image7;
        private BufferedImage backgroundLevel3Image8;
        private BufferedImage backgroundLevel3Image9;

        /**
         * В конструкторе загружаются все картинки для третьего уровня
         */
        private ImagesLevel_3() {
            try {
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
                e.printStackTrace();
            }
        }

        public BufferedImage getBackgroundLevel3Image1() {
            return backgroundLevel3Image1;
        }

        public BufferedImage getBackgroundLevel3Image2() {
            return backgroundLevel3Image2;
        }

        public BufferedImage getBackgroundLevel3Image3() {
            return backgroundLevel3Image3;
        }

        public BufferedImage getBackgroundLevel3Image4() {
            return backgroundLevel3Image4;
        }

        public BufferedImage getBackgroundLevel3Image5() {
            return backgroundLevel3Image5;
        }

        public BufferedImage getBackgroundLevel3Image6() {
            return backgroundLevel3Image6;
        }

        public BufferedImage getBackgroundLevel3Image7() {
            return backgroundLevel3Image7;
        }

        public BufferedImage getBackgroundLevel3Image8() {
            return backgroundLevel3Image8;
        }

        public BufferedImage getBackgroundLevel3Image9() {
            return backgroundLevel3Image9;
        }


    }


    private static BufferedImage gameOverImage;
    private static BufferedImage energyBar;


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
            //Конец игры
            gameOverImage = ImageIO.read(new File(PATH_TO_RESOURCE + "Game_Over.png"));
            //Полоса энергии
            energyBar = ImageIO.read(new File(PATH_TO_RESOURCE + "EnergyBar.png"));

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

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
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

    public static BufferedImage getPlayerFireBallImage_1_Left() {
        return playerFireBallImage_1_Left;
    }

    public static BufferedImage getPlayerFireBallImage_2_Left() {
        return playerFireBallImage_2_Left;
    }

    public static BufferedImage getEnergyBar() {
        return energyBar;
    }

    public static BufferedImage getPlayerImage() {
        return playerImage;
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



    public static BufferedImage getHeartImage() {
        return heartImage;
    }

    public static BufferedImage getPlayerWoundedImage() {
        return playerWoundedImage;
    }


    public static BufferedImage getGameOverImage() {
        return gameOverImage;
    }

}
