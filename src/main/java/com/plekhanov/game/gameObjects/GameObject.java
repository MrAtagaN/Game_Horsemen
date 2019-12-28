package com.plekhanov.game.gameObjects;

import java.awt.image.BufferedImage;
import java.util.Objects;

import static com.plekhanov.game.utils.Utils.scaleSize;


public abstract class GameObject implements Comparable {

    protected double x;
    protected double y;
    protected double speedX;
    protected double speedY;
    protected BufferedImage bufferedImage;
    protected int imageWidth;
    protected int imageHeight;
    protected volatile int renderOrder;

    public GameObject(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder) {
        this.x = x;
        this.y = y;
        this.speedX = speedX;
        this.speedY = speedY;
        this.bufferedImage = bufferedImage;
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.renderOrder = renderOrder;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getSpeedX() {
        return speedX;
    }

    public void setSpeedX(double speedX) {
        this.speedX = speedX;
    }

    public double getSpeedY() {
        return speedY;
    }

    public void setSpeedY(double speedY) {
        this.speedY = speedY;
    }

    public BufferedImage getBufferedImage() {
        return bufferedImage;
    }

    public int getImageWidth() {
        return scaleSize(imageWidth);
    }

    public int getImageHeight() {
        return scaleSize(imageHeight);
    }

    public int getRenderOrder() {
        return renderOrder;
    }

    public double getRenderX() {
        return scaleSize(x - imageWidth / 2) ;
    }

    public double getRenderY() {
        return scaleSize(y - imageHeight / 2) ;
    }

    public void setRenderOrder(int renderOrder) {
        this.renderOrder = renderOrder;
    }

    public void setBufferedImage(BufferedImage bufferedImage) {
        this.bufferedImage = bufferedImage;
    }

    public void updateCoordinates() {
        this.x += this.speedX;
        this.y += this.speedY;
    }

    @Override
    public int compareTo(Object o) {
        GameObject gameObject = (GameObject) o;
        if (this.renderOrder > gameObject.getRenderOrder()) {
            return 1;
        }
        if (this.renderOrder < gameObject.getRenderOrder()) {
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameObject that = (GameObject) o;
        return Double.compare(that.x, x) == 0 &&
                Double.compare(that.y, y) == 0 &&
                Double.compare(that.speedX, speedX) == 0 &&
                Double.compare(that.speedY, speedY) == 0 &&
                imageWidth == that.imageWidth &&
                imageHeight == that.imageHeight &&
                Objects.equals(bufferedImage, that.bufferedImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight);
    }
}
