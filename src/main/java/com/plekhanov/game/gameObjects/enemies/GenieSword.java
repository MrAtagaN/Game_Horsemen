package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.ImageLoader;
import com.plekhanov.game.Model;

import java.awt.image.BufferedImage;

public class GenieSword extends Enemy {


    public GenieSword(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder, Model model) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder, model);

        actionCountMax = 200;
        actionCount = Math.random() * 200; // чтобы мечи не летали синхронно
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();

        //проверка столкновения с игроком
        if (Math.abs(model.getPlayer().getX() - getX()) < 60 && Math.abs(model.getPlayer().getY() - getY()) < 60) {
            model.getPlayer().minusLife();
        }
        incrementCount();
        setImage();
    }

    private void setImage() {

         if (speedX < 0) {
             if (actionCount < 12.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_1();
             } else if (actionCount < 25) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_2();
             } else if (actionCount < 37.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_3();
             } else if (actionCount < 50) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_4();
             } else if (actionCount < 62.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_5();
             } else if (actionCount < 75) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_6();
             } else if (actionCount < 87.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_7();
             } else if (actionCount < 100) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_8();
             } else if (actionCount < 112.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_9();
             } else if (actionCount < 125) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_10();
             } else if (actionCount < 137.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_11();
             } else if (actionCount < 150) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_12();
             } else if (actionCount < 162.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_13();
             } else if (actionCount < 175) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_14();
             } else if (actionCount < 182.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_15();
             } else if (actionCount < 200) {
                 bufferedImage = ImageLoader.getGenieSwordMoveLeftImage_16();
             }
         } else {
             if (actionCount < 12.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_1();
             } else if (actionCount < 25) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_2();
             } else if (actionCount < 37.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_3();
             } else if (actionCount < 50) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_4();
             } else if (actionCount < 62.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_5();
             } else if (actionCount < 75) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_6();
             } else if (actionCount < 87.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_7();
             } else if (actionCount < 100) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_8();
             } else if (actionCount < 112.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_9();
             } else if (actionCount < 125) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_10();
             } else if (actionCount < 137.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_11();
             } else if (actionCount < 150) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_12();
             } else if (actionCount < 162.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_13();
             } else if (actionCount < 175) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_14();
             } else if (actionCount < 182.5) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_15();
             } else if (actionCount < 200) {
                 bufferedImage = ImageLoader.getGenieSwordMoveRightImage_16();
             }
         }





    }

}
