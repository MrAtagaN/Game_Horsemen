package com.plekhanov.game.utils;

import com.plekhanov.game.gameObjects.GameObject;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Добавляем игровые объекты сразу в нужное место коллесции в зависимости от RenderOrder
 * (Можно добавлять объекты в коллекцию и потом сортировать её по RenderOrder, но посколько работа происходит
 * в 2 нитях (нить модели и нить рендера) происходит микро задержна между добавлением игрового объекта и когда он
 * займёт нужное место в коллекции, визуально это можно заметить)
 */
public class GameObjectsCollection<T extends GameObject> extends CopyOnWriteArrayList<T> {

    @Override
    public boolean add(T newGameObject) {
        if (this.isEmpty()) {
            add(0, newGameObject);
        } else {
            for (int i = 0; i < this.size(); i++) {
                GameObject gameObjectFromCollection = this.get(i);
                if (newGameObject.getRenderOrder() < gameObjectFromCollection.getRenderOrder()) {
                    add(i, newGameObject);
                    break;
                } else {
                    if (i == this.size() - 1) {
                        add(this.size() - 1, newGameObject);
                        break;
                    }
                }
            }
        }
        return true;
    }
}
