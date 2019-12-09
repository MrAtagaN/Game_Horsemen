package com.plekhanov.game.gameObjects.enemies.fire_elemental;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;


public class FireElemental extends Enemy {

    private static final int IMAGE_WIDTH = 380;
    private static final int IMAGE_HEIGHT = 380;
    private static final int RENDER_ORDER = 25;
    private static final int SPEED_OF_CHANGE_IMAGES = 60;

    private static final double SPEED_X = 0.8;

    private final int MAX_FLY_COUNT = SPEED_OF_CHANGE_IMAGES * 4;
    private final int MAX_IDLE_COUNT = SPEED_OF_CHANGE_IMAGES * 4;

    private final int MAX_COUNT_FLY_PHASE = 1500;
    private final int MAX_COUNT_IDLE_PHASE = 1500;
    private final int FREQUENCY_OF_FIRE_BALL = 150;
    private final int LIFE = 3;

    private int flyPhaseCount;
    private int idlePhaseCount;

    private int flyCount;
    private int idleCount;
    private boolean lookRight = false;
    private Phase phase = Phase.IDLE;

    private enum Phase {
        FLY,
        IDLE
    }


    public FireElemental(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getFireElementalFlyRight_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        this.life = LIFE;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        changeImage();
        incrementCount();
        action();
        checkClashWithPlayer(80, 80);
        checkClashWithPlayerShoot(40, 80);
    }


    @Override
    protected void incrementCount() {
        flyCount++;
        if (flyCount > MAX_FLY_COUNT) {
            flyCount = 0;
        }
        idleCount++;
        if (idleCount > MAX_IDLE_COUNT) {
            idleCount = 0;
        }
        //инкремент счетчиков фазы
        if (phase == Phase.IDLE) {
            idlePhaseCount++;
            if (idlePhaseCount > MAX_COUNT_IDLE_PHASE) {
                idlePhaseCount = 0;
                phase = Phase.FLY;
            }
        }
        if (phase == Phase.FLY) {
            flyPhaseCount++;
            if (flyPhaseCount > MAX_COUNT_FLY_PHASE) {
                flyPhaseCount = 0;
                phase = Phase.IDLE;
            }
        }
    }

    private void action() {
        if (phase == Phase.FLY) {
            if (x < 100) {
                lookRight = true;
            }
            if (x > 1820) {
                lookRight = false;
            }
            if (lookRight) {
                speedX = SPEED_X;
            } else {
                speedX = -SPEED_X;
            }


        }
        if (phase == Phase.IDLE) {
            speedX = 0;
            speedY = 0;
            if (idlePhaseCount == 100) {
                model.getGameObjects().add(new FireElementalFireBall(x, y, 0.1, 0.1, model));
            }
        }
    }

    private void changeImage() {
        if (lookRight) {
            if (phase == Phase.IDLE) {
                if (idleCount < SPEED_OF_CHANGE_IMAGES) {
                    this.bufferedImage = ImageLoader.getFireElementalIdleRight_1();
                } else if (idleCount < SPEED_OF_CHANGE_IMAGES * 2) {
                    this.bufferedImage = ImageLoader.getFireElementalIdleRight_2();
                } else if (idleCount < SPEED_OF_CHANGE_IMAGES * 3) {
                    this.bufferedImage = ImageLoader.getFireElementalIdleRight_3();
                } else if (idleCount < SPEED_OF_CHANGE_IMAGES * 4) {
                    this.bufferedImage = ImageLoader.getFireElementalIdleRight_2();
                }
            }
            if (phase == Phase.FLY) {
                if (flyCount < SPEED_OF_CHANGE_IMAGES) {
                    this.bufferedImage = ImageLoader.getFireElementalFlyRight_1();
                } else if (flyCount < SPEED_OF_CHANGE_IMAGES * 2) {
                    this.bufferedImage = ImageLoader.getFireElementalFlyRight_2();
                } else if (flyCount < SPEED_OF_CHANGE_IMAGES * 3) {
                    this.bufferedImage = ImageLoader.getFireElementalFlyRight_3();
                } else if (flyCount < SPEED_OF_CHANGE_IMAGES * 4) {
                    this.bufferedImage = ImageLoader.getFireElementalFlyRight_2();
                }
            }
        } else {
            if (phase == Phase.IDLE) {
                if (idleCount < SPEED_OF_CHANGE_IMAGES) {
                    this.bufferedImage = ImageLoader.getFireElementalIdleLeft_1();
                } else if (idleCount < SPEED_OF_CHANGE_IMAGES * 2) {
                    this.bufferedImage = ImageLoader.getFireElementalIdleLeft_2();
                } else if (idleCount < SPEED_OF_CHANGE_IMAGES * 3) {
                    this.bufferedImage = ImageLoader.getFireElementalIdleLeft_3();
                } else if (idleCount < SPEED_OF_CHANGE_IMAGES * 4) {
                    this.bufferedImage = ImageLoader.getFireElementalIdleLeft_2();
                }
            }
            if (phase == Phase.FLY) {
                if (flyCount < SPEED_OF_CHANGE_IMAGES) {
                    this.bufferedImage = ImageLoader.getFireElementalFlyLeft_1();
                } else if (flyCount < SPEED_OF_CHANGE_IMAGES * 2) {
                    this.bufferedImage = ImageLoader.getFireElementalFlyLeft_2();
                } else if (flyCount < SPEED_OF_CHANGE_IMAGES * 3) {
                    this.bufferedImage = ImageLoader.getFireElementalFlyLeft_3();
                } else if (flyCount < SPEED_OF_CHANGE_IMAGES * 4) {
                    this.bufferedImage = ImageLoader.getFireElementalFlyLeft_2();
                }
            }
        }
    }
}
