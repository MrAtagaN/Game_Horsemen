package com.plekhanov.game.gameObjects;

import com.plekhanov.game.utils.ImageLoader;


public class Heart extends GameObject {

    private static final int IMAGE_WIDTH = 55;
    private static final int IMAGE_HEIGHT = 66;
    private static final int RENDER_ORDER = 90;

    public Heart(double x, double y, double speedX, double speedY) {
        super(x, y, speedX, speedY, ImageLoader.getHeartImage(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER);
    }
}
