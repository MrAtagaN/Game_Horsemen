package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.Model;
import com.plekhanov.game.utils.ImageLoader;

public class Skeleton extends Enemy {


    private static final int IMAGE_WIDTH = 300;
    private static final int IMAGE_HEIGHT = 300;
    private static final int RENDER_ORDER = 15;
    private static final int APPEAR_COMPLITE = 900;
    private boolean walk = false;
    private int appearCount = 0;


    public Skeleton(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getZombieWalk_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        life = 3;
        actionCountMax = 300;
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        setImage();
        incrementAppearCount();
        if (appearCount == APPEAR_COMPLITE && !walk) {
            setSpeedX(-0.7);
        }
        if (appearCount == APPEAR_COMPLITE) {
            walk = true;
            incrementCount();
            checkClashWithPlayerShoot(75, 100);
            checkClashWithPlayer(100, 100);
        }

        if (x < 200 && appearCount == APPEAR_COMPLITE && walk) {
            setSpeedX(0.5);
        }
        if (x > 1720 && appearCount == APPEAR_COMPLITE && walk) {
            setSpeedX(-0.7);
        }
    }

    private void setImage() {
        if (appearCount < 300) {
           bufferedImage = ImageLoader.getSkeleton_appear_left_1();
        } else if (appearCount < 600) {
            bufferedImage = ImageLoader.getSkeleton_appear_left_2();
        } else if (appearCount < 900) {
            bufferedImage = ImageLoader.getSkeleton_appear_left_3();
        } else if (actionCount < 75) {
            if (speedX < 0) {
                bufferedImage = ImageLoader.getSkeleton_walk_left_1();
            } else {
                bufferedImage = ImageLoader.getSkeleton_walk_right_1();
            }
        } else if (actionCount < 150) {
            if (speedX < 0) {
                bufferedImage = ImageLoader.getSkeleton_walk_left_2();
            } else {
                bufferedImage = ImageLoader.getSkeleton_walk_right_2();
            }
        } else if (actionCount < 225) {
            if (speedX < 0) {
                bufferedImage = ImageLoader.getSkeleton_walk_left_3();
            } else {
                bufferedImage = ImageLoader.getSkeleton_walk_right_3();
            }
        } else {
            if (speedX < 0) {
                bufferedImage = ImageLoader.getSkeleton_walk_left_2();
            } else {
                bufferedImage = ImageLoader.getSkeleton_walk_right_2();
            }
        }
    }

    private  void incrementAppearCount() {
        if (appearCount < APPEAR_COMPLITE ) {
            appearCount++;
        }
    }
}
