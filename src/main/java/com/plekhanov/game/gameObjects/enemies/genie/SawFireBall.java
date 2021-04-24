package com.plekhanov.game.gameObjects.enemies.genie;

import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;


public class SawFireBall extends Enemy {

    private static final int IMAGE_WIDTH = 150;
    private static final int IMAGE_HEIGHT = 150;
    private static final int RENDER_ORDER = 11;

    public SawFireBall(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getFireBallImage(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
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
            bufferedImage = ImageLoader.getSawFireBallImage_1();
        } else if (actionCount < 25) {
            bufferedImage = ImageLoader.getSawFireBallImage_2();
        } else if (actionCount < 37.5) {
            bufferedImage = ImageLoader.getSawFireBallImage_3();
        } else if (actionCount < 50) {
            bufferedImage = ImageLoader.getSawFireBallImage_4();
        } else if (actionCount < 62.5) {
            bufferedImage = ImageLoader.getSawFireBallImage_5();
        } else if (actionCount < 75) {
            bufferedImage = ImageLoader.getSawFireBallImage_6();
        } else if (actionCount < 87.5) {
            bufferedImage = ImageLoader.getSawFireBallImage_7();
        } else if (actionCount < 100) {
            bufferedImage = ImageLoader.getSawFireBallImage_8();
        } else if (actionCount < 112.5) {
            bufferedImage = ImageLoader.getSawFireBallImage_9();
        } else if (actionCount < 125) {
            bufferedImage = ImageLoader.getSawFireBallImage_10();
        } else if (actionCount < 137.5) {
            bufferedImage = ImageLoader.getSawFireBallImage_11();
        } else if (actionCount < 150) {
            bufferedImage = ImageLoader.getSawFireBallImage_12();
        } else if (actionCount < 162.5) {
            bufferedImage = ImageLoader.getSawFireBallImage_13();
        } else if (actionCount < 175) {
            bufferedImage = ImageLoader.getSawFireBallImage_14();
        } else if (actionCount < 182.5) {
            bufferedImage = ImageLoader.getSawFireBallImage_15();
        } else if (actionCount < 200) {
            bufferedImage = ImageLoader.getSawFireBallImage_16();
        }
    }
}
