package com.plekhanov.game.gameObjects.enemies.druid;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;


public class Druid extends Enemy {

    private static final int IMAGE_WIDTH = 800;
    private static final int IMAGE_HEIGHT = 400;
    private static final int RENDER_ORDER = 10;
    private static final int LIFE = 3;

    private static final int SPEED_OF_CHANGE_WALK_IMAGES = 80;
    private static final int SPEED_OF_CHANGE_SHOOT_IMAGES = 120;
    private static final int SPEED_OF_CHANGE_SUMMON_IMAGES = 100;

    private static final int MAX_WALK_COUNT = SPEED_OF_CHANGE_WALK_IMAGES * 4;
    private static final int MAX_SHOOT_COUNT = SPEED_OF_CHANGE_SHOOT_IMAGES * 3;
    private static final int MAX_SUMMON_COUNT = SPEED_OF_CHANGE_SUMMON_IMAGES * 5;


    private boolean lookRight = false;
    private int walkCount;
    private int shootCount;
    private int summonCount;
    private Phase phase = Phase.SUMMON;

    private enum Phase {
        WALK,
        SHOOT,
        SUMMON
    }

    public Druid(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getDruid_walk_left_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        life = LIFE;
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        checkClashWithPlayer(160, 160);
        checkClashWithPlayerShoot(40, 100);
        changeImage();
        incrementCount();
    }


    private void changeImage() {
        if (!lookRight) {
            if (phase == Phase.WALK) {
                if (walkCount < SPEED_OF_CHANGE_WALK_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_walk_left_1();
                } else if (walkCount < SPEED_OF_CHANGE_WALK_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_walk_left_2();
                } else if (walkCount < SPEED_OF_CHANGE_WALK_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_walk_left_3();
                } else if (walkCount < SPEED_OF_CHANGE_WALK_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_walk_left_2();
                }
            }
            if (phase == Phase.SHOOT) {
                if (shootCount < SPEED_OF_CHANGE_WALK_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_shoot_left_2();
                } else if (shootCount < SPEED_OF_CHANGE_WALK_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_shoot_left_1();
                } else if (shootCount < SPEED_OF_CHANGE_WALK_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_shoot_left_3();
                }
            }
            if (phase == Phase.SUMMON) {
                if (summonCount < SPEED_OF_CHANGE_SUMMON_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_summon_left_1();
                } else if (summonCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_summon_left_2();
                } else if (summonCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_summon_left_3();
                } else if (summonCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_summon_left_4();
                } else if (summonCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 5) {
                    bufferedImage = ImageLoader.getDruid_summon_left_5();
                }
            }

        } else {
            if (phase == Phase.WALK) {
                if (walkCount < SPEED_OF_CHANGE_WALK_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_walk_right_1();
                } else if (walkCount < SPEED_OF_CHANGE_WALK_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_walk_right_2();
                } else if (walkCount < SPEED_OF_CHANGE_WALK_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_walk_right_3();
                } else if (walkCount < SPEED_OF_CHANGE_WALK_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_walk_right_2();
                }
            }
            if (phase == Phase.SHOOT) {
                if (shootCount < SPEED_OF_CHANGE_WALK_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_shoot_right_2();
                } else if (shootCount < SPEED_OF_CHANGE_WALK_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_shoot_right_1();
                } else if (shootCount < SPEED_OF_CHANGE_WALK_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_shoot_right_3();
                }
            }
            if (phase == Phase.SUMMON) {
                if (summonCount < SPEED_OF_CHANGE_SUMMON_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_summon_right_1();
                } else if (summonCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_summon_right_2();
                } else if (summonCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_summon_right_3();
                } else if (summonCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_summon_right_4();
                } else if (summonCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 5) {
                    bufferedImage = ImageLoader.getDruid_summon_right_5();
                }
            }
        }


    }

    @Override
    protected void incrementCount() {
        walkCount++;
        if (walkCount > MAX_WALK_COUNT) {
            walkCount = 0;
        }
        shootCount++;
        if (shootCount > MAX_SHOOT_COUNT) {
            shootCount = 0;
        }
        summonCount++;
        if (summonCount > MAX_SUMMON_COUNT) {
            summonCount = 0;
        }

    }
}
