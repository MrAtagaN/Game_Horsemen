package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.Game;
import com.plekhanov.game.ImageLoader;
import com.plekhanov.game.Model;

import java.awt.image.BufferedImage;


public class EnemyCarrion extends Enemy {

    private static BufferedImage bufferedImage = ImageLoader.getEnemyCarrionImage();
    private static BufferedImage hungryImage = ImageLoader.getHungryCarrion();
    private static final int IMAGE_WIDTH = 180;
    private static final int IMAGE_HEIGHT = 120;
    private static final int RENDER_ORDER = 13;


    public EnemyCarrion(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, bufferedImage, IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        actionCountMax = Game.UPDATES * 1;
        life = 3;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        if (x <= -300) {
            x = ((int) (Math.random() * 500 + 2000));
        }
        checkClashWithPlayer(80, 80);
        checkClashWithPlayerShoot(40, 80);

        //поведение
        if (actionCount < Game.UPDATES * 0.6) {
            speedX = -1.5;
        } else {
            speedX = -0.5;
        }
        incrementCount();
    }

    @Override
    public BufferedImage getBufferedImage() {
        if (actionCount < Game.UPDATES / 2) {
            return hungryImage;
        }
        return super.getBufferedImage();
    }

}
