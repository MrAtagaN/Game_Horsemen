package com.plekhanov.game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Controller extends KeyAdapter {

    private Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public void setModel(Model model) {
        this.model = model;
    }


    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_D) {
            if (model.getPlayer() != null) {
                model.getPlayer().setMoveRight(false);
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_A) {
            if (model.getPlayer() != null) {
                model.getPlayer().setMoveLeft(false);
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (model.getPlayer() != null) {
                model.getPlayer().setShootRight(false);
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (model.getPlayer() != null) {
                model.getPlayer().setShootLeft(false);
            }
        }
    }


    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (model.getPlayer() != null) {
                model.getPlayer().jumpUp();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_PLUS) {
            Game.changeScreenSize();
            model.setGameOver();
            Game.startGame();
        }

        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            if (model.getMenu().getMenuImageNumber() == 1 && model.getMenu().weSeeMenu()) {
                model.loadLevel(1);
            }
            if(model.getMenu().getMenuImageNumber() == 4 && model.getMenu().weSeeMenu()) {
                System.exit(0);
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_D) {
            if (model.getPlayer() != null) {
                model.getPlayer().setMoveRight(true);
                model.getPlayer().setLookRight(true);
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_A) {
            if (model.getPlayer() != null) {
                model.getPlayer().setMoveLeft(true);
                model.getPlayer().setLookRight(false);
            }
        }

        //вызов меню
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            if (!model.getMenu().weSeeMenu() && model.isNotStartGameMenu()) {
                model.getMenu().showMenu();
            } else if (model.getMenu().weSeeMenu() && model.isNotStartGameMenu()) {
                model.getMenu().hideMenu(true);
            }
        }

        //выход из игры
        if (e.getKeyCode() == KeyEvent.VK_F1) {
            System.exit(0);
        }

        //выстрел
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (model.getPlayer() != null) {
                model.getPlayer().setShootRight(true);
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            if (model.getPlayer() != null) {
                model.getPlayer().setShootLeft(true);
            }
        }

        //смена уровней
        if (e.getKeyCode() == KeyEvent.VK_1) {
            model.loadLevel(1);
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            model.loadLevel(2);
        }
        if (e.getKeyCode() == KeyEvent.VK_3) {
            model.loadLevel(3);
        }

        // переключение меню
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            model.getMenu().setMenuImageNumber(model.getMenu().getMenuImageNumber() + 1);
            if (model.getMenu().getMenuImageNumber() > 4) {
                model.getMenu().setMenuImageNumber(1);
            }
            model.getMenu().setMenuImageChanged(true);
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            model.getMenu().setMenuImageNumber(model.getMenu().getMenuImageNumber() - 1);
            if (model.getMenu().getMenuImageNumber() < 1) {
                model.getMenu().setMenuImageNumber(4);
            }
            model.getMenu().setMenuImageChanged(true);
        }

    }
}
