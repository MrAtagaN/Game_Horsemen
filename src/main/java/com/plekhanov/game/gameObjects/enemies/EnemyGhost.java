package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.ImageLoader;
import com.plekhanov.game.Model;


public class EnemyGhost extends Enemy {

    private static final int IMAGE_WIDTH = 500;
    private static final int IMAGE_HEIGHT = 500;
    private static final int RENDER_ORDER = 10;

    private boolean lookRight = true;
    //счетчики
    private int flyCount = 0;
    private int MAX_FLY_COUNT = 280;

    public EnemyGhost(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getGhostFlyRight_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        changeImage();
        incrementCount();
    }


    private void changeImage() {

        if (lookRight) {
            if (flyCount < 40) {
                this.bufferedImage = ImageLoader.getGhostFlyRight_1();
            } else if (flyCount < 80) {
                this.bufferedImage = ImageLoader.getGhostFlyRight_2();
            } else if (flyCount < 120) {
                this.bufferedImage = ImageLoader.getGhostFlyRight_3();
            } else if (flyCount < 160) {
                this.bufferedImage = ImageLoader.getGhostFlyRight_4();
            } else if (flyCount < 200) {
                this.bufferedImage = ImageLoader.getGhostFlyRight_3();
            } else if (flyCount < 240) {
                this.bufferedImage = ImageLoader.getGhostFlyRight_2();
            } else if (flyCount < 280) {
                this.bufferedImage = ImageLoader.getGhostFlyRight_1();
            }
        } else {
            if (flyCount < 40) {
                this.bufferedImage = ImageLoader.getGargolyFlyLeft_1();
            } else if (flyCount < 80) {
                this.bufferedImage = ImageLoader.getGargolyFlyLeft_2();
            } else if (flyCount < 120) {
                this.bufferedImage = ImageLoader.getGargolyFlyLeft_3();
            } else if (flyCount < 160) {
                this.bufferedImage = ImageLoader.getGargolyFlyLeft_4();
            } else if (flyCount < 200) {
                this.bufferedImage = ImageLoader.getGargolyFlyLeft_5();
            } else if (flyCount < 240) {
                this.bufferedImage = ImageLoader.getGargolyFlyLeft_4();
            } else if (flyCount < 280) {
                this.bufferedImage = ImageLoader.getGargolyFlyLeft_3();
            } else if (flyCount < 320) {
                this.bufferedImage = ImageLoader.getGargolyFlyLeft_2();
            }
        }
    }

    @Override
    protected void incrementCount() {
        flyCount++;
        if (flyCount > MAX_FLY_COUNT) {
            flyCount = 0;
        }
    }

}
