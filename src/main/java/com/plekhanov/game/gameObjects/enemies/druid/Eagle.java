package com.plekhanov.game.gameObjects.enemies.druid;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;


public class Eagle extends Enemy {

    private static final int IMAGE_WIDTH = 400;
    private static final int IMAGE_HEIGHT = 400;
    private static final int RENDER_ORDER = 15;
    private static final int LIFE = 2;

    private static final int SPEED_OF_CHANGE_SHOOT_IMAGES = 100;
    private static final int MAX_FLY_IMAGE_COUNT = SPEED_OF_CHANGE_SHOOT_IMAGES * 2;

    private boolean lookRight;
    private int imageCount = 0;

    public Eagle(double x, double y, double speedX, double speedY, Model model, boolean lookRight) {
        super(x, y, speedX, speedY, ImageLoader.getEagleFlyLeft_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        this.life = LIFE;
        this.lookRight = lookRight;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        changeImage();
        incrementCount();
        checkClashWithPlayer(100, 80);
        checkClashWithPlayerShoot(80, 80);
    }


    private void changeImage() {
        if (lookRight) {
            if (imageCount < SPEED_OF_CHANGE_SHOOT_IMAGES) {
                bufferedImage = ImageLoader.getEagleFlyRight_1();
            } else if (imageCount < SPEED_OF_CHANGE_SHOOT_IMAGES * 2) {
                bufferedImage = ImageLoader.getEagleFlyRight_2();
            }
        } else {
            if (imageCount < SPEED_OF_CHANGE_SHOOT_IMAGES) {
                bufferedImage = ImageLoader.getEagleFlyLeft_1();
            } else if (imageCount < SPEED_OF_CHANGE_SHOOT_IMAGES * 2) {
                bufferedImage = ImageLoader.getEagleFlyLeft_2();
            }
        }
    }


    @Override
    protected void incrementCount() {
        imageCount++;
        if (imageCount > MAX_FLY_IMAGE_COUNT) {
            imageCount = 0;
        }
    }
}
