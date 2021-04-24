package com.plekhanov.game.gameObjects.enemies.archer;

import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.gameObjects.GameObject;


public class Rope extends GameObject {

    private static final int IMAGE_WIDTH = 270;
    private static final int IMAGE_HEIGHT = 600;
    private static final int RENDER_ORDER = 19;

    public Rope(double x, double y, double speedX, double speedY) {
        super(x, y, speedX, speedY, ImageLoader.getRope(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER);
    }
}
