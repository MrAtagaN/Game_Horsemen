package com.plekhanov.game.gameObjects.enemies.archer;

import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;


public class Arrow extends Enemy {
    private static final int IMAGE_WIDTH = 380;
    private static final int IMAGE_HEIGHT = 380;
    private static final int RENDER_ORDER = 60;


    public Arrow(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getImagesLevel_1().getArrow(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);

    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        checkClashWithPlayer(50, 50);
    }
}
