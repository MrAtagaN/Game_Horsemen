package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.Game;
import com.plekhanov.game.ImageLoader;
import com.plekhanov.game.Model;


public class EnemyGenie extends Enemy {

    private static final int imageWidth = 400;
    private static final int imageHeight = 400;
    private static final int renderOrder = 450;

    private int walkCount = 0;
    private final int maxWalkCount = 400;

    private int castCount = 0;
    private final int maxCastCount = 400;

    private int moveToPlayerCount = 0;
    private final int maxMoveToPlayerCount = (int)Game.UPDATES * 10;

    private int blinkCount = 0;
    private final int maxBlinkCount = (int)Game.UPDATES *10;

    private boolean move = true;
    private boolean cast = false;
    private boolean blinkAndShoot = false;

    private boolean throwedLeft = true;


    public EnemyGenie(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getEnemyGenieMoveLeftImage_1(), imageWidth, imageHeight, renderOrder, model);
        life = 10;
        actionCountMax = Game.UPDATES * 10;
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();

        if (move) {
            changeImageWhenGenieMove();
            moveToPlayer();
            moveToPlayerCount++;
        }

        if (blinkAndShoot) {
            changeImageWhenGenieCasting();

            if (blinkCount % (int) Game.UPDATES == 0) {
                blink();
                shoot();
            }

            blinkCount++;
            if (blinkCount > maxBlinkCount) { //заканчиваем блинкаться и стрелять
                blinkCount = 0;
                castCount = 0;
                walkCount = 0;
                blinkAndShoot = false;
                move = true;   // начинаем преследовать игрока
            }

        }

        if (cast) {
            speedX = 0;
            if (y > 500) {
                speedY = -0.6;
            } else {
                speedY = 0;
            }

            changeImageWhenGenieCasting();
            trowBlades();
            actionCount++;
            if (actionCount > actionCountMax) { // заканчиваем кидать мечи
                actionCount = 0;
                castCount = 0;
                walkCount = 0;
                cast = false;
                blinkAndShoot = true; // начинаем блинкаться и стрелять
                move = false;
            }
        }

        if (moveToPlayerCount == maxMoveToPlayerCount) {
            move = false;
            cast = true;
            moveToPlayerCount = 0;
        }

        checkClashWithPlayer(80, 80);
        checkClashWithPlayerShoot(40, 80);
    }

    private void changeImageWhenGenieMove() {
        walkCount++;

        if (walkCount >= maxWalkCount) {
            walkCount = 0;
        }

        if (speedX < 0) {

            if (walkCount < 50) {
                bufferedImage = ImageLoader.getEnemyGenieMoveLeftImage_1();
            } else if (walkCount < 100) {
                bufferedImage = ImageLoader.getEnemyGenieMoveLeftImage_2();
            } else if (walkCount < 150) {
                bufferedImage = ImageLoader.getEnemyGenieMoveLeftImage_3();
            } else if (walkCount < 200) {
                bufferedImage = ImageLoader.getEnemyGenieMoveLeftImage_4();
            } else if (walkCount < 250) {
                bufferedImage = ImageLoader.getEnemyGenieMoveLeftImage_5();
            } else if (walkCount < 300) {
                bufferedImage = ImageLoader.getEnemyGenieMoveLeftImage_4();
            } else if (walkCount < 350) {
                bufferedImage = ImageLoader.getEnemyGenieMoveLeftImage_3();
            } else {
                bufferedImage = ImageLoader.getEnemyGenieMoveLeftImage_2();
            }

        } else {

            if (walkCount < 50) {
                bufferedImage = ImageLoader.getEnemyGenieMoveRightImage_1();
            } else if (walkCount < 100) {
                bufferedImage = ImageLoader.getEnemyGenieMoveRightImage_2();
            } else if (walkCount < 150) {
                bufferedImage = ImageLoader.getEnemyGenieMoveRightImage_3();
            } else if (walkCount < 200) {
                bufferedImage = ImageLoader.getEnemyGenieMoveRightImage_4();
            } else if (walkCount < 250) {
                bufferedImage = ImageLoader.getEnemyGenieMoveRightImage_5();
            } else if (walkCount < 300) {
                bufferedImage = ImageLoader.getEnemyGenieMoveRightImage_4();
            } else if (walkCount < 350) {
                bufferedImage = ImageLoader.getEnemyGenieMoveRightImage_3();
            } else {
                bufferedImage = ImageLoader.getEnemyGenieMoveRightImage_2();
            }
        }
    }

    private void changeImageWhenGenieCasting() {
        castCount++;

        if (castCount >= maxCastCount) {
            castCount = 0;
        }

        if (castCount < 100) {
            bufferedImage = ImageLoader.getEnemyGenieCastImage_1();
        } else if (castCount < 200) {
            bufferedImage = ImageLoader.getEnemyGenieCastImage_2();
        } else if (castCount < 300) {
            bufferedImage = ImageLoader.getEnemyGenieCastImage_3();
        } else {
            bufferedImage = ImageLoader.getEnemyGenieCastImage_2();
        }
    }

    private void trowBlades() {
        if ((int)actionCount%Game.UPDATES == 0 ) {

            if(throwedLeft) {
                model.getGameObjects().add(new GenieSword(2080, (Math.random() * 750) + 150, -1, 0, ImageLoader.getGenieSwordMoveLeftImage_1(), model));

                model.needToSortGameObjects();
                throwedLeft = false;
            } else {
                model.getGameObjects().add(new GenieSword(-100, (Math.random() * 750) + 150, 1, 0, ImageLoader.getGenieSwordMoveLeftImage_1(), model));

                model.needToSortGameObjects();
                throwedLeft = true;
            }
        }
    }


    private void moveToPlayer(){
        double diffX = model.getPlayer().getX() - x;
        double diffY = model.getPlayer().getY() - y;

        double reduceSpeed = 1 / (Math.abs(diffX) + Math.abs(diffY));

        speedX = diffX * reduceSpeed;
        speedY = diffY * reduceSpeed;
    }


    private void blink() {
        x = (Math.random() * 1700) + 100;
        y = (Math.random() * 300) + 100;
    }


    private void shoot() {
        double diffX = model.getPlayer().getX() - x;
        double diffY = model.getPlayer().getY() - y;

        double reduceSpeed = 1 / (Math.abs(diffX) + Math.abs(diffY));

        model.getGameObjects().add(new SawFireBall(getX(), getY(), diffX * reduceSpeed, diffY * reduceSpeed, ImageLoader.getFireBallImage(), 150, 150, 11, model));
    }

}
