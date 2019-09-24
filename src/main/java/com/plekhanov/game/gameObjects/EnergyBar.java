package com.plekhanov.game.gameObjects;

import com.plekhanov.game.ImageLoader;


public class EnergyBar extends GameObject {

    private static final int IMAGE_HEIGHT = 20;
    private static final int RENDER_ORDER = 90;

    public EnergyBar(double x, double y, double speedX, double speedY, int imageWidth) {
        super(x, y, speedX, speedY, ImageLoader.getEnergyBar(), imageWidth, IMAGE_HEIGHT, RENDER_ORDER);
    }

    public void setImageWidth(int val) {
        this.imageWidth = val;
    }

    public void setX(double val) {
        this.x = val;
    }

    @Override
    public double getRenderX() {
        return x;
    }
}
