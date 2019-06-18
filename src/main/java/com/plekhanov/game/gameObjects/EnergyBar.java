package com.plekhanov.game.gameObjects;

import java.awt.image.BufferedImage;


public class EnergyBar extends GameObject {

    public EnergyBar(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder);
    }

    public void setImageWidth(int val) {
        this.imageWidth = val;
    }

    public void setX(double val) {
        this.x = val;
    }

    @Override
    public double getRenderX() {
        return x ;
    }
}
