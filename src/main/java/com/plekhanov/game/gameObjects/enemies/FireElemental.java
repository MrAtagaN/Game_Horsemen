package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.Model;
import com.plekhanov.game.utils.ImageLoader;


public class FireElemental extends Enemy {

    private static final int IMAGE_WIDTH = 380;
    private static final int IMAGE_HEIGHT = 380;
    private static final int RENDER_ORDER = 25;
    private static final int SPEED_OF_CHANGE_IMAGES = 50;

    private final int MAX_FLY_COUNT = SPEED_OF_CHANGE_IMAGES*4;
    private int flyCount;
    private boolean lookRight = false;


    public FireElemental(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getFireElementalFlyRight_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        changeImage();
        incrementCount();
    }


    @Override
    protected void incrementCount() {
        flyCount++;
        if (flyCount > MAX_FLY_COUNT) {
            flyCount = 0;
        }
    }

    private void changeImage() {
        if (lookRight) {
            if (flyCount < SPEED_OF_CHANGE_IMAGES) {
                this.bufferedImage = ImageLoader.getFireElementalFlyRight_1();
            } else if (flyCount < SPEED_OF_CHANGE_IMAGES*2) {
                this.bufferedImage = ImageLoader.getFireElementalFlyRight_2();
            } else if (flyCount < SPEED_OF_CHANGE_IMAGES*3) {
                this.bufferedImage = ImageLoader.getFireElementalFlyRight_3();
            } else if (flyCount < SPEED_OF_CHANGE_IMAGES*4) {
                this.bufferedImage = ImageLoader.getFireElementalFlyRight_2();
            }
        } else {
            if (flyCount < SPEED_OF_CHANGE_IMAGES) {
                this.bufferedImage = ImageLoader.getFireElementalFlyLeft_1();
            } else if (flyCount < SPEED_OF_CHANGE_IMAGES*2) {
                this.bufferedImage = ImageLoader.getFireElementalFlyLeft_2();
            } else if (flyCount < SPEED_OF_CHANGE_IMAGES*3) {
                this.bufferedImage = ImageLoader.getFireElementalFlyLeft_3();
            } else if (flyCount < SPEED_OF_CHANGE_IMAGES*4) {
                this.bufferedImage = ImageLoader.getFireElementalFlyLeft_2();
            }
        }
    }
}
