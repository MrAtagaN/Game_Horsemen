package com.plekhanov.game.gameObjects;

import com.plekhanov.game.Game;
import java.awt.image.BufferedImage;


public class BackGround extends GameObject {
    public BackGround(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder);
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        if (x <= (-Game.SCREEN_WIDTH /2) ) {
            x = (Game.SCREEN_WIDTH *1.5);
        }
    }
}
