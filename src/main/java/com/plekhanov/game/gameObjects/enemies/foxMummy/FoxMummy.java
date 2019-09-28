package com.plekhanov.game.gameObjects.enemies.foxMummy;

import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;


public class FoxMummy extends Enemy {

    private static final int IMAGE_WIDTH = 400;
    private static final int IMAGE_HEIGHT = 400;
    private static final int RENDER_ORDER = 12;
    private int walkCount = 0;
    private static final int MAX_WALK_COUNT = 300;
    private int shootingCount = 0;
    private int shootChardge = 0;
    private boolean mummyShootingPhase = false;  // мумия в фазе стрельбы


    public FoxMummy(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getImagesLevel_2().getEnemyFoxMummyWalkImage_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        life = 3;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();

        if (x <= -300) {   // обновляем муммию
            x = 2100;
            mummyShootingPhase = false;
            shootChardge = 0;
            shootingCount = 0;
        }

        incrementWalkCount();

        if (MummyInShootingZone() && mummyShootingPhase) {
            shoot();
        }

        if (!mummyShootingPhase) {
            speedX = -0.6;
        }

        setImage();
        checkClashWithPlayerShoot(40, 80);
        checkClashWithPlayer(80, 80);
    }


    private void setImage() {
        if (mummyShootingPhase) {
            bufferedImage = ImageLoader.getImagesLevel_2().getEnemyFoxMummyShoot_Image();
        } else {
            if (walkCount < 50) {
                bufferedImage = ImageLoader.getImagesLevel_2().getEnemyFoxMummyWalkImage_1();
            } else if (walkCount < 100) {
                bufferedImage = ImageLoader.getImagesLevel_2().getEnemyFoxMummyWalkImage_2();
            } else if (walkCount < 150) {
                bufferedImage = ImageLoader.getImagesLevel_2().getEnemyFoxMummyWalkImage_3();
            } else if (walkCount < 200) {
                bufferedImage = ImageLoader.getImagesLevel_2().getEnemyFoxMummyWalkImage_4();
            } else if (walkCount < 250) {
                bufferedImage = ImageLoader.getImagesLevel_2().getEnemyFoxMummyWalkImage_3(); //сетим картики в обратном направлении
            } else if (walkCount < 300) {
                bufferedImage = ImageLoader.getImagesLevel_2().getEnemyFoxMummyWalkImage_2();
            }
        }
    }


    private void incrementWalkCount() {
        if (walkCount >= MAX_WALK_COUNT) {
            walkCount = 0;
            shootChardge++; // накапливаем заряд для стрельбы
            if (shootChardge == 3) {
                mummyShootingPhase = true;
            }
        }

        if (!mummyShootingPhase) {
            walkCount++;
        }
    }


    private void shoot() {
        speedX = -0.5;

        if (shootChardge == 3) {

            double shiftX = 60;  // смещение для того чтобы fire ball вылетал из посоха
            double shiftY = 20;

            double diffX = model.getPlayer().getX() - (x - shiftX);
            double diffY = model.getPlayer().getY() - (y - shiftY);

            double reduceSpeed = 1.5 / (Math.abs(diffX) + Math.abs(diffY));

            model.getGameObjects().add(new MummyFireBall(getX() - shiftX, getY() - shiftY, diffX * reduceSpeed, diffY * reduceSpeed, ImageLoader.getImagesLevel_2().getMummyFireBallImage_1(), 60, 60, 15, model));

            model.needToSortGameObjects();
        }

        shootChardge = 0;  // обнуляем зарядяды и муммия стоит на месте некоторое время

        shootingCount++;
        if (shootingCount > 300) {
            mummyShootingPhase = false;
            shootingCount = 0;
        }
    }

    /**
     * зона стрельбы для мумии
     */
    private boolean MummyInShootingZone() {
        return (x < 1900 && x > 100);
    }
}
