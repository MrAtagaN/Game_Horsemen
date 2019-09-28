package com.plekhanov.game.gameObjects.enemies.genie;

import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;

import java.awt.image.BufferedImage;


public class SawFireBall extends Enemy {

    public SawFireBall(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder, Model model) {
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
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_1();
        } else if (actionCount < 25) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_2();
        } else if (actionCount < 37.5) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_3();
        } else if (actionCount < 50) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_4();
        } else if (actionCount < 62.5) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_5();
        } else if (actionCount < 75) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_6();
        } else if (actionCount < 87.5) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_7();
        } else if (actionCount < 100) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_8();
        } else if (actionCount < 112.5) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_9();
        } else if (actionCount < 125) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_10();
        } else if (actionCount < 137.5) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_11();
        } else if (actionCount < 150) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_12();
        } else if (actionCount < 162.5) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_13();
        } else if (actionCount < 175) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_14();
        } else if (actionCount < 182.5) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_15();
        } else if (actionCount < 200) {
            bufferedImage = ImageLoader.getImagesLevel_2().getSawFireBallImage_16();
        }
    }
}
