package com.plekhanov.game.gameObjects.enemies.fire_elemental;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;


public class FireElementalFireBall extends Enemy {

    private static final int IMAGE_WIDTH = 380;
    private static final int IMAGE_HEIGHT = 380;
    private static final int RENDER_ORDER = 80;

    public FireElementalFireBall(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getFireElementalFireBall_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
    }
}
