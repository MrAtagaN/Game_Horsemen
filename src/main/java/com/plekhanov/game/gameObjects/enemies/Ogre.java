package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;


public class Ogre extends Enemy {

    private static final int IMAGE_WIDTH = 500;
    private static final int IMAGE_HEIGHT = 500;
    private static final int RENDER_ORDER = 13;

    private boolean walk = true;
    private boolean jump = false;

    private int walkCount;
    private int jumpCount;
    private int maxWalkCount = 300;
    private static final double JUMP_UP = -1.6;
    private static final double GRAVITY = 3;
    private double MIN_Y;


    public Ogre(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getEnemyOgreWalkImage_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        MIN_Y = y;
        actionCountMax = 300;
        life = 3;
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();

        checkClashWithPlayer(160, 160);

        if (x - model.getPlayer().getX() <= 400 && x - model.getPlayer().getX() >= 0 && y - model.getPlayer().getY() >= 100) {
            if (!jump) {
                jumpUp();
            }
        }

        speedY += GRAVITY / 500;
        if (y > MIN_Y) {
            speedY = 0;
            y = MIN_Y;
            jump = false;
            walk = true;
        }

        checkClashWithPlayerShoot(40, 100, AudioHelper.ZOMBIE_DEAD);
        changeImage();
        incrementCount();
    }


    private void changeImage() {
        if (walkCount < 50 && walk) {
            this.bufferedImage = ImageLoader.getEnemyOgreWalkImage_1();
        } else if (walkCount < 100 && walk) {
            this.bufferedImage = ImageLoader.getEnemyOgreWalkImage_2();
        } else if (walkCount < 150 && walk) {
            this.bufferedImage = ImageLoader.getEnemyOgreWalkImage_3();
        } else if (walkCount < 200 && walk) {
            this.bufferedImage = ImageLoader.getEnemyOgreWalkImage_4();
        } else if (walkCount < 250 && walk) {
            this.bufferedImage = ImageLoader.getEnemyOgreWalkImage_6(); //пятая картинка почти не отличается от четвертой
        } else if (walkCount < 300 && walk) {
            this.bufferedImage = ImageLoader.getEnemyOgreWalkImage_7();
        }

        if (jumpCount < 50 && jump) {
            this.bufferedImage = ImageLoader.getEnemyOgreJumpImage_1();
        } else if (jumpCount < 100 && jump) {
            this.bufferedImage = ImageLoader.getEnemyOgreJumpImage_2();
        } else if (jumpCount < 150 && jump) {
            this.bufferedImage = ImageLoader.getEnemyOgreJumpImage_3();
        } else if (jumpCount < 200 && jump) {
            this.bufferedImage = ImageLoader.getEnemyOgreJumpImage_4();
        }
//        if (jumpCount % 250 == 0 && jump) {
//            this.bufferedImage = jump5;
//        }
//        if (jumpCount % 250 == 0 && jump) {
//            this.bufferedImage = jump6;
//        }
//        if (jumpCount % 300 == 0 && jump) {
//            this.bufferedImage = jump7;
//        }
    }

    private void jumpUp() {
        jump = true;
        walk = false;
        setSpeedY(JUMP_UP);
    }

    @Override
    protected void incrementCount() {
        if (walk) {
            walkCount++;
            if (walkCount > maxWalkCount) {
                walkCount = 0;
            }
        } else {
            walkCount = 0;
        }

        if (jump) {
            jumpCount++;
        } else {
            jumpCount = 0;
        }
    }
}
