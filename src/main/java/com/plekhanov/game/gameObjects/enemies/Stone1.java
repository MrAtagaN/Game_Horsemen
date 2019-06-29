package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.ImageLoader;
import com.plekhanov.game.Model;


public class Stone1 extends Enemy {

    private static final int imageWidth = 200;
    private static final int imageHeight = 200;
    private static final int renderOrder = 25;

    private int rotateCount = 0;
    private int MAX_ROTATE_COUNT = 320;

    public Stone1(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getStone1_pos1(), imageWidth, imageHeight, renderOrder, model);
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        changeImage();
        incrementCount();

        checkClashWithPlayer();
    }

    private void changeImage() {
        if (rotateCount < 40) {
            this.bufferedImage = ImageLoader.getStone1_pos1();
        } else if (rotateCount < 80 ) {
            this.bufferedImage = ImageLoader.getStone1_pos2();
        } else if (rotateCount < 120 ) {
            this.bufferedImage = ImageLoader.getStone1_pos3();
        } else if (rotateCount < 160 ) {
            this.bufferedImage = ImageLoader.getStone1_pos4();
        } else if (rotateCount < 200 ) {
            this.bufferedImage = ImageLoader.getStone1_pos5();
        } else if (rotateCount < 240 ) {
            this.bufferedImage = ImageLoader.getStone1_pos6();
        } else if (rotateCount < 280 ) {
            this.bufferedImage = ImageLoader.getStone1_pos7();
        } else if (rotateCount < 320 ) {
            this.bufferedImage = ImageLoader.getStone1_pos8();
        }
    }


    @Override
    protected void incrementCount() {
        rotateCount++;
        if (rotateCount > MAX_ROTATE_COUNT) {
            rotateCount = 0;
        }
    }


    private void checkClashWithPlayer() {
        if (Math.abs(model.getPlayer().getX() - getX()) < 80 && Math.abs(model.getPlayer().getY() - getY()) < 80) {
            model.getPlayer().minusLife();
        }
    }


}
