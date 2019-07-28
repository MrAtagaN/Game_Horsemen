package com.plekhanov.game.gameObjects;

import com.plekhanov.game.ImageLoader;


public class Heart extends GameObject {

    public Heart(double x, double y, double speedX, double speedY, int imageWidth, int imageHeight, int renderOrder) {
        super(x, y, speedX, speedY, ImageLoader.getHeartImage(), imageWidth, imageHeight, renderOrder);
    }
}
