package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.Game;
import com.plekhanov.game.ImageLoader;
import com.plekhanov.game.Model;




public class EnemyGenie extends Enemy{

    private static final int imageWidth = 400;
    private static final int imageHeight = 400;
    private static final int renderOrder = 450;

    private int walkCount = 0;
    private final int maxWalkCount = 400;

    private int castCount = 0;
    private final int maxCastCount = 400;

    private int castCharge = 0;

    private boolean move = true;
    private boolean cast = false;



    public EnemyGenie(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getEnemyGenieMoveLeftImage_1(), imageWidth, imageHeight, renderOrder, model);
        life = 3;
        actionCountMax = Game.UPDATES * 20;
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();

        checkPlayerShoot();

        if (move) {
            changeImageWhenGenieMove();
        }

        if(cast) {
            speedX = 0;
            changeImageWhenGenieCasting();
            trowBlades();
        }

        if (x == 960) { // накапливаем заряд при пересечении центра экрана
            castCharge++;
        }

        if (castCharge == 3) {
            move = false;
            cast = true;
        }



        //разаорот направо
        if (x < 100 && move) {
            speedX = 1;
        }
        //разворот налево
        if (x > 1820 && move) {
            speedX = -1;
        }

        //проверка столкновения
        if (Math.abs(model.getPlayer().getX() - getX()) < 80 && Math.abs(model.getPlayer().getY() - getY()) < 80) {
            model.getPlayer().minusLife();
        }


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
            } else if (walkCount < 200)  {
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
            } else if (walkCount < 200)  {
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

        if(castCount >= maxCastCount) {
            castCount = 0;
        }

        if(castCount < 100) {
            bufferedImage = ImageLoader.getEnemyGenieCastImage_1();
        } else if (castCount < 200) {
            bufferedImage = ImageLoader.getEnemyGenieCastImage_2();
        } else if (castCount < 300) {
            bufferedImage = ImageLoader.getEnemyGenieCastImage_3();
        } else  {
            bufferedImage = ImageLoader.getEnemyGenieCastImage_2();
        }
    }

    private void trowBlades() {

         if (castCount == 100) {

             model.getGameObjects().add(new GenieSword(2080, (Math.random() * 750) + 150, -1, 0, ImageLoader.getGenieSwordMoveLeftImage_1(), 150, 150, 60, model));

             model.needToSortGameObjects();

         } else if (castCount == 200) {

             model.getGameObjects().add(new GenieSword(-100, (Math.random() * 750) + 150, 1, 0, ImageLoader.getGenieSwordMoveLeftImage_1(), 150, 150, 60, model));

             model.needToSortGameObjects();
         }





    }
}
