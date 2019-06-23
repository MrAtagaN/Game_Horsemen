package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.ImageLoader;
import com.plekhanov.game.Model;


public class EnemyGargoly extends Enemy {

    private static final int imageWidth = 500;
    private static final int imageHeight = 500;
    private static final int renderOrder = 20;

    private boolean fly = true;


    public EnemyGargoly(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getGargolyFlyRight_1(), imageWidth, imageHeight, renderOrder, model);

        actionCountMax = 320;
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
        if (actionCount < 40 && fly) {
            this.bufferedImage = ImageLoader.getGargolyFlyRight_1();
        } else if (actionCount < 80 && fly) {
            this.bufferedImage = ImageLoader.getGargolyFlyRight_2();
        } else if (actionCount < 120 && fly) {
            this.bufferedImage = ImageLoader.getGargolyFlyRight_3();
        } else if (actionCount < 160 && fly) {
            this.bufferedImage = ImageLoader.getGargolyFlyRight_4();
        } else if (actionCount < 200 && fly) {
            this.bufferedImage = ImageLoader.getGargolyFlyRight_5();
        } else if (actionCount < 240 && fly) {
            this.bufferedImage = ImageLoader.getGargolyFlyRight_4();
        } else if (actionCount < 280 && fly) {
            this.bufferedImage = ImageLoader.getGargolyFlyRight_3();
        } else if (actionCount < 320 && fly) {
            this.bufferedImage = ImageLoader.getGargolyFlyRight_2();
        }


    }
}
