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

    private static final int SPEED_OF_CHANGE_WALK_IMAGES = 80;
    private static final int SPEED_OF_CHANGE_SHOOT_IMAGES = 120;
    private static final int SPEED_OF_CHANGE_SUMMON_IMAGES = 100;

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
    private int phaseCount = 0;

    private boolean lookRight = false;

    /**
     * Счетчики смены картинок
     */
    private int walkImageCount;
    private int shootImageCount;
    private int summonImageCount;

    /**
     * Счетчики смены фаз
     */
    private int walkPhaseCount;
    private int shootPhaseCount;
    private int summonPhaseCount;
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

    private void action() {
        if (walkPhaseCount > MAX_WALK_PHASE_COUNT) {
            walkImageCount = 0;
            walkPhaseCount = 0;
            phase = nextPhase();
        }
        if (shootPhaseCount > MAX_SHOOT_PHASE_COUNT) {
            shootImageCount = 0;
            shootPhaseCount = 0;
            phase = nextPhase();
        }
        if (summonPhaseCount > MAX_SUMMON_PHASE_COUNT) {
            summonImageCount = 0;
            summonPhaseCount = 0;
            phase = nextPhase();
        }

    }

    private Phase nextPhase() {
        phaseCount++;
        if (phaseCount >= phases.size()) {
            phaseCount=0;
        }
        return phases.get(phaseCount);
    }


    private void changeImage() {
        if (!lookRight) {
            if (phase == Phase.WALK) {
                if (walkImageCount < SPEED_OF_CHANGE_WALK_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_walk_left_1();
                } else if (walkImageCount < SPEED_OF_CHANGE_WALK_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_walk_left_2();
                } else if (walkImageCount < SPEED_OF_CHANGE_WALK_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_walk_left_3();
                } else if (walkImageCount < SPEED_OF_CHANGE_WALK_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_walk_left_2();
                }
            }
            if (phase == Phase.SHOOT) {
                if (shootImageCount < SPEED_OF_CHANGE_WALK_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_shoot_left_2();
                } else if (shootImageCount < SPEED_OF_CHANGE_WALK_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_shoot_left_1();
                } else if (shootImageCount < SPEED_OF_CHANGE_WALK_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_shoot_left_3();
                }
            }
            if (phase == Phase.SUMMON) {
                if (summonImageCount < SPEED_OF_CHANGE_SUMMON_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_summon_left_1();
                } else if (summonImageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_summon_left_2();
                } else if (summonImageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_summon_left_3();
                } else if (summonImageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_summon_left_4();
                } else if (summonImageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 5) {
                    bufferedImage = ImageLoader.getDruid_summon_left_5();
                }
            }

        } else {
            if (phase == Phase.WALK) {
                if (walkImageCount < SPEED_OF_CHANGE_WALK_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_walk_right_1();
                } else if (walkImageCount < SPEED_OF_CHANGE_WALK_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_walk_right_2();
                } else if (walkImageCount < SPEED_OF_CHANGE_WALK_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_walk_right_3();
                } else if (walkImageCount < SPEED_OF_CHANGE_WALK_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_walk_right_2();
                }
            }
            if (phase == Phase.SHOOT) {
                if (shootImageCount < SPEED_OF_CHANGE_WALK_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_shoot_right_2();
                } else if (shootImageCount < SPEED_OF_CHANGE_WALK_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_shoot_right_1();
                } else if (shootImageCount < SPEED_OF_CHANGE_WALK_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_shoot_right_3();
                }
            }
            if (phase == Phase.SUMMON) {
                if (summonImageCount < SPEED_OF_CHANGE_SUMMON_IMAGES) {
                    bufferedImage = ImageLoader.getDruid_summon_right_1();
                } else if (summonImageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 2) {
                    bufferedImage = ImageLoader.getDruid_summon_right_2();
                } else if (summonImageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 3) {
                    bufferedImage = ImageLoader.getDruid_summon_right_3();
                } else if (summonImageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 4) {
                    bufferedImage = ImageLoader.getDruid_summon_right_4();
                } else if (summonImageCount < SPEED_OF_CHANGE_SUMMON_IMAGES * 5) {
                    bufferedImage = ImageLoader.getDruid_summon_right_5();
                }
            }
        }


    }

    @Override
    protected void incrementCount() {
        //Инкремент счетчиков фаз и картинок
        if (phase == Phase.WALK) {
            walkPhaseCount++;
            walkImageCount++;
            if (walkImageCount > MAX_WALK_IMAGE_COUNT) {
                walkImageCount = 0;
            }
        }
        if (phase == Phase.SHOOT) {
            shootPhaseCount++;
            shootImageCount++;
            if (shootImageCount > MAX_SHOOT_IMAGE_COUNT) {
                shootImageCount = 0;
            }
        }
        if (phase == Phase.SUMMON) {
            summonPhaseCount++;
            summonImageCount++;
            if (summonImageCount > MAX_SUMMON_IMAGE_COUNT) {
                summonImageCount = 0;
            }
        }

    }
}
