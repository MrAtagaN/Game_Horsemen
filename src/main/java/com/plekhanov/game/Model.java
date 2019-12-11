package com.plekhanov.game;

import com.plekhanov.game.gameLevels.Level_1;
import com.plekhanov.game.gameLevels.Level_2;
import com.plekhanov.game.gameLevels.Level_3;
import com.plekhanov.game.gameLevels.Start_Menu;
import com.plekhanov.game.gameObjects.GameObject;
import com.plekhanov.game.gameObjects.Menu;
import com.plekhanov.game.gameObjects.Player;
import com.plekhanov.game.gameObjects.BackGround;
import com.plekhanov.game.utils.ImageLoader;

import java.util.Collections;
import java.util.List;

/**
 * Игровая модель. Содержит игровые объекты, состояние.
 */
public class Model implements Runnable {

    private volatile boolean gameOver = false;
    private volatile boolean needToSortGameObjects;
    private double UPDATES;

    private int width;
    private int height;

    //список со всеми игровыми объектами
    private volatile List<GameObject> gameObjects;
    private volatile Player player;

    private int menuImageNumber = 1;
    private boolean menuImageChanged = false;


    public Model(double updates, int width, int height) {
        this.UPDATES = updates;
        this.width = width;
        this.height = height;

        loadLevel(0);
    }

    /**
     * Цикл изменений координат игровых объектов
     */
    public void run() {
        long lastTime = System.nanoTime();
        double ns = 1000_000_000 / UPDATES;
        double delta = 0;
        int updates = 0;
        long timer = System.currentTimeMillis();

        while (true) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if (delta >= 1) {
                updates++;
                delta--;

                if (isGameOver()) {
                    gameObjects.add(new BackGround(width / 2, height / 2, 0, 0,
                            ImageLoader.getGameOverImage(), width, height, 110));
                    break;
                }
                //обновляем координаты у всех объектов
                updateModel();
            }

            //вывод информации
            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("Updates " + updates);
                updates = 0;
            }
        }
    }


    /**
     * Изменение игровой модели
     */
    private void updateModel() {
        gameObjects.forEach(gameObject -> {
            if (menuImageChanged && gameObject instanceof Menu) {
                gameObjects.remove(gameObject);
            }
            gameObject.updateCoordinates();
            //удаление лишних объектов
            if (gameObject.getX() < -10000 || gameObject.getX() > 10000 || gameObject.getY() > 10000 || gameObject.getY() < -10000) {
                gameObjects.remove(gameObject);
            }
        });
        if (needToSortGameObjects) {
            Collections.sort(gameObjects);
            needToSortGameObjects = false;
        }
    }


    /**
     * Загрузка игровых объектов уровня
     */
    public void loadLevel(int levelNumber) {
        switch (levelNumber) {
            case 0:
                Start_Menu.load(width, height, this);
                break;
            case 1:
                Level_1.load(width, height, this);
                break;
            case 2:
                Level_2.load(width, height, this);
                break;
            case 3:
                Level_3.load(width, height, this);
                break;
            default:
                throw new RuntimeException("No level");
        }
    }

    public void needToSortGameObjects() {
        this.needToSortGameObjects = true;
    }

    public Player getPlayer() {
        return player;
    }

    public List<GameObject> getGameObjects() {
        return gameObjects;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver() {
        this.gameOver = true;
    }

    public void setGameObjects(List<GameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getMenuImageNumber() {
        return menuImageNumber;
    }

    public void setMenuImageNumber(int menuImageNumber) {
        this.menuImageNumber = menuImageNumber;
    }

    public boolean isMenuImageChanged() {
        return menuImageChanged;
    }

    public void setMenuImageChanged(boolean menuImageChanged) {
        this.menuImageChanged = menuImageChanged;
    }
}
