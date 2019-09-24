package com.plekhanov.game;


/**
 * Игра сделана по паттерну MVC
 */
public class Game {

    public static final int WIDTH = 1920;
    public static final int HEIGHT = 1080;
    public static final boolean FULL_SCREEN = true;
    public static final int WINDOW_POSITION_X = 0;
    public static final int WINDOW_POSITION_Y = 0;
    public static final double UPDATES = 500;  //колическво обновлений в секунду игровой модели
    public static final String GAME_TITLE = "Horsemen";

    private static double screenScale = 1;

    private static Model model;
    private static Renderer renderer;
    private static Controller controller;


    /**
     * Start game
     */
    public static void main(String[] args) {
        model = new Model(UPDATES, WIDTH, HEIGHT);
        controller = new Controller(model);
        new Thread(model).start();

        renderer = new Renderer(
                WIDTH,
                HEIGHT,
                FULL_SCREEN,
                GAME_TITLE,
                WINDOW_POSITION_X,
                WINDOW_POSITION_Y,
                model, controller);

        new Thread(renderer).start();
    }


    public static void changeScreenSize() {
        if (screenScale == 1) {
            screenScale = 0.5;
            renderer.setWindowPositionX(100);
            renderer.setWindowPositionY(50);
        } else {
            screenScale = 1;
            renderer.setWindowPositionX(0);
            renderer.setWindowPositionY(0);
        }

        renderer.getJFrame().setBounds(
                renderer.getWindowPositionX(),
                renderer.getWindowPositionY(),
                (int) (WIDTH * screenScale),
                (int) (HEIGHT * screenScale));


    }


    /**
     * Перезапуск игры, если игра окончена
     */
    public static synchronized void startGame() {
        if (model.isGameOver()) {
            model = new Model(UPDATES, WIDTH, HEIGHT);
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
