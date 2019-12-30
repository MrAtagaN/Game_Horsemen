package com.plekhanov.game.gameObjects;

import com.plekhanov.game.Game;
import com.plekhanov.game.utils.AudioHelper;
import com.plekhanov.game.utils.AudioPlayer;
import com.plekhanov.game.utils.ImageLoader;
import com.plekhanov.game.Model;

import static com.plekhanov.game.utils.Utils.scaleSize;


public class Player extends GameObject {

    //счетчики
    private int timeInvulnerability = 2 * (int) Game.UPDATES;  //время неуязвимости после столкновения
    private int invulnerabilityCount;  //счетчик неуязвимости
    private double shootTimer;  //счетчик интервала стрельбы

    //изображение
    private static final int IMAGE_WIDTH = 180;
    private static final int IMAGE_HEIGHT = 156;
    private static final int RENDER_ORDER = 100;
    private final int IMAGE_SHIFT_RIGHT = 10;  //смещение картинки игрока вправо

    //предметы
    private GameObject heart1;
    private GameObject heart2;
    private GameObject heart3;
    private EnergyBar energyBar;

    //состояние
    private boolean moveRight = false;
    private boolean moveLeft = false;
    private boolean shootRight = false;
    private boolean shootLeft = false;

    private boolean lookRight = true;

    private int life = 3;

    //энергия
    private double energy = 200;
    private static final double INCREMENT_ENERGY = 0.06;
    private static final double MAX_ENERGY = 200;
    private static final double ENERGY_FOR_JUMP = 50;

    //перемещение
    private double MIN_X = 57;
    private double MIN_Y = 900;
    private double MAX_X = 1830;
    private double MAX_Y = 65;
    private static final double MIN_SPEED_X = 0;
    private static final double MAX_SPEED_Y = 1.8;  //скорость падения
    private static final double GRAVITY_Y = 4;
    private static final double GRAVITY_X = 8;
    private static final double JUMP_UP = -1.8;
    private static final double JUMP_RIGHT = 1.5;
    private static final double JUMP_LEFT = -1.5;
    private static final double SHOOT_INTERVAL = 0.7;

    private static final AudioPlayer audioPlayer = new AudioPlayer();

    private Model model;

    public Player(double x, double y, double speedX, double speedY, int min_y, Model model) {
        super(x, y, speedX, speedY, ImageLoader.getPlayerImage(), IMAGE_WIDTH, IMAGE_HEIGHT, RENDER_ORDER);

        this.MIN_Y = min_y;
        this.model = model;

        heart1 = new Heart(50, 50, 0, 0);
        model.getGameObjects().add(heart1);
        heart2 = new Heart(120, 50, 0, 0);
        model.getGameObjects().add(heart2);
        heart3 = new Heart(190, 50, 0, 0);
        model.getGameObjects().add(heart3);
        energyBar = new EnergyBar(20, 100, 0, 0, (int) energy);
        model.getGameObjects().add(energyBar);
    }


    @Override
    public void updateCoordinates() {
        checkButtons();
        changeSpeed();
        checkBoundariesGameField();
        changePlayerImage();
        incrementCounters();
    }


    /**
     * Уменьшение жизни
     */
    public void minusLife() {
        if (invulnerabilityCount > 0) {
            return;
        }

        switch (life) {
            case 3:
                model.getGameObjects().remove(heart3);
                break;
            case 2:
                model.getGameObjects().remove(heart2);
                break;
            case 1:
                model.getGameObjects().remove(heart1);
                break;
        }

        this.life--;
        if (life > 0) {
            audioPlayer.play(AudioHelper.playerWounded());
        }
        if (life <= 0) {
            audioPlayer.play(AudioHelper.playerDead());
            model.setGameOver();
        }
        this.invulnerabilityCount = timeInvulnerability;
    }


    /**
     * Проверка нажатых кнопок
     */
    private void checkButtons() {
        if (moveRight) {
            jumpRight();
        }
        if (moveLeft) {
            jumpLeft();
        }
        if (shootRight) {
            shootRight();
        }
        if (shootLeft) {
            shootLeft();
        }
    }


    private void changeSpeed() {
        this.x += this.speedX;
        if (speedX > MIN_SPEED_X) {
            speedX += -GRAVITY_X / 500;
        }
        if (speedX < MIN_SPEED_X) {
            speedX -= -GRAVITY_X / 500;
        }
        if (Math.abs(speedX) < 0.1) {
            speedX = 0;
        }

        this.y += speedY;
        if (speedY < MAX_SPEED_Y) {
            speedY += GRAVITY_Y / 500;
        }
    }


