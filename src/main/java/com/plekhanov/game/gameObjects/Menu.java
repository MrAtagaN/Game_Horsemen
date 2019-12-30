package com.plekhanov.game.gameObjects;

import com.plekhanov.game.Model;
import com.plekhanov.game.utils.ImageLoader;

import java.awt.image.BufferedImage;

public class Menu extends GameObject {

    protected Model model;
    private boolean showMenu = true;
    private boolean menuImageChanged = false;
    private int menuImageNumber = 1;

    public Menu(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder, Model model) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder);
        this.model = model;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        if (isMenuImageChanged()) {
            showMenu = true;
            if (getMenuImageNumber() == 1) {
                setBufferedImage(ImageLoader.getMenu1());
            } else if (getMenuImageNumber() == 2) {
                setBufferedImage(ImageLoader.getMenu2());
            } else if (getMenuImageNumber() == 3) {
                setBufferedImage(ImageLoader.getMenu3());
            } else if (getMenuImageNumber() == 4) {
                setBufferedImage(ImageLoader.getMenu4());
            }
           setMenuImageChanged(false);
        }
    }

    public boolean weSeeMenu() {
        return showMenu;
    }

    public void hideMenu() {
        setBufferedImage(ImageLoader.getInvisiblePicture());
        showMenu = false;
    }

    public void showMenu() {
        showMenu = true;
    }

    public boolean isMenuImageChanged() {
        return menuImageChanged;
    }

    public void setMenuImageChanged(boolean menuImageChanged) {
        this.menuImageChanged = menuImageChanged;
    }

    public int getMenuImageNumber() {
        return menuImageNumber;
    }

    public void setMenuImageNumber(int menuImageNumber) {
        this.menuImageNumber = menuImageNumber;
    }
}
