package com.plekhanov.game.gameObjects.enemies.gargoly;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;

public class GargolyFireBall extends Enemy {

    private static final int IMAGE_WIDTH = 200;
    private static final int IMAGE_HEIGHT = 200;
    private static final int RENDER_ORDER = 125;

    private int liveCycle = 0;

    public GargolyFireBall(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getGargolyFireBall_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();

        liveCycle++;
        checkClashWithPlayer(80, 60);
        setImage();
    }

    private void setImage() {
        if ((liveCycle / 50 % 2) == 0) {
            bufferedImage = ImageLoader.getGargolyFireBall_1();
        } else {
            bufferedImage = ImageLoader.getGargolyFireBall_2();
        }
    }




}
