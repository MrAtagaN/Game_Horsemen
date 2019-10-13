package com.plekhanov.game.gameObjects.enemies.necromancer;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.gameObjects.enemies.archer.Rope;
import com.plekhanov.game.utils.ImageLoader;

import java.awt.image.BufferedImage;

public class Necromancer extends Enemy {

    private static final int IMAGE_WIDTH = 380;
    private static final int IMAGE_HEIGHT = 380;
    private static final int RENDER_ORDER = 20;


    public Necromancer(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getArcher_shoot_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        life = 5;
        actionCountMax = 300;

    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        incrementCount();
        setImage();
    }

    private void setImage() {

        if (actionCount < 75) {
            bufferedImage = ImageLoader.getNecromancer_walk_1();
        } else if (actionCount < 150) {
            bufferedImage = ImageLoader.getNecromancer_walk_2();
        } else if (actionCount < 225) {
            bufferedImage = ImageLoader.getNecromancer_walk_3();
        } else {
            bufferedImage = ImageLoader.getNecromancer_walk_2();
        }
    }
}
