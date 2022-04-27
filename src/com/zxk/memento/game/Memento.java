package com.zxk.memento.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class Memento {
    int money;
    List<String> fruits;

    public int getMoney() {
        return money;
    }

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    void addFruits(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        ArrayList<String> list = new ArrayList<>(fruits.size());
        Collections.copy(list, fruits);
        return list;
    }
}
