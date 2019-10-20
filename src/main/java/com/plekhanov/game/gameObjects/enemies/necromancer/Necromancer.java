package com.plekhanov.game.gameObjects.enemies.necromancer;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;

public class Necromancer extends Enemy {

    private static final int IMAGE_WIDTH = 380;
    private static final int IMAGE_HEIGHT = 380;
    private static final int RENDER_ORDER = 18;
    private int createdSkeleton = 0;
    private int castSkeletonCount = 0;
    private int castVacuumCount = 0;
    private boolean walk = true;
    private boolean cast_skeleton = false;
    private boolean cast_vacuum = false;


    public Necromancer(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getNecromancer_walk_left_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        life = 5;
        actionCountMax = 300;

    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        incrementCount();
        checkClashWithPlayer(110, 120);
        checkClashWithPlayerShoot(80, 100);
        if (walk) {
            setWalkImage();
        } else if (cast_skeleton) {
            castSkeleton();
        } else if (cast_vacuum) {
            castVacuum();
        }

        if (x < 1500 && walk && speedX < 0) { // заканчиваем идти налево, начинаем кастовать скелета
            beginCastSkeleton();
        }

        if (createdSkeleton == 2) { // если создали 2 скелетов прекращаем кастовать скелетов, начинаем кастовать вакуум
            beginCastVacuum();
        }

        if (x < 200) {  // если  дошли до левого края идём направо до правого края
            beginWalkRight();
        }

        if (x > 1750 && speedX > 0) { // если дошли до правого края идём налево, начинаем цикл наного
            setSpeedX(-0.5);
        }
    }

    private void setWalkImage() {

        if (speedX < 0) {
            if (actionCount < 75) {
                bufferedImage = ImageLoader.getNecromancer_walk_left_1();
            } else if (actionCount < 150) {
                bufferedImage = ImageLoader.getNecromancer_walk_left_2();
            } else if (actionCount < 225) {
                bufferedImage = ImageLoader.getNecromancer_walk_left_3();
            } else {
                bufferedImage = ImageLoader.getNecromancer_walk_left_2();
            }
        } else {
            if (actionCount < 75) {
                bufferedImage = ImageLoader.getNecromancer_walk_right_1();
            } else if (actionCount < 150) {
                bufferedImage = ImageLoader.getNecromancer_walk_right_2();
            } else if (actionCount < 225) {
                bufferedImage = ImageLoader.getNecromancer_walk_right_3();
            } else {
                bufferedImage = ImageLoader.getNecromancer_walk_right_2();
            }
        }
    }

    private void castSkeleton() {
        castSkeletonCount++;
        if (castSkeletonCount < 75) {
            bufferedImage = ImageLoader.getNecromancer_cast_1();
        } else if (castSkeletonCount < 150) {
            bufferedImage = ImageLoader.getNecromancer_cast_2();
        } else if (castSkeletonCount < 225) {
            bufferedImage = ImageLoader.getNecromancer_cast_3();
        } else {
            bufferedImage = ImageLoader.getNecromancer_cast_4();
        }
        if (castSkeletonCount == 600) {
            castSkeletonCount = 0;
            // создать скелета
            createdSkeleton++;
        }
    }

    private void castVacuum() {
        castVacuumCount++;
        if (castVacuumCount < 75) {
            bufferedImage = ImageLoader.getNecromancer_cast_4();
        } else if (castVacuumCount < 150) {
            bufferedImage = ImageLoader.getNecromancer_cast_vacuum_1();
        } else if (castVacuumCount < 225) {
            bufferedImage = ImageLoader.getNecromancer_cast_vacuum_2();
        } else {
            bufferedImage = ImageLoader.getNecromancer_cast_vacuum_3();
        }

        if (castVacuumCount == 300) {
            castVacuumCount = 0;
        }

        //TODO сделать вакуум

    }

    private void beginCastSkeleton() {
        createdSkeleton = 0;
        walk = false;
        cast_skeleton = true;
        cast_vacuum = false;
        setSpeedX(-0.5);
    }

    private void beginCastVacuum() {
        createdSkeleton = 0;
        castVacuumCount = 0;
        cast_skeleton = false;
        cast_vacuum = true;
        walk = false;
        setSpeedX(-0.5);
    }

    private void beginWalkRight() {
        actionCount = 0;
        walk = true;
        cast_skeleton = false;
        cast_vacuum = false;
        setSpeedX(0.3);
    }
}
