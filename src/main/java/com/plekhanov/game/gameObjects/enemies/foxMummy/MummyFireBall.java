package com.plekhanov.game.gameObjects.enemies.foxMummy;

import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;

import java.awt.image.BufferedImage;


public class MummyFireBall extends Enemy {

    public MummyFireBall(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder, Model model) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder, model);

        actionCountMax = 200;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        checkClashWithPlayer(50, 50);
        incrementCount();
        setImage();
    }

    private void setImage() {
        if (actionCount < 12.5) {
            bufferedImage = ImageLoader.getMummyFireBallImage_1();
        } else if (actionCount < 25) {
            bufferedImage = ImageLoader.getMummyFireBallImage_2();
        } else if (actionCount < 37.5) {
            bufferedImage = ImageLoader.getMummyFireBallImage_3();
        } else if (actionCount < 50) {
            bufferedImage = ImageLoader.getMummyFireBallImage_4();
        } else if (actionCount < 62.5) {
            bufferedImage = ImageLoader.getMummyFireBallImage_5();
        } else if (actionCount < 75) {
            bufferedImage = ImageLoader.getMummyFireBallImage_6();
        } else if (actionCount < 87.5) {
            bufferedImage = ImageLoader.getMummyFireBallImage_7();
        } else if (actionCount < 100) {
            bufferedImage = ImageLoader.getMummyFireBallImage_8();
        } else if (actionCount < 112.5) {
            bufferedImage = ImageLoader.getMummyFireBallImage_9();
        } else if (actionCount < 125) {
            bufferedImage = ImageLoader.getMummyFireBallImage_10();
        } else if (actionCount < 137.5) {
            bufferedImage = ImageLoader.getMummyFireBallImage_11();
        } else if (actionCount < 150) {
            bufferedImage = ImageLoader.getMummyFireBallImage_12();
        } else if (actionCount < 162.5) {
            bufferedImage = ImageLoader.getMummyFireBallImage_13();
        } else if (actionCount < 175) {
            bufferedImage = ImageLoader.getMummyFireBallImage_14();
        } else if (actionCount < 182.5) {
            bufferedImage = ImageLoader.getMummyFireBallImage_15();
        } else if (actionCount < 200) {
            bufferedImage = ImageLoader.getMummyFireBallImage_16();
        }
    }
}