    /**
     * Сменить картинку в зависимости от состояния
     */
    private void changePlayerImage() {
        if (moveRight && lookRight) {
            if (needToSetWoundedImage()) {
                bufferedImage = ImageLoader.getPlayerMoveRightWoundedImage();
            } else {
                bufferedImage = ImageLoader.getPlayerMoveRightImage();
            }
        } else if (moveRight) {
            if (needToSetWoundedImage()) {
                bufferedImage = ImageLoader.getPlayerMoveRightWoundedImageLookLeft();
            } else {
                bufferedImage = ImageLoader.getPlayerMoveRightImageLookLeft();
            }
        } else if (moveLeft && !lookRight) {
            if (needToSetWoundedImage()) {
                bufferedImage = ImageLoader.getPlayerMoveLeftWoundedImageLookLeft();
            } else {
                bufferedImage = ImageLoader.getPlayerMoveLeftImageLookLeft();
            }
        } else if (moveLeft) {
            if (needToSetWoundedImage()) {
                bufferedImage = ImageLoader.getPlayerMoveLeftWoundedImage();
            } else {
                bufferedImage =  ImageLoader.getPlayerMoveLeftImage();
            }
        } else if (needToSetJumpImage() && lookRight) {
            if (needToSetWoundedImage()) {
                bufferedImage = ImageLoader.getPlayerJumpWoundedImage();
            } else {
                bufferedImage = ImageLoader.getPlayerJumpImage();
            }
        } else if (needToSetJumpImage()) {
            if (needToSetWoundedImage()) {
                bufferedImage = ImageLoader.getPlayerJumpWoundedImageLookLeft();
            } else {
                bufferedImage = ImageLoader.getPlayerJumpImageLookLeft();
            }
        } else if (needToSetWoundedImage() && lookRight) {
            bufferedImage = ImageLoader.getPlayerWoundedImage();
        } else if (needToSetWoundedImage()) {
            bufferedImage = ImageLoader.getPlayerWoundedImageLookLeft();
        } else if (!lookRight) {
            bufferedImage = ImageLoader.getPlayerImageLookLeft();
        } else if (lookRight) {
            bufferedImage = ImageLoader.getPlayerImage();
        }
    }

    public void jumpRight() {
        setSpeedX(JUMP_RIGHT);
    }

    public void jumpUp() {
        if (y == MIN_Y) {
            setSpeedY(JUMP_UP);
        } else if (energy >= ENERGY_FOR_JUMP) {
            energy -= ENERGY_FOR_JUMP;
            setSpeedY(JUMP_UP);
        }
    }

    public void jumpLeft() {
        setSpeedX(JUMP_LEFT);
    }

    /**
     * Не позволяет игроку выйти за игровое поле
     */
    private void checkBoundariesGameField() {
        if (x < MIN_X) {
            speedX = 0;
            x = MIN_X;
        }
        if (x > MAX_X) {
            speedX = 0;
            x = MAX_X;
        }
        if (y < MAX_Y) {
            speedY = 0;
            y = MAX_Y;
        }
        if (y > MIN_Y) {
            speedY = 0;
            y = MIN_Y;
        }
    }

    private boolean needToSetWoundedImage() {
        return invulnerabilityCount > 0 && invulnerabilityCount / 50 % 2 == 0;
    }

    private boolean needToSetJumpImage() {
        if (speedY < -0.8) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Изменение счетчиков
     */
    private void incrementCounters() {
        if (energy < MAX_ENERGY) {
            energy += INCREMENT_ENERGY;
        }
        energyBar.setImageWidth((int) energy);

        if (invulnerabilityCount > 0) {
            invulnerabilityCount--;
        }

        if (shootTimer > 0) {
            shootTimer--;
        }
    }

    /**
     * Сместить картинку игрока вправо
     */
    @Override
    public double getRenderX() {
        if (lookRight) {
            return scaleSize(x - IMAGE_WIDTH / 2 + IMAGE_SHIFT_RIGHT);
        } else {
            return scaleSize(x - IMAGE_WIDTH / 2 - IMAGE_SHIFT_RIGHT);
        }

    }

    public void shootRight() {
        if (shootTimer <= 0) {
            shootTimer = Game.UPDATES * SHOOT_INTERVAL;
            model.getGameObjects().add(new PlayerShoot(getX() + 100, getY(), 2, 0));
            lookRight = true;
            audioPlayer.play(AudioHelper.playerShooting());
        }
    }

    public void shootLeft() {
        if (shootTimer <= 0) {
            shootTimer = Game.UPDATES * SHOOT_INTERVAL;
            model.getGameObjects().add(new PlayerShoot(getX() - 100, getY(), -2, 0));
            lookRight = false;
            audioPlayer.play(AudioHelper.playerShooting());
        }
    }


    //============ Getters, Setters =================//

    public void setLookRight(boolean lookRight) {
        if (!model.isGameOver()) {
            this.lookRight = lookRight;
        }
    }

    public void setShootRight(boolean shoot) {
        this.shootRight = shoot;
    }

    public void setShootLeft(boolean shoot) {
        this.shootLeft = shoot;
    }

    public boolean isMoveRight() {
        return moveRight;
    }

    public void setMoveRight(boolean moveRight) {
        this.moveRight = moveRight;
    }

    public boolean isMoveLeft() {
        return moveLeft;
    }

    public void setMoveLeft(boolean moveLeft) {
        this.moveLeft = moveLeft;
    }

    public double getSpeedX() {
        return speedX;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void addLife() {
        this.life++;
    }

    public double getSpeedY() {
        return speedY;
    }



}
