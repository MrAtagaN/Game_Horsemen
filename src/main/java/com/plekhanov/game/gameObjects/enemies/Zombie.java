package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;



public class Zombie extends Enemy {

    private static final int IMAGE_WIDTH = 450;
    private static final int IMAGE_HEIGHT = 450;
    private static final int RENDER_ORDER = 14;


    public Zombie(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getZombieWalk_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        life = 3;
        actionCountMax = 300;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        setImage();
        incrementCount();
        checkClashWithPlayerShoot(80, 100);
        checkClashWithPlayer(100, 100);
    }

    private void setImage() {

        if (actionCount < 75) {
            bufferedImage = ImageLoader.getZombieWalk_1();
        } else if (actionCount < 150) {
            bufferedImage = ImageLoader.getZombieWalk_2();
        } else if (actionCount < 225) {
            bufferedImage = ImageLoader.getZombieWalk_3();
        } else {
            bufferedImage = ImageLoader.getZombieWalk_2();
        }
    }
}
