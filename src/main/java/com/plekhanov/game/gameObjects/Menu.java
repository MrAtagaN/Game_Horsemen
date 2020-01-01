package com.plekhanov.game.gameObjects;

import com.plekhanov.game.Model;
import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioPlayer;
import com.plekhanov.game.utils.ImageLoader;

import java.awt.image.BufferedImage;

public class Menu extends GameObject {

    protected Model model;
    private boolean showMenu = true;
    private boolean menuImageChanged = false;
    private int menuImageNumber = 1;
    private AudioPlayer audioPlayer = new AudioPlayer();


    public Menu(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder, Model model) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder);
        this.model = model;
    }

    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        if (isMenuImageChanged()) {
            showMenu = true;
            audioPlayer.play(AudioHelper.MENU_CHANGE_IMAGE, 40);
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

    public void hideMenu(boolean withSound) {
        setBufferedImage(ImageLoader.getInvisiblePicture());
        showMenu = false;
        if (withSound) {
            audioPlayer.play(AudioHelper.MENU_OFF, 20);
        }
    }

    public void showMenu() {
        setMenuImageChanged(true);
        setMenuImageNumber(1);
        showMenu = true;
        audioPlayer.play(AudioHelper.MENU_ON, 20);
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
