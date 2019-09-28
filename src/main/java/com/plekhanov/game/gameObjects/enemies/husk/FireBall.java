package com.plekhanov.game.gameObjects.enemies.husk;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;

import java.awt.image.BufferedImage;


public class FireBall extends Enemy {

    public FireBall(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder, Model model) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder, model);
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        checkClashWithPlayer(50, 50);
    }
}
