package com.plekhanov.game.gameObjects.enemies.archer;

import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;


public class Archer extends Enemy {

    private static final int IMAGE_WIDTH = 380;
    private static final int IMAGE_HEIGHT = 380;
    private static final int RENDER_ORDER = 20;
    private static final double GRAVITY = 3;
    private static final double JUMP_UP = -1.6;
    private static final int MAX_RUN_COUNT = 300;
    private boolean hang = true;
    private boolean run = false;
    private double MIN_Y = 920;
    private int runCount = 0;

    public Archer(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getArcher_shoot_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        model.getGameObjects().add(new Rope(2000, 180, speedX, 0));
        life = 5;
        actionCountMax = 600;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        incrementCount();
        checkClashWithPlayer(100, 120);
        checkClashWithPlayerShoot(80, 100, AudioHelper.ARCHER_DEAD);

        if (hang) {
            shooting();
            if (Math.abs(model.getPlayer().getX() - x) < 300) {
                hang = false;
            }
        }
        if (!hang) {
            gravity();
        }

        if (y == MIN_Y) {
            run = true;
            goToPlayer();
        }

        if (y == MIN_Y && Math.abs(model.getPlayer().getX() - x) < 200 && model.getPlayer().getY() < 800) {
            jump();
            run = false;
        }
        setImage();
    }

    private void jump() {
        setSpeedY(JUMP_UP);
    }

    private void goToPlayer() {
        if (model.getPlayer().getX() - x > 0) {
            speedX = 0.7;
        } else {
            speedX = -0.7;
        }
    }

    private void shooting() {
        if (actionCount == 376) {
            model.getGameObjects().add(new Arrow(x - 20, y, -3, 0, model));
        }
    }

    private void setImage() {
        if (hang) {
            setShootingImage();
        }

        if (run) {
            setRunImage();
        }

        if (speedY > 0.1 || speedY < -0.1) {
            if (speedX > 0) {
                bufferedImage = ImageLoader.getArcher_jump_right();
            } else {
                bufferedImage = ImageLoader.getArcher_jump_left();
            }
        }
    }

    private void setRunImage() {
        runCount++;
        if (runCount > MAX_RUN_COUNT) {
            runCount = 0;
        }
        if (speedX > 0) {
            if (runCount < 75) {
                bufferedImage = ImageLoader.getArcher_run_right_1();
            } else if (runCount < 150) {
                bufferedImage = ImageLoader.getArcher_run_right_2();
            } else if (runCount < 225) {
                bufferedImage = ImageLoader.getArcher_run_right_3();
            } else {
                bufferedImage = ImageLoader.getArcher_run_right_2();
            }
        } else {
            if (runCount < 75) {
                bufferedImage = ImageLoader.getArcher_run_left_1();
            } else if (runCount < 150) {
                bufferedImage = ImageLoader.getArcher_run_left_2();
            } else if (runCount < 225) {
                bufferedImage = ImageLoader.getArcher_run_left_3();
            } else {
                bufferedImage = ImageLoader.getArcher_run_left_2();
            }
        }
    }

    private void setShootingImage() {
        if (actionCount < 75) {
            bufferedImage = ImageLoader.getArcher_shoot_1();
        } else if (actionCount < 150) {
            bufferedImage = ImageLoader.getArcher_shoot_2();
        } else if (actionCount < 225) {
            bufferedImage = ImageLoader.getArcher_shoot_3();
        } else if (actionCount < 300) {
            bufferedImage = ImageLoader.getArcher_shoot_4();
        } else if (actionCount < 375) {
            bufferedImage = ImageLoader.getArcher_shoot_5();
        } else if (actionCount < 450) {
            bufferedImage = ImageLoader.getArcher_shoot_6();
        } else if (actionCount < 525) {
            bufferedImage = ImageLoader.getArcher_shoot_3();
        } else if (actionCount < 600) {
            bufferedImage = ImageLoader.getArcher_shoot_2();
        }
    }

    private void gravity() {
        speedY += GRAVITY / 500;
        if (y > MIN_Y) {
            speedY = 0;
            y = MIN_Y;
        }
    }

}
