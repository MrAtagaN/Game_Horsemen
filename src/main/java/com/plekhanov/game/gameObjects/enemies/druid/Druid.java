package com.plekhanov.game.gameObjects.enemies.druid;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;

import java.util.Arrays;
import java.util.List;


public class Druid extends Enemy {

    private static final int IMAGE_WIDTH = 800;
    private static final int IMAGE_HEIGHT = 400;
    private static final int RENDER_ORDER = 10;
    private static final int LIFE = 3;

    /** Частота смены картинок */
    private static final int SPEED_OF_CHANGE_WALK_IMAGES = 80;
    private static final int SPEED_OF_CHANGE_SHOOT_IMAGES = 120;
    private static final int SPEED_OF_CHANGE_SUMMON_IMAGES = 100;

    /** Максимальное значение счетчика смены картинки */
    private static final int MAX_WALK_IMAGE_COUNT = SPEED_OF_CHANGE_WALK_IMAGES * 4;
    private static final int MAX_SHOOT_IMAGE_COUNT = SPEED_OF_CHANGE_SHOOT_IMAGES * 3;
    private static final int MAX_SUMMON_IMAGE_COUNT = SPEED_OF_CHANGE_SUMMON_IMAGES * 5;

    /**
     * Длительность фаз
     */
    private static final int MAX_WALK_PHASE_COUNT = 1000;
    private static final int MAX_SHOOT_PHASE_COUNT = MAX_SHOOT_IMAGE_COUNT;
    private static final int MAX_SUMMON_PHASE_COUNT = MAX_SUMMON_IMAGE_COUNT;

    /**
     * Последовательность фаз
     */
    private List<Phase> phases = Arrays.asList(Phase.WALK, Phase.SHOOT, Phase.WALK, Phase.SUMMON);
    private int phaseNumber = 0;

    private boolean lookRight = false;

    /**
     * Счетчик смены картинки
     */
    private int imageCount;

    /**
     * Счетчик смены фаз
     */
    private int phaseCount;

    private Phase phase = Phase.WALK;

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
        action();
        changeImage();
        incrementCount();
    }


    private void action() {}




    private void changeImage() {
        if (!lookRight) {
            if (phase == Phase.WALK) {
                if (imageCount < SPEED_OF_CHANGE_WALK_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_walk_left_1();
                } else if (imageCount < SPEED_OF_CHANGE_WALK_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_walk_left_2();
                } else if (imageCount < SPEED_OF_CHANGE_WALK_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_walk_left_3();
                } else if (imageCount < SPEED_OF_CHANGE_WALK_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_walk_left_2();
                }
            }
            if (phase == Phase.SHOOT) {
                if (imageCount < SPEED_OF_CHANGE_SHOOT_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_shoot_left_2();
                } else if (imageCount < SPEED_OF_CHANGE_SHOOT_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_shoot_left_1();
                } else if (imageCount < SPEED_OF_CHANGE_SHOOT_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_shoot_left_3();
                }
            }
            if (phase == Phase.SUMMON) {
                if (imageCount < SPEED_OF_CHANGE_SUMMON_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_summon_left_1();
                } else if (imageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_summon_left_2();
                } else if (imageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_summon_left_3();
                } else if (imageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_summon_left_4();
                } else if (imageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 5) {
                    bufferedImage = ImageLoader.getDruid_summon_left_5();
                }
            }

        } else {
            if (phase == Phase.WALK) {
                if (imageCount < SPEED_OF_CHANGE_WALK_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_walk_right_1();
                } else if (imageCount < SPEED_OF_CHANGE_WALK_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_walk_right_2();
                } else if (imageCount < SPEED_OF_CHANGE_WALK_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_walk_right_3();
                } else if (imageCount < SPEED_OF_CHANGE_WALK_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_walk_right_2();
                }
            }
            if (phase == Phase.SHOOT) {
                if (imageCount < SPEED_OF_CHANGE_SHOOT_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_shoot_right_2();
                } else if (imageCount < SPEED_OF_CHANGE_SHOOT_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_shoot_right_1();
                } else if (imageCount < SPEED_OF_CHANGE_SHOOT_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_shoot_right_3();
                }
            }
            if (phase == Phase.SUMMON) {
                if (imageCount < SPEED_OF_CHANGE_SUMMON_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_summon_right_1();
                } else if (imageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_summon_right_2();
                } else if (imageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_summon_right_3();
                } else if (imageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_summon_right_4();
                } else if (imageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 5) {
                    bufferedImage = ImageLoader.getDruid_summon_right_5();
                }
            }
        }


    }

    @Override
    protected void incrementCount() {
        imageCount++;
        phaseCount++;
        //Смена фаз
        if (phase == Phase.WALK) {
            if (imageCount > MAX_WALK_IMAGE_COUNT) {
                imageCount = 0;
            }
            if (phaseCount > MAX_WALK_PHASE_COUNT) {
                changePhase();
            }
        }
        if (phase == Phase.SHOOT) {
            if (imageCount > MAX_SHOOT_IMAGE_COUNT) {
                imageCount = 0;
            }
            if (phaseCount > MAX_SHOOT_PHASE_COUNT) {
                changePhase();
            }
        }
        if (phase == Phase.SUMMON) {
            if (imageCount > MAX_SUMMON_IMAGE_COUNT) {
                imageCount = 0;
            }
            if (phaseCount > MAX_SUMMON_PHASE_COUNT) {
                changePhase();
            }
        }

    }

    private void changePhase() {
        imageCount = 0;
        phaseCount = 0;
        phaseNumber++;
        if (phaseNumber >= phases.size()) {
            phaseNumber=0;
        }
        phase = phases.get(phaseNumber);
    }

}
