package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.Game;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;

import java.awt.image.BufferedImage;


public class EnemyPestilence extends Enemy {

    private static final BufferedImage bufferedImage = ImageLoader.getEnemyPestilenceImage();
    private static final int IMAGE_WIDTH = 120;
    private static final int IMAGE_HEIGHT = 140;
    private static final int RENDER_ORDER = 14;


    public EnemyPestilence(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, bufferedImage, IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        actionCountMax = Game.UPDATES * 2;
        life = 3;
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        if (x <= -300) {
            x = ((int) (Math.random() * 500 + 2000));
            y = ((int) (Math.random() * 700 + 90));
        }

        //поведение
        if (actionCount < Game.UPDATES) {
            speedY = -0.2;
        } else {
            speedY = 0.2;
        }
        incrementCount();
        checkClashWithPlayerShoot(40, 80);
        checkClashWithPlayer(80, 80);
    }


}
