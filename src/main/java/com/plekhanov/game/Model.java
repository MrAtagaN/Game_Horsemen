package com.plekhanov.game;

import com.plekhanov.game.gameLevels.Level_1;
import com.plekhanov.game.gameLevels.Level_2;
import com.plekhanov.game.gameLevels.StartMenu;
import com.plekhanov.game.gameObjects.GameObject;
import com.plekhanov.game.gameObjects.GameOver;
import com.plekhanov.game.gameObjects.Menu;
import com.plekhanov.game.gameObjects.Player;
import com.plekhanov.game.gameObjects.BackGround;
import com.plekhanov.game.utils.GameObjectsCollection;
import com.plekhanov.game.utils.ImageLoader;

import java.util.List;

/**
 * Игровая модель. Содержит игровые объекты, состояние.
 */
public class Model implements Runnable {

    private volatile boolean gameOver = false;
    private double updates;

    private int width;
    private int height;

    //список со всеми игровыми объектами
    private volatile List<GameObject> gameObjects = new GameObjectsCollection<>();
    private volatile Player player;
    private volatile Menu menu;

    private int levelNumber = 0;
    private int gameLevelCount = 0; // счётчик для добавления врагов на уровень
    // экран сартового меню ( level 0 )
    private boolean pause = false;


    public Model(double updates, int width, int height) {
        this.updates = updates;
        this.width = width;
        this.height = height;

        menu = new Menu(width / 2, height / 2, 0, 0,
                ImageLoader.getMenu1(), width, height, 110, this);

        gameObjects.add(menu);

        loadLevel(0);
    }

    /**
     * Цикл изменений координат игровых объектов
     */
    public void run() {
        long lastTime = System.nanoTime();
        double ns = 1000_000_000 / updates;
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
            if (!isPause() && !(menu.weSeeMenu() && isNotStartGameMenu())) {
                gameObject.updateCoordinates();
            } else if (gameObject instanceof Menu) {
                gameObject.updateCoordinates();
            }
            //удаление лишних объектов
            if (gameObject.getX() < -10000 || gameObject.getX() > 10000 || gameObject.getY() > 10000 || gameObject.getY() < -10000) {
                gameObjects.remove(gameObject);
            }
        });
        addGameObjectToLevel();

        if (isGameOver() && !isPause()) {
            gameObjects.add(new GameOver(width / 2, height / 2, 0, 0,
                    ImageLoader.getGameOverImage(), width, height, 105));
            setPause(true);
        }

        if (!menu.weSeeMenu()) {
            gameLevelCount++;
        }
    }


    /**
     * Загрузка игровых объектов уровня
     */
    public void loadLevel(int levelNumber) {
        switch (levelNumber) {
            case 0:
                StartMenu.load(width, height, this);
                break;
            case 1:
                menu.hideMenu(false);
                if (getLevelNumber() == 0 || getLevelNumber() == 1) {
                    removeAllGameObjectsExceptBackGround();
                } else {
                    removeAllGameObjectsExceptMenu();
                    Level_1.loadBackGround(width, height, this);
                }
                Level_1.load(width, height, this);
                gameOver = false;
                pause = false;
                setGameLevelCount(0);
                setLevelNumber(1);
                break;
            case 2:
                menu.hideMenu(false);
                removeAllGameObjectsExceptMenu();
                Level_2.load(width, height, this);
                gameOver = false;
                pause = false;
                setGameLevelCount(0);
                setLevelNumber(2);
                break;
            case 3:
                menu.hideMenu(false);
                removeAllGameObjectsExceptMenu();
                Level_2.load(width, height, this);
                gameOver = false;
                pause = false;
                setGameLevelCount(0);
                setLevelNumber(3);
                break;
            default:
                throw new RuntimeException("No level");
        }
    }

    private void addGameObjectToLevel() {
        if (levelNumber == 1) {
            Level_1.addGameObjectSheduler(gameLevelCount, this);
        } else if (levelNumber == 2) {
            Level_2.addGameObjectSheduler(gameLevelCount, this);
        }
    }

    private void removeAllGameObjectsExceptBackGround() {
        getGameObjects().removeIf(gameObject -> !(gameObject instanceof BackGround || gameObject instanceof Menu));
    }

    private void removeAllGameObjectsExceptMenu() {
        getGameObjects().removeIf(gameObject -> !(gameObject instanceof Menu));
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

    public boolean isNotStartGameMenu() {
        return levelNumber != 0;
    }

    public boolean isPause() {
        return pause;
    }

    public void setPause(boolean pause) {
        this.pause = pause;
    }

    public Menu getMenu() {
        return menu;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public void setGameLevelCount(int gameLevelCount) {
        this.gameLevelCount = gameLevelCount;
    }
}
