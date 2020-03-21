package com.plekhanov.game.utils;

import com.plekhanov.game.Model;
import com.plekhanov.game.gameObjects.GameObject;
import com.plekhanov.game.gameObjects.enemies.Ghost;
import com.plekhanov.game.gameObjects.enemies.MummyZombie;
import com.plekhanov.game.gameObjects.enemies.Ogre;
import com.plekhanov.game.gameObjects.enemies.Zombie;
import com.plekhanov.game.gameObjects.enemies.archer.Archer;
import com.plekhanov.game.gameObjects.enemies.fire_elemental.FireElemental;
import com.plekhanov.game.gameObjects.enemies.foxMummy.FoxMummy;
import com.plekhanov.game.gameObjects.enemies.gargoly.Gargoly;
import com.plekhanov.game.gameObjects.enemies.genie.Genie;
import com.plekhanov.game.gameObjects.enemies.husk.Husk;
import com.plekhanov.game.gameObjects.enemies.necromancer.Necromancer;
import com.plekhanov.game.gameObjects.items.Bomb;
import com.plekhanov.game.gameObjects.items.HeartItem;

public class GameObjectsFactory {

    public static GameObject createGameObject(GameObjectName gameObjectName, Model model) {
          if (gameObjectName == GameObjectName.HUSK) {
              return new Husk(2200, 580, -0.3, 0, model);
          } else if (gameObjectName == GameObjectName.ARCHER) {
              return new Archer(2200, 500, -0.5, 0, model);
          } else if (gameObjectName == GameObjectName.NECROMANCER) {
              return new Necromancer(2200, 913, -0.6, 0, model);
          } else if (gameObjectName == GameObjectName.ZOMBIE) {
              return new Zombie(2100, 913, -0.7, 0, model);
          } else if (gameObjectName == GameObjectName.GHOST) {
              return new Ghost(2200, 370, -0.7, 0, model);
          } else if (gameObjectName == GameObjectName.GARGOLY) {
              return new Gargoly(2200, 370, -1, 0, model);
          } else if (gameObjectName == GameObjectName.HEART) {
              return new HeartItem(2000, 300 + (Math.random() * 500), -0.5, 0, model);
          } else if (gameObjectName == GameObjectName.OGRE) {
              return new Ogre(2200, 900, -0.75, 0, model);
          } else if (gameObjectName == GameObjectName.MUMMY_ZOMBIE) {
              return new MummyZombie(2200, 500, -0.7, 0, model);
          } else if (gameObjectName == GameObjectName.FOX_MUMMY) {
              return new FoxMummy(2200, 900, -0.6, 0, model);
          } else if (gameObjectName == GameObjectName.GENIE) {
              return new Genie(2200, 500, -1, 0, model);
          } else if (gameObjectName == GameObjectName.FIRE_ELEMENTAL) {
              return new FireElemental(2200, 500, 0,0, model);
          } else if (gameObjectName == GameObjectName.BOMB) {
              return new Bomb(2000, 300 + (Math.random() * 500), -0.5, 0, model);
          } else {
              throw new RuntimeException("No GameObject with name :" + gameObjectName);
          }
    }
}
