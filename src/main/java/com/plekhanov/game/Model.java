package com.plekhanov.game;

import com.plekhanov.game.gameLevels.Level_1;
import com.plekhanov.game.gameLevels.Level_2;
import com.plekhanov.game.gameLevels.Start_Menu;
import com.plekhanov.game.gameObjects.GameObject;
import com.plekhanov.game.gameObjects.GameOver;
import com.plekhanov.game.gameObjects.Menu;
import com.plekhanov.game.gameObjects.Player;
import com.plekhanov.game.gameObjects.BackGround;
import com.plekhanov.game.utils.ImageLoader;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Игровая модель. Содержит игровые объекты, состояние.
 */
public class Model implements Runnable {

    private volatile boolean gameOver = false;
   // private volatile boolean needToSortGameObjects;
    private double UPDATES;

    private int width;
    private int height;

    //список со всеми игровыми объектами
    private volatile List<GameObject> gameObjects = new CopyOnWriteArrayList<>();
    private volatile Player player;
    private volatile Menu menu;

    private int levelNumber = 0;
    private boolean needShowMenuImage = true;
    // экран сартового меню ( level 0 )
    private boolean startGameMenu = true;
    private boolean pause = false;


    public Model(double updates, int width, int height) {
        this.UPDATES = updates;
        this.width = width;
        this.height = height;

        menu = new Menu(width / 2, height / 2, 0, 0,
                ImageLoader.getMenu1(), width, height, 110, this);

        gameObjects.add(menu);

        loadLevel(0);
        Collections.sort(gameObjects);
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

                if (isGameOver() && !isPause()) {
                    gameObjects.add(new GameOver(width / 2, height / 2, 0, 0,
                            ImageLoader.getGameOverImage(), width, height, 105));
                    setPause(true);
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
            if (!isPause() && !(menu.weSeeMenu() && !isStartGameMenu())) {
                gameObject.updateCoordinates();
            } else if (gameObject instanceof Menu) {
                gameObject.updateCoordinates();
            }
            //удаление лишних объектов
            if (gameObject.getX() < -10000 || gameObject.getX() > 10000 || gameObject.getY() > 10000 || gameObject.getY() < -10000) {
                gameObjects.remove(gameObject);
            }
            if (isNeedShowMenuImage() && !isStartGameMenu()) {
                menu.showMenu();
                setNeedShowMenuImage(false);
                menu.setMenuImageChanged(true);
                menu.setMenuImageNumber(1);
            }
            Collections.sort(gameObjects);
        });
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
                menu.hideMenu();
                Collections.sort(getGameObjects());
                if(getLevelNumber() == 0 || getLevelNumber() == 1) {
                    removeAllGameObjectsExceptBackGround();
                } else {
                    removeAllGameObjectsExceptMenu();
                    Level_1.loadLevel_1_BackGround(width, height, this);
                }
                Level_1.load(width, height, this);
                gameOver = false;
                startGameMenu = false;
                pause = false;
                setLevelNumber(1);
                break;
            case 2:
                menu.hideMenu();
                Collections.sort(getGameObjects());
                removeAllGameObjectsExceptMenu();
                Level_2.load(width, height, this);
                gameOver = false;
                startGameMenu = false;
                pause = false;
                setLevelNumber(2);
                break;
            case 3:
                menu.hideMenu();
                Collections.sort(getGameObjects());
                removeAllGameObjectsExceptMenu();
                Level_2.load(width, height, this);
                gameOver = false;
                startGameMenu = false;
                pause = false;
                setLevelNumber(3);
                break;
            default:
                throw new RuntimeException("No level");
        }
    }

    private void removeAllGameObjectsExceptBackGround() {
        for(GameObject gameObject : getGameObjects()) {
            if(!(gameObject instanceof BackGround || gameObject instanceof Menu)) {
                getGameObjects().remove(gameObject);
            }
        }
    }

    private void removeAllGameObjectsExceptMenu() {
        for (GameObject gameObject : getGameObjects()) {
            if(!(gameObject instanceof Menu)){
                getGameObjects().remove(gameObject);
            }
        }
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

    public boolean isNeedShowMenuImage() {
        return needShowMenuImage;
    }

    public void setNeedShowMenuImage(boolean needShowMenuImage) {
        this.needShowMenuImage = needShowMenuImage;
    }

    public boolean isStartGameMenu() {
        return startGameMenu;
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
}
