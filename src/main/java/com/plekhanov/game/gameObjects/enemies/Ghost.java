package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;


public class Ghost extends Enemy {

    private static final int IMAGE_WIDTH = 500;
    private static final int IMAGE_HEIGHT = 500;
    private static final int RENDER_ORDER = 10;
    private static final double SPEED_X = 0.7;
    private static final double SPEED_Y = 0.15;
    private static final int RANGE_TO_CHASE_X = 120;
    private static final int RANGE_TO_CHASE_Y = 300;
    private static final int MIN_Y = 370;

    private boolean lookRight = true;
    //счетчики
    private int flyCount = 0;
    private int MAX_FLY_COUNT = 280;

    public Ghost(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getGhostFlyRight_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        life = 3;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        changeImage();
        incrementCount();
        checkClashWithPlayerShoot(40, 100, AudioHelper.ghostDead());
        checkClashWithPlayer(100, 150);
        action();
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
                this.bufferedImage = ImageLoader.getGhostFlyLeft_1();
            } else if (flyCount < 80) {
                this.bufferedImage = ImageLoader.getGhostFlyLeft_2();
            } else if (flyCount < 120) {
                this.bufferedImage = ImageLoader.getGhostFlyLeft_3();
            } else if (flyCount < 160) {
                this.bufferedImage = ImageLoader.getGhostFlyLeft_4();
            } else if (flyCount < 200) {
                this.bufferedImage = ImageLoader.getGhostFlyLeft_3();
            } else if (flyCount < 240) {
                this.bufferedImage = ImageLoader.getGhostFlyLeft_2();
            } else if (flyCount < 280) {
                this.bufferedImage = ImageLoader.getGhostFlyLeft_1();
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

    private void action() {
        if ((x - model.getPlayer().getX()) > RANGE_TO_CHASE_X) {
            lookRight = false;
            speedX = -SPEED_X;

        }

        if ((x - model.getPlayer().getX()) < -RANGE_TO_CHASE_X) {
            lookRight = true;
            speedX = SPEED_X;
        }

        if (Math.abs((x - model.getPlayer().getX())) < RANGE_TO_CHASE_Y) {
            if (model.getPlayer().getY() - y > 50) {
                speedY = SPEED_Y;
            } else if (model.getPlayer().getY() - y < -50) {
                speedY = -SPEED_Y;
            } else {
                speedY = 0;
            }
        } else {
            if (y > MIN_Y) {
                speedY = -SPEED_Y;
            } else if (y < MIN_Y) {
                speedY = SPEED_Y;
            } else {
                speedY = 0;
            }
        }
    }


}
