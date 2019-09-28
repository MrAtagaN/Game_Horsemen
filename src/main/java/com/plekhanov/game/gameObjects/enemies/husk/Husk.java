package com.plekhanov.game.gameObjects.enemies.husk;

import com.plekhanov.game.Game;
import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;


import java.awt.image.BufferedImage;


public class Husk extends Enemy {

    private static final int IMAGE_WIDTH = 180;
    private static final int IMAGE_HEIGHT = 160;
    private static final int RENDER_ORDER = 12;

    private boolean alreadyShooted = false;


    public Husk(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getImagesLevel_1().getEnemyHuskImage(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        actionCountMax = Game.UPDATES * 2;
        life = 3;
    }


    @Override
    public void updateCoordinates() {
        //поведение
        if (actionCount < Game.UPDATES) {
            speedY = -0.05;
        } else {
            speedY = 0.05;
        }

        super.updateCoordinates();
        if (x <= -300) {
            x = ((int) (Math.random() * 500 + 2000));
            y = ((int) (Math.random() * 600 + 180));


        }

        checkClashWithPlayerShoot(40, 80);
        checkClashWithPlayer(80, 80);

        // летим и стреляем
        shoot();

        // увеличиваем счетчик действие если Husk в активной зоне или довожим счетчик до 0 если Husk пролетел активную
        // зону чтобы когда он окажется снова в активной зоне счетчик считал от 0
        if (huskInShootingZone() || actionCount > 0) {
            incrementCount();
        }

    }


    private void shoot() {
        if (huskInShootingZone() && actionCount > Game.UPDATES * 1 && !alreadyShooted) {

            alreadyShooted = true;

            double diffX = model.getPlayer().getX() - x;
            double diffY = model.getPlayer().getY() - y;

            double reduceSpeed = 1 / (Math.abs(diffX) + Math.abs(diffY));

            model.getGameObjects().add(new FireBall(getX(), getY(), diffX * reduceSpeed, diffY * reduceSpeed, ImageLoader.getImagesLevel_1().getFireBallImage(), 60, 60, 11, model));

            model.needToSortGameObjects();
        }
        if (actionCount < Game.UPDATES * 1) {
            alreadyShooted = false;
        }
    }


    @Override
    public BufferedImage getBufferedImage() {
        if (actionCount > Game.UPDATES * 1 && actionCount < Game.UPDATES * 1.5 && huskInShootingZone()) {
            return ImageLoader.getImagesLevel_1().getEnemyHuskShootImage();
        }
        return super.getBufferedImage();
    }

    /**
     * зона стрельбы для  Husk'а
     */
    private boolean huskInShootingZone() {
        return x > 0 && x < 1800;
    }
}
