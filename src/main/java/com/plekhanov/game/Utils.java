package com.plekhanov.game;

public class Utils {

    public static int scaleSize(int pixels) {
        return (int) (pixels * Game.getScreenScale());
    }

    public static double scaleSize(double pixels) {
        return pixels * Game.getScreenScale();
    }
}
