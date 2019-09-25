package com.plekhanov.game;


/**
 * Игра сделана по паттерну MVC
 */
public class Game {

    public static final double SCREEN_SCALE_MAX = 1;
    public static final double SCREEN_SCALE_MIN = 0.55;
    public static final int SMALL_WINDOW_POSITION_X = 100;
    public static final int SMALL_WINDOW_POSITION_Y = 50;
    public static final int SCREEN_WIDTH = 1920;
    public static final int SCREEN_HEIGHT = 1080;
    public static final boolean FULL_SCREEN = true;
    public static final int BIG_WINDOW_POSITION_X = 0;
    public static final int BIG_WINDOW_POSITION_Y = 0;
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
                BIG_WINDOW_POSITION_X,
                BIG_WINDOW_POSITION_Y,
                model, controller);

        new Thread(renderer).start();
    }


    public static void changeScreenSize() {
        if (screenScale == SCREEN_SCALE_MAX) {
            screenScale = SCREEN_SCALE_MIN;
            renderer.setWindowPositionX(SMALL_WINDOW_POSITION_X);
            renderer.setWindowPositionY(SMALL_WINDOW_POSITION_Y);
            changeWidthAndHeight();
        } else {
            screenScale = SCREEN_SCALE_MAX;
            renderer.setWindowPositionX(BIG_WINDOW_POSITION_X);
            renderer.setWindowPositionY(BIG_WINDOW_POSITION_Y);
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


    //TODO
    // Проверку столкновения с игроком (checkClashWithPlayer) вынести в метод у всех врагов
    // Перенести render order внутрь оюъектов, сделать список
    // Сделать начало и конец игры
    // Добавить анимацию
    // Сделать поведение врагам
    // Добавить разных врагов
    // Добавить предменты


}
