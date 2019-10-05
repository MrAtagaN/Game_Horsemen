package com.plekhanov.game.gameObjects.enemies.husk;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;

import java.awt.image.BufferedImage;


public class FireBall extends Enemy {

    private static final int IMAGE_WIDTH = 60;
    private static final int IMAGE_HEIGHT = 60;
    private static final int RENDER_ORDER = 11;

    public FireBall(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getFireBallImage(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        checkClashWithPlayer(50, 50);
    }
}
