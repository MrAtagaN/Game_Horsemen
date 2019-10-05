package com.plekhanov.game.gameObjects;

import com.plekhanov.game.utils.ImageLoader;


public class PlayerShoot extends GameObject {

    private static final int IMAGE_WIDTH = 200;
    private static final int IMAGE_HEIGHT = 200;
    private static final int RENDER_ORDER = 20;

    private int liveCycle = 0;

    public PlayerShoot(double x, double y, double speedX, double speedY) {
        super(x, y, speedX, speedY, ImageLoader.getPlayerFireBallImage_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER);
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();

        liveCycle++;
        setImage();
    }

    private void setImage() {
        if (speedX > 0) {
            if ((liveCycle / 50 % 2) == 0) {
                bufferedImage = ImageLoader.getPlayerFireBallImage_1();
            } else {
                bufferedImage = ImageLoader.getPlayerFireBallImage_2();
            }
        } else {
            if ((liveCycle / 50 % 2) == 0) {
                bufferedImage = ImageLoader.getPlayerFireBallImage_1_Left();
            } else {
                bufferedImage = ImageLoader.getPlayerFireBallImage_2_Left();
            }
        }

    }


}
