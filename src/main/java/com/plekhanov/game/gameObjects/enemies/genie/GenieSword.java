package com.plekhanov.game.gameObjects.enemies.genie;

import com.plekhanov.game.gameObjects.enemies.Enemy;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;

import java.awt.image.BufferedImage;


public class GenieSword extends Enemy {

    private static final int IMAGE_WIDTH = 150;
    private static final int IMAGE_HEIGHT = 150;
    private static final int RENDER_ORDER = 60;


    public GenieSword(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, Model model) {
        super(x, y, speedX, speedY, bufferedImage, IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER, model);

        actionCountMax = 200;
        actionCount = Math.random() * 200; // чтобы мечи не летали синхронно
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();

        checkClashWithPlayer(60, 90);
        incrementCount();
        setImage();
    }

    private void setImage() {
        if (speedX < 0) {
            if (actionCount < 12.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_1();
            } else if (actionCount < 25) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_2();
            } else if (actionCount < 37.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_3();
            } else if (actionCount < 50) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_4();
            } else if (actionCount < 62.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_5();
            } else if (actionCount < 75) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_6();
            } else if (actionCount < 87.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_7();
            } else if (actionCount < 100) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_8();
            } else if (actionCount < 112.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_9();
            } else if (actionCount < 125) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_10();
            } else if (actionCount < 137.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_11();
            } else if (actionCount < 150) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_12();
            } else if (actionCount < 162.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_13();
            } else if (actionCount < 175) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_14();
            } else if (actionCount < 182.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_15();
            } else if (actionCount < 200) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveLeftImage_16();
            }
        } else {
            if (actionCount < 12.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_1();
            } else if (actionCount < 25) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_2();
            } else if (actionCount < 37.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_3();
            } else if (actionCount < 50) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_4();
            } else if (actionCount < 62.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_5();
            } else if (actionCount < 75) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_6();
            } else if (actionCount < 87.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_7();
            } else if (actionCount < 100) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_8();
            } else if (actionCount < 112.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_9();
            } else if (actionCount < 125) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_10();
            } else if (actionCount < 137.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_11();
            } else if (actionCount < 150) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_12();
            } else if (actionCount < 162.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_13();
            } else if (actionCount < 175) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_14();
            } else if (actionCount < 182.5) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_15();
            } else if (actionCount < 200) {
                bufferedImage = ImageLoader.getImagesLevel_2().getGenieSwordMoveRightImage_16();
            }
        }


    }

}
