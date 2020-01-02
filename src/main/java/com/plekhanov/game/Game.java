package com.plekhanov.game;


/**
 * Игра сделана по паттерну MVC
 */
public class Game {
 // Toolkit.getDefaultToolkit().getScreenSize().
    private static final double SCREEN_SCALE_100 = 1;
    private static final double SCREEN_SCALE_80 = 0.8;
    private static final double SCREEN_SCALE_60 = 0.6;
    public static final int SCREEN_SCALE_100_WINDOW_POSITION_X = 0;
    public static final int SCREEN_SCALE_100_WINDOW_POSITION_Y = 0;
    public static final int SCREEN_SCALE_80_WINDOW_POSITION_X = 200;
    public static final int SCREEN_SCALE_80_WINDOW_POSITION_Y = 100;
    public static final int SCREEN_SCALE_60_WINDOW_POSITION_X = 400;
    public static final int SCREEN_SCALE_60_WINDOW_POSITION_Y = 200;
    public static final int SCREEN_WIDTH = 1920;
    public static final int SCREEN_HEIGHT = 1080;
    public static final boolean FULL_SCREEN = true;
    public static final double UPDATES = 500;  //колическво обновлений в секунду игровой модели
    public static final String GAME_TITLE = "Horsemen";

    private static volatile double  screenScale = 1;
    private static int width = (int) (SCREEN_WIDTH * screenScale);
    private static int height = (int) (SCREEN_HEIGHT * screenScale);


    private static Model model;
    private static Renderer renderer;
    private static Controller controller;


    /**
     * Start game
     */
    public static void main(String[] args) {
        model = new Model(UPDATES, SCREEN_WIDTH, SCREEN_HEIGHT);
        controller = new Controller(model);
        new Thread(model).start();

        renderer = new Renderer(
                width,
                height,
                FULL_SCREEN,
                GAME_TITLE,
                SCREEN_SCALE_100_WINDOW_POSITION_X,
                SCREEN_SCALE_100_WINDOW_POSITION_Y,
                model, controller);

        new Thread(renderer).start();
    }

    public static void setScreenSize(double screenSize) {
        if (screenSize == SCREEN_SCALE_100) {
            screenScale = SCREEN_SCALE_100;
            renderer.setWindowPositionX(SCREEN_SCALE_100_WINDOW_POSITION_X);
            renderer.setWindowPositionY(SCREEN_SCALE_100_WINDOW_POSITION_Y);
            changeWidthAndHeight();
        } else if (screenSize == SCREEN_SCALE_80) {
            screenScale = SCREEN_SCALE_80;
            renderer.setWindowPositionX(SCREEN_SCALE_80_WINDOW_POSITION_X);
            renderer.setWindowPositionY(SCREEN_SCALE_80_WINDOW_POSITION_Y);
            changeWidthAndHeight();
        } else if (screenSize == SCREEN_SCALE_60) {
            screenScale = SCREEN_SCALE_60;
            renderer.setWindowPositionX(SCREEN_SCALE_60_WINDOW_POSITION_X);
            renderer.setWindowPositionY(SCREEN_SCALE_60_WINDOW_POSITION_Y);
            changeWidthAndHeight();
        }

        renderer.getJFrame().setBounds(
                renderer.getWindowPositionX(),
                renderer.getWindowPositionY(),
                width,
                height);
    }


    private static void changeWidthAndHeight() {
        width = (int) (SCREEN_WIDTH * screenScale);
        height = (int) (SCREEN_HEIGHT * screenScale);
    }


    /**
     * Перезапуск игры, если игра окончена
     */
    public static synchronized void startGame() {
        if (model.isGameOver()) {
            model = new Model(UPDATES, SCREEN_WIDTH, SCREEN_HEIGHT);
            controller.setModel(model);
            renderer.setModel(model);
            new Thread(model).start();
        }
    }


    public static double getScreenScale() {
        return screenScale;
    }

    public static double getScreenScale100() {
        return SCREEN_SCALE_100;
    }

    public static double getScreenScale80() {
        return SCREEN_SCALE_80;
    }

    public static double getScreenScale60() {
        return SCREEN_SCALE_60;
    }

    //TODO
    // Сделать начало игры
    // Добавить предменты
    // Сделать рефактор методов changeImage как в классе FireElementalFireBall



}
