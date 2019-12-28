package com.plekhanov.game.gameObjects;

import com.plekhanov.game.Model;
import com.plekhanov.game.utils.ImageLoader;

import java.awt.image.BufferedImage;

public class Menu extends GameObject {

    public static int SHOW_MENU_RENDER_ORDER = 110;

    protected Model model;

    private boolean showMenu = true;

    private boolean menuImageChanged = false;

    public Menu(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder, Model model) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder);
        this.model = model;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        if (model.isMenuImageChanged()) {
            if (model.getMenuImageNumber() == 1) {
                setBufferedImage(ImageLoader.getMenu1());
            } else if (model.getMenuImageNumber() == 2) {
                setBufferedImage(ImageLoader.getMenu2());
            } else if (model.getMenuImageNumber() == 3) {
                setBufferedImage(ImageLoader.getMenu3());
            } else if (model.getMenuImageNumber() == 4) {
                setBufferedImage(ImageLoader.getMenu4());
            }
           model.setMenuImageChanged(false);
        }
    }

    public boolean weSeeMenu() {
        return getRenderOrder() == SHOW_MENU_RENDER_ORDER;
    }

    public void hideMenu() {
        setBufferedImage(ImageLoader.getInvisiblePicture());
        setRenderOrder(0);
    }

    public void showMenu() {
        setRenderOrder(SHOW_MENU_RENDER_ORDER);
    }
}
