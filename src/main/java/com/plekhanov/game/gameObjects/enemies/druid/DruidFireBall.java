package com.plekhanov.game.gameObjects.enemies.druid;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;


public class DruidFireBall extends Enemy {

    private static final int IMAGE_WIDTH = 400;
    private static final int IMAGE_HEIGHT = 400;
    private static final int RENDER_ORDER = 20;

    public DruidFireBall(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getDruid_fire_ball_left_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        if (speedX > 0) {
            bufferedImage = ImageLoader.getDruid_fire_ball_right_1();
        }
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        checkClashWithPlayer(50, 50);
    }
}
