package com.plekhanov.game.gameObjects.enemies;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.GameObject;
import com.plekhanov.game.gameObjects.PlayerShoot;
import com.plekhanov.game.utils.AudioPlayer;

import java.awt.image.BufferedImage;


public abstract class Enemy extends GameObject {

    protected double actionCountMax; //цикл действий
    protected double actionCount;    //счетчик цикла действий
    protected Model model;
    protected int life;
    private static final AudioPlayer audioPlayer = new AudioPlayer();


    public Enemy(double x, double y, double speedX, double speedY, BufferedImage bufferedImage, int imageWidth, int imageHeight, int renderOrder, Model model) {
        super(x, y, speedX, speedY, bufferedImage, imageWidth, imageHeight, renderOrder);
        this.model = model;
    }

    protected void incrementCount() {
        actionCount++;
        if (actionCount > actionCountMax) {
            actionCount = 0;
        }
    }

    /**
     * проверка столкновения c выстрелом игрока
     */
    protected void checkClashWithPlayerShoot(int x, int y) {
        checkClashWithPlayerShoot(x, y, null);
    }

    /**
     * проверка столкновения c выстрелом игрока
     *
     * @param deathSoundPath - путь к аудиофайлу смерти монстра
     */
    protected void checkClashWithPlayerShoot(int x, int y, String deathSoundPath) {
        model.getGameObjects().forEach(gameObject -> {
            if (gameObject instanceof PlayerShoot) {
                if (Math.abs(gameObject.getX() - getX()) < x && Math.abs(gameObject.getY() - getY()) < y) {
                    life--;
                    model.getGameObjects().remove(gameObject);
                    if (life <= 0) {
                        model.getGameObjects().remove(this);
                        if (deathSoundPath != null) {
                            audioPlayer.play(deathSoundPath);
                        }
                    }
                }
            }
        });
    }

    /**
     * проверка столкновения c игроком
     */
    protected void checkClashWithPlayer(int x, int y) {
        if (Math.abs(model.getPlayer().getX() - getX()) < x && Math.abs(model.getPlayer().getY() - getY()) < y) {
            model.getPlayer().minusLife();
        }
    }
}
