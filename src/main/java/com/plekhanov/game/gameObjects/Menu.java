package com.plekhanov.game.gameObjects;

import com.plekhanov.game.Model;
import com.plekhanov.game.utils.ImageLoader;

import java.awt.image.BufferedImage;

public class Menu extends GameObject {

    protected Model model;

    public Menu(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder, Model model) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder);
        this.model = model;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        if (model.isMenuImageChanged()) {
            if (model.getMenuImageNumber() == 1) {
                model.getGameObjects().add(new Menu(imageWidth / 2, imageHeight / 2, 0, 0,
                        ImageLoader.getMenu1(), imageWidth, imageHeight, 110, model));
            } else if (model.getMenuImageNumber() == 2) {
                model.getGameObjects().add(new Menu(imageWidth / 2, imageHeight / 2, 0, 0,
                        ImageLoader.getMenu2(), imageWidth, imageHeight, 110, model));
            } else if (model.getMenuImageNumber() == 3) {
                model.getGameObjects().add(new Menu(imageWidth / 2, imageHeight / 2, 0, 0,
                        ImageLoader.getMenu3(), imageWidth, imageHeight, 110, model));
            } else if (model.getMenuImageNumber() == 4) {
                model.getGameObjects().add(new Menu(imageWidth / 2, imageHeight / 2, 0, 0,
                        ImageLoader.getMenu4(), imageWidth, imageHeight, 110, model));
            }
           model.setMenuImageChanged(false);
        }
    }
}
