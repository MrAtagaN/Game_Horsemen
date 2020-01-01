package com.plekhanov.game.gameObjects.items;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.GameObject;
import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioPlayer;
import com.plekhanov.game.utils.ImageLoader;


public class HeartItem  extends GameObject {

    private static final int IMAGE_WIDTH = 55;
    private static final int IMAGE_HEIGHT = 66;
    private static final int RENDER_ORDER = 90;
    private static final int ACTION_COUNT_MAX = 500;
    private int actionCount = 0;
    private static AudioPlayer audioPlayer = new AudioPlayer();

    private Model model;


    public HeartItem(double x, double y, double speedX, double speedY, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getHeartImage(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER);
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
            if (model.getPlayer().getLife() < 3) {
                model.getGameObjects().remove(this);
                audioPlayer.play(AudioHelper.PICK_ITEM, 80);
            }
            model.getPlayer().plusLife();
        }
    }


    private void incrementActionCount() {
        actionCount++;
        if (actionCount > ACTION_COUNT_MAX) {
            actionCount = 0;
        }
    }
}
