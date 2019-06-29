package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.Game;
import com.plekhanov.game.ImageLoader;
import com.plekhanov.game.Model;


public class EnemyGargoly extends Enemy {

    private static final int imageWidth = 500;
    private static final int imageHeight = 500;
    private static final int renderOrder = 20;
    private static final double FLY_SPEED = 1;
    private static final double WALK_SPEED = 0.6;


    private boolean lookRight = true;
    private boolean fly = true;
    private boolean walk = false;


    //счетчики
    private int flyCount = 0;
    private int MAX_FLY_COUNT = 320;

    private int walkCount = 0;
    private int MAX_WALK_COUNT = 160;

    private int stoneCreateCount = 0;
    private int MAX_STONE_CREATE_COUNT = 200;

    private boolean flyPhase = true;
    private int flyPhaseCount = 0;
    private int MAX_FLY_PHASE_COUNT = (int) Game.UPDATES * 5;

    private boolean walkPhase = false;
    private int walkPhaseCount = 0;
    private int MAX_WALK_PHASE_COUNT = (int) Game.UPDATES * 5;


    public EnemyGargoly(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getGargolyFlyRight_1(), imageWidth, imageHeight, renderOrder, model);
        life = 10;
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();

        changeAction();

        checkClashWithPlayerShoot(40,80);
        changeImage();
        incrementCount();
        checkClashWithPlayer();
    }


    private void changeAction() {

        if (walkPhase) {
            walkPhaseAction();
        }

        if (flyPhase) {
            flyPhaseAction();
        }

    }

    private void changeImage() {
        if (fly) {
            if (lookRight) {
                if (flyCount < 40) {
                    this.bufferedImage = ImageLoader.getGargolyFlyRight_1();
                } else if (flyCount < 80) {
                    this.bufferedImage = ImageLoader.getGargolyFlyRight_2();
                } else if (flyCount < 120) {
                    this.bufferedImage = ImageLoader.getGargolyFlyRight_3();
                } else if (flyCount < 160) {
                    this.bufferedImage = ImageLoader.getGargolyFlyRight_4();
                } else if (flyCount < 200) {
                    this.bufferedImage = ImageLoader.getGargolyFlyRight_5();
                } else if (flyCount < 240) {
                    this.bufferedImage = ImageLoader.getGargolyFlyRight_4();
                } else if (flyCount < 280) {
                    this.bufferedImage = ImageLoader.getGargolyFlyRight_3();
                } else if (flyCount < 320) {
                    this.bufferedImage = ImageLoader.getGargolyFlyRight_2();
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

        if (walk) {
            if (lookRight) {
                if (walkCount < 40) {
                    this.bufferedImage = ImageLoader.getGargolyWalkRight_1();
                } else if (walkCount < 80) {
                    this.bufferedImage = ImageLoader.getGargolyWalkRight_2();
                } else if (walkCount < 120) {
                    this.bufferedImage = ImageLoader.getGargolyWalkRight_3();
                } else if (walkCount < 160) {
                    this.bufferedImage = ImageLoader.getGargolyWalkRight_2();
                }
            } else {
                if (walkCount < 40) {
                    this.bufferedImage = ImageLoader.getGargolyWalkLeft_1();
                } else if (walkCount < 80) {
                    this.bufferedImage = ImageLoader.getGargolyWalkLeft_2();
                } else if (walkCount < 120) {
                    this.bufferedImage = ImageLoader.getGargolyWalkLeft_3();
                } else if (walkCount < 160) {
                    this.bufferedImage = ImageLoader.getGargolyWalkLeft_2();
                }
            }

        }
    }


    @Override
    protected void incrementCount() {
        flyCount++;
        if (flyCount > MAX_FLY_COUNT) {
            flyCount = 0;
        }

        walkCount++;
        if (walkCount > MAX_WALK_COUNT) {
            walkCount = 0;
        }

        stoneCreateCount++;
        if (stoneCreateCount > MAX_STONE_CREATE_COUNT) {
            stoneCreateCount = 0;
        }

        //счетчик fly фазы
        if (flyPhase) {
            flyPhaseCount++;
            if (flyPhaseCount > MAX_FLY_PHASE_COUNT) {
                flyPhaseCount = 0;

                walkPhase = true;
                flyPhase = false;
            }
        }

        //счетчик walk фазы
        if (walkPhase) {
            walkPhaseCount++;
            if (walkPhaseCount > MAX_WALK_PHASE_COUNT) {
                walkPhaseCount = 0;

                walkPhase = false;
                flyPhase = true;
            }
        }
    }


    private void walkPhaseAction() {
        fly = false;
        walk = true;

        setSpeed(WALK_SPEED);
    }

    private void flyPhaseAction() {
        fly = true;
        walk = false;

        if (stoneCreateCount == 0) {
            model.getGameObjects().add(new Stone1((Math.random() * 1900) + 20, -100, 0, 0.5, model));
            model.needToSortGameObjects();
        }

        setSpeed(FLY_SPEED);
    }


    private void setSpeed(double speed) {
        if (lookRight) {
            speedX = speed;
        } else {
            speedX = -speed;
        }

        if (x > 1800) {
            speedX = -speed;
            lookRight = false;
        }
        if (x < 100) {
            speedX = speed;
            lookRight = true;
        }
    }

    private void checkClashWithPlayer() {
        if (Math.abs(model.getPlayer().getX() - getX()) < 100 && Math.abs(model.getPlayer().getY() - getY()) < 100) {
            model.getPlayer().minusLife();
        }
    }
}
