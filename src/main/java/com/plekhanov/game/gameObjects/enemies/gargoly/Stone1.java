package com.plekhanov.game.gameObjects.enemies.gargoly;

import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;


public class Stone1 extends Enemy {

    private static final int IMAGE_WIDTH = 200;
    private static final int IMAGE_HEIGHT = 200;
    private static final int RENDER_ORDER = 25;

    private boolean rotateRight;
    private int rotateCount = 0;
    private int MAX_ROTATE_COUNT = 320;

    public Stone1(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getImagesLevel_1().getStone1_pos1(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);
        if ( Math.random() > 0.4) {
            rotateRight = true;
        } else {
            rotateRight = false;
        }
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        changeImage();
        incrementCount();
        checkClashWithPlayer(70, 60);
    }

    private void changeImage() {
        if (rotateCount < 20) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos1() : ImageLoader.getImagesLevel_1().getStone1_pos16();
        } else if (rotateCount < 40) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos2() : ImageLoader.getImagesLevel_1().getStone1_pos15();
        } else if (rotateCount < 60) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos3() : ImageLoader.getImagesLevel_1().getStone1_pos14();
        } else if (rotateCount < 80) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos4() : ImageLoader.getImagesLevel_1().getStone1_pos13();
        } else if (rotateCount < 100) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos5() : ImageLoader.getImagesLevel_1().getStone1_pos12();
        } else if (rotateCount < 120) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos6() : ImageLoader.getImagesLevel_1().getStone1_pos11();
        } else if (rotateCount < 140) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos7() : ImageLoader.getImagesLevel_1().getStone1_pos10();
        } else if (rotateCount < 160) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos8() : ImageLoader.getImagesLevel_1().getStone1_pos9();
        } else if (rotateCount < 180) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos9() : ImageLoader.getImagesLevel_1().getStone1_pos8();
        } else if (rotateCount < 200) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos10() : ImageLoader.getImagesLevel_1().getStone1_pos7();
        } else if (rotateCount < 220) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos11() : ImageLoader.getImagesLevel_1().getStone1_pos6();
        } else if (rotateCount < 240) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos12() : ImageLoader.getImagesLevel_1().getStone1_pos5();
        } else if (rotateCount < 260) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos13() : ImageLoader.getImagesLevel_1().getStone1_pos4();
        } else if (rotateCount < 280) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos14() : ImageLoader.getImagesLevel_1().getStone1_pos3();
        } else if (rotateCount < 300) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos15() : ImageLoader.getImagesLevel_1().getStone1_pos2();
        } else if (rotateCount < 320) {
            this.bufferedImage = rotateRight ? ImageLoader.getImagesLevel_1().getStone1_pos16() : ImageLoader.getImagesLevel_1().getStone1_pos1();
        }
    }


    @Override
    protected void incrementCount() {
        rotateCount++;
        if (rotateCount > MAX_ROTATE_COUNT) {
            rotateCount = 0;
        }
    }



}
