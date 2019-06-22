package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.Model;

public class EnemyGargoly extends Enemy {

    private static final int imageWidth = 500;
    private static final int imageHeight = 500;
    private static final int renderOrder = 13;

    private double MIN_Y;

    public EnemyGargoly(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, null, imageWidth, imageHeight, renderOrder, model);
        MIN_Y = y;
        actionCountMax = 300;
        life = 3;
    }
}
