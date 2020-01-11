package com.plekhanov.game.utils;

import com.plekhanov.game.Game;


public class Utils {

    public static int scaleSize(int pixels) {
        return (int) (pixels * Game.getScreenScale());
    }

    public static double scaleSize(double pixels) {
        return pixels * Game.getScreenScale();
    }

    public static void threadSleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
