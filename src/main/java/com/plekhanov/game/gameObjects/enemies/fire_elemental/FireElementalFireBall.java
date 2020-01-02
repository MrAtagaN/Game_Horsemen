package com.plekhanov.game.gameObjects.enemies.fire_elemental;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;


public class FireElementalFireBall extends Enemy {

    private static final int IMAGE_WIDTH = 380;
    private static final int IMAGE_HEIGHT = 380;
    private static final int RENDER_ORDER = 80;
    private static final double SPEED_OF_CHANGE_IMAGE = 12.5;

    public FireElementalFireBall(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getFireElementalFireBall_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        actionCountMax = SPEED_OF_CHANGE_IMAGE * 16;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        checkClashWithPlayer(60, 60);
        incrementCount();
        setImage();
    }

    private void setImage() {
        if (actionCount < SPEED_OF_CHANGE_IMAGE) {
            bufferedImage = ImageLoader.getFireElementalFireBall_1();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 2) {
            bufferedImage = ImageLoader.getFireElementalFireBall_2();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 3) {
            bufferedImage = ImageLoader.getFireElementalFireBall_3();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 4) {
            bufferedImage = ImageLoader.getFireElementalFireBall_4();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 5) {
            bufferedImage = ImageLoader.getFireElementalFireBall_5();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 6) {
            bufferedImage = ImageLoader.getFireElementalFireBall_6();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 7) {
            bufferedImage = ImageLoader.getFireElementalFireBall_7();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 8) {
            bufferedImage = ImageLoader.getFireElementalFireBall_8();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 9) {
            bufferedImage = ImageLoader.getFireElementalFireBall_9();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 10) {
            bufferedImage = ImageLoader.getFireElementalFireBall_10();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 11) {
            bufferedImage = ImageLoader.getFireElementalFireBall_11();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 12) {
            bufferedImage = ImageLoader.getFireElementalFireBall_12();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 13) {
            bufferedImage = ImageLoader.getFireElementalFireBall_13();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 14) {
            bufferedImage = ImageLoader.getFireElementalFireBall_14();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 15) {
            bufferedImage = ImageLoader.getFireElementalFireBall_15();
        } else if (actionCount < SPEED_OF_CHANGE_IMAGE * 16) {
            bufferedImage = ImageLoader.getFireElementalFireBall_16();
        }
    }
}
