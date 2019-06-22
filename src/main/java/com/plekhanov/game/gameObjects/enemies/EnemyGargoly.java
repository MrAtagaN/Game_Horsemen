package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.ImageLoader;
import com.plekhanov.game.Model;

import java.awt.image.BufferedImage;

public class EnemyGargoly extends Enemy {

    private static final int imageWidth = 500;
    private static final int imageHeight = 500;
    private static final int renderOrder = 13;

    private boolean fly = true;

    private static final BufferedImage flyRight_1 = ImageLoader.getGargolyFlyRight_1();
    private static final BufferedImage flyRight_2 = ImageLoader.getGargolyFlyRight_2();
    private static final BufferedImage flyRight_3 = ImageLoader.getGargolyFlyRight_3();
    private static final BufferedImage flyRight_4 = ImageLoader.getGargolyFlyRight_4();
    private static final BufferedImage flyRight_5 = ImageLoader.getGargolyFlyRight_5();


    public EnemyGargoly(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, flyRight_1, imageWidth, imageHeight, renderOrder, model);

        actionCountMax = 400;
        life = 3;
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();

        checkPlayerShoot();
        changeImage();
        incrementCount();
    }


    private void changeImage() {
        if (actionCount < 50 && fly) {
            this.bufferedImage = flyRight_1;
        } else if (actionCount < 100 && fly) {
            this.bufferedImage = flyRight_2;
        } else if (actionCount < 150 && fly) {
            this.bufferedImage = flyRight_3;
        } else if (actionCount < 200 && fly) {
            this.bufferedImage = flyRight_4;
        } else if (actionCount < 250 && fly) {
            this.bufferedImage = flyRight_5;
        } else if (actionCount < 300 && fly) {
            this.bufferedImage = flyRight_4;
        } else if (actionCount < 350 && fly) {
            this.bufferedImage = flyRight_3;
        } else if (actionCount < 400 && fly) {
            this.bufferedImage = flyRight_2;
        }


    }
}
