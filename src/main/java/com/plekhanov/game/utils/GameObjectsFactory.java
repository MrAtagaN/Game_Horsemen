package com.plekhanov.game.utils;

import com.plekhanov.game.Model;
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
import com.plekhanov.game.gameObjects.items.HeartItem;

public class GameObjectsFactory {

    public static void addGameObjectToLevel(GameObjectName gameObjectName, Model model) {
          if (gameObjectName == GameObjectName.HUSK) {
              model.getGameObjects().add(new Husk(2200, 580, -0.3, 0, model));
          } else if (gameObjectName == GameObjectName.ARCHER) {
              model.getGameObjects().add(new Archer(2200, 500, -0.5, 0, model));
          } else if (gameObjectName == GameObjectName.NECROMANCER) {
              model.getGameObjects().add(new Necromancer(2200, 913, -0.6, 0, model));
          } else if (gameObjectName == GameObjectName.ZOMBIE) {
              model.getGameObjects().add(new Zombie(2100, 913, -0.7, 0, model));
          } else if (gameObjectName == GameObjectName.GHOST) {
              model.getGameObjects().add(new Ghost(2200, 370, -0.7, 0, model));
          } else if (gameObjectName == GameObjectName.GARGOLY) {
              model.getGameObjects().add(new Gargoly(2200, 370, -1, 0, model));
          } else if (gameObjectName == GameObjectName.HEART) {
              model.getGameObjects().add(new HeartItem(2000, 300 + (Math.random() * 500), -0.5, 0, model));
          } else if (gameObjectName == GameObjectName.OGRE) {
              model.getGameObjects().add(new Ogre(2200, 900, -0.75, 0, model));
          } else if (gameObjectName == GameObjectName.MUMMY_ZOMBIE) {
              model.getGameObjects().add(new MummyZombie(2200, 500, -0.7, 0, model));
          } else if (gameObjectName == GameObjectName.FOX_MUMMY) {
              model.getGameObjects().add(new FoxMummy(2200, 900, -0.6, 0, model));
          } else if (gameObjectName == GameObjectName.GENIE) {
              model.getGameObjects().add(new Genie(2200, 500, -1, 0, model));
          } else if (gameObjectName == GameObjectName.FIRE_ELEMENTAL) {
              model.getGameObjects().add(new FireElemental(2200, 500, 0,0, model));
          }
    }
}
