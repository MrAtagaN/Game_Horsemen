package com.plekhanov.game.gameObjects;

import com.plekhanov.game.Game;
import com.plekhanov.game.Utils;

import java.awt.image.BufferedImage;

import static com.plekhanov.game.Utils.scaleSize;


public class BackGround extends GameObject {
    public BackGround(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder);
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        if (x <= scaleSize(-Game.SCREEN_WIDTH /2) ) {
            x = scaleSize(Game.SCREEN_WIDTH *1.5);
        }
    }
}
