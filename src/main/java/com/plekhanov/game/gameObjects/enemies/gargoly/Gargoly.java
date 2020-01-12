package com.plekhanov.game.gameObjects.enemies.gargoly;

import com.plekhanov.game.Game;
import com.plekhanov.game.gameObjects.GameObject;
import com.plekhanov.game.gameObjects.PlayerShoot;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.utils.Utils;


public class Gargoly extends Enemy {

    private static final int IMAGE_WIDTH = 500;
    private static final int IMAGE_HEIGHT = 500;
    private static final int RENDER_ORDER = 20;
    private static final int DISTANCE_TO_FIRE_BALL_X = 300;
    private static final int DISTANCE_TO_FIRE_BALL_Y = 100;
    private static final double FLY_SPEED = 1;
    private static final double WALK_SPEED = 0.7;

    private static final double MAX_Y = 900;
    private static final double MIN_Y = 370;

    private boolean lookRight = true;
    private boolean fly = true;
    private boolean walk = false;
    private boolean jump = false;
    private boolean notLanding = true;
    private static final double JUMP_UP = -1.6;
    private static final double GRAVITY = 3;

    //счетчики
    private int flyCount = 0;
    private int MAX_FLY_COUNT = 320;

    private int walkCount = 0;
    private int MAX_WALK_COUNT = 160;

    private int jumpCount = 0;

    private int fireBallCreateCount = 0;
    private int MAX_STONE_CREATE_COUNT = 250;

    private boolean flyPhase = true;
    private int flyPhaseCount = 0;
    private int MAX_FLY_PHASE_COUNT = (int) Game.UPDATES * 10;

    private boolean walkPhase = false;
    private int walkPhaseCount = 0;
    private int MAX_WALK_PHASE_COUNT = (int) Game.UPDATES * 12;


    public Gargoly(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getGargolyFlyRight_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        life = 6;
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();

        action();

        checkClashWithPlayerShoot(40, 80, AudioHelper.GARGOLY_DEAD);
        changeImage();
        incrementCount();
        checkClashWithPlayer(100, 100);
        if (life <= 0) {
            Utils.threadSleep(2000);
            model.loadLevel(2);
        }
    }


    private void action() {
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

        if (jump) {
            if (lookRight) {
                if (jumpCount < 80) {
                    this.bufferedImage = ImageLoader.getGargolyJumpRight_1();
                } else {
                    this.bufferedImage = ImageLoader.getGargolyJumpRight_2();
                }
            } else {
                if (jumpCount < 80) {
                    this.bufferedImage = ImageLoader.getGargolyJumpLeft_1();
                } else {
                    this.bufferedImage = ImageLoader.getGargolyJumpLeft_2();
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

        if (jump) {
            jumpCount++;
        }

        fireBallCreateCount++;
        if (fireBallCreateCount > MAX_STONE_CREATE_COUNT) {
            fireBallCreateCount = 0;
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
        //Приземление
        if (y < MAX_Y && notLanding) {
            speedY = 0.5;
            setSpeed(FLY_SPEED);
        } else {
            notLanding = false;
            if (y >= MAX_Y) {
                fly = false;
                jump = false;
                walk = true;
                speedY = 0;
                setSpeed(WALK_SPEED);
                jumpCount = 0;
            } else {
                speedY += GRAVITY / 500;
            }
            chaseToPlayer();
        }
        //Условие прыжка - игрок сверху или приближение огненного шара
        if ((Math.abs(x - model.getPlayer().getX()) <= 500 && Math.abs(y - model.getPlayer().getY()) >= 100) || isFireBallNear()) {
            if (!jump && speedY == 0) {
                jumpUp();
            }
        }
    }


    private void jumpUp() {
        jump = true;
        walk = false;
        this.speedY = JUMP_UP;
    }


    private boolean isFireBallNear() {
        for (GameObject gameObject : model.getGameObjects()) {
            if (gameObject instanceof PlayerShoot) {
                if (Math.abs(gameObject.getX() - getX()) < DISTANCE_TO_FIRE_BALL_X && Math.abs(gameObject.getY() - getY()) < DISTANCE_TO_FIRE_BALL_Y) {
                   return true;
                }
            }
        }
        return false;
    }


    private void chaseToPlayer() {
        if ((model.getPlayer().getX() - x) > 0) {
            if (speedX < 0) {
                speedX = -speedX;
                lookRight = true;
            }
        } else {
            if (speedX > 0) {
                speedX = -speedX;
                lookRight = false;
            }
        }
    }


    private void flyPhaseAction() {
        notLanding = true;
        jump = false;
        if (y == MAX_Y) {
            fly = false;
            walk = true;
        } else {
            fly = true;
            walk = false;
        }
        if (y > MIN_Y) {
            speedY = -0.5;
            setSpeed(FLY_SPEED);
        } else {
            speedY = 0;
            setSpeed(WALK_SPEED);
        }

        if (fireBallCreateCount == 0) {
            model.getGameObjects().add(new GargolyFireBall(((int) (Math.random() * 10)) * 100 + 20, -100, 0, (Math.random() * 0.5 + 1), model));
            model.getGameObjects().add(new GargolyFireBall(((int) (Math.random() * 10)) * 100 + 1020, -100, 0, (Math.random() * 0.5 + 1), model));
        }

        setSpeed(FLY_SPEED);
    }


    private void setSpeed(double speed) {
        if (lookRight) {
            speedX = speed;
        } else {
            speedX = -speed;
        }

        if (x > 1820) {
            speedX = -speed;
            lookRight = false;
        }
        if (x < 100) {
            speedX = speed;
            lookRight = true;
        }
    }


}
