package com.plekhanov.game.gameObjects.items;

import com.plekhanov.game.Game;
import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.GameObject;
import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioPlayer;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.utils.Utils;


public class Bomb extends GameObject {

    private static final int IMAGE_WIDTH = 200;
    private static final int IMAGE_HEIGHT = 200;
    private static final int RENDER_ORDER = 120;
    private static final int ACTION_COUNT_MAX = 500;
    private int actionCount = 0;
    private Model model;
    private static AudioPlayer audioPlayer = new AudioPlayer();

    public Bomb(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getBombImage(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER);
        this.model = model;
    }


    @Override
    public void updateCoordinates() {
        super.updateCoordinates();
        if (actionCount < ACTION_COUNT_MAX / 2) {
            speedY = -0.1;
        } else {
            speedY = 0.1;
        }
        incrementActionCount();
        checkClashWithPlayer(80, 80);
    }


    /**
     * проверка столкновения c игроком
     */
    protected void checkClashWithPlayer(int x, int y) {
        if (Math.abs(model.getPlayer().getX() - getX()) < x && Math.abs(model.getPlayer().getY() - getY()) < y) {
          //  model.getGameObjects().remove(this);
            audioPlayer.play(AudioHelper.SCREAM);
            bufferedImage = ImageLoader.getScreamerImage();
            setImageWidth(Game.SCREEN_WIDTH);
            setImageHeight(Game.SCREEN_HEIGHT);
            setX(Game.SCREEN_WIDTH / 2);
            setY(Game.SCREEN_HEIGHT / 2);
            Utils.threadSleep(3000);
            model.setGameOver();
        }
    }

    private void incrementActionCount() {
        actionCount++;
        if (actionCount > ACTION_COUNT_MAX) {
            actionCount = 0;
        }
    }
}
