package com.plekhanov.game.gameObjects.enemies.archer;

import com.plekhanov.game.ImageLoader;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.enemies.Enemy;


public class Archer extends Enemy {

    private static final int IMAGE_WIDTH = 380;
    private static final int IMAGE_HEIGHT = 380;
    private static final int RENDER_ORDER = 20;

    public Archer(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getArcher_shoot_1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        model.getGameObjects().add(new Rope(2000, 250, speedX, 0));
        life = 5;
        actionCountMax = 600;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        incrementCount();
        checkClashWithPlayer(100, 120);
        checkClashWithPlayerShoot(80, 100);
        shooting();
    }

    private void shooting() {

        setShootingImage();
        if (actionCount == 376) {
            model.getGameObjects().add(new Arrow(x - 20, y, -3, 0, model));
        }

    }

    private void setShootingImage(){
        if (actionCount < 75) {
            bufferedImage = ImageLoader.getArcher_shoot_1();
        } else if (actionCount < 150) {
            bufferedImage = ImageLoader.getArcher_shoot_2();
        } else if (actionCount < 225) {
            bufferedImage = ImageLoader.getArcher_shoot_3();
        } else if (actionCount < 300) {
            bufferedImage = ImageLoader.getArcher_shoot_4();
        } else if (actionCount < 375) {
            bufferedImage = ImageLoader.getArcher_shoot_5();
        } else if (actionCount < 450) {
            bufferedImage = ImageLoader.getArcher_shoot_6();
        } else if (actionCount < 525) {
            bufferedImage = ImageLoader.getArcher_shoot_3();
        } else if (actionCount < 600) {
            bufferedImage = ImageLoader.getArcher_shoot_2();
        }
    }
}
