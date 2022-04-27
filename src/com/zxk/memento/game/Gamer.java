package com.zxk.memento.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsNames = {"apple", "banana", "orange", "watermelon"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("加钱了");
        } else if (dice == 2) {
            money /= 2;
            System.out.println("钱减半了");
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得水果" + f);
            fruits.add(f);
        } else {
            System.out.println("无事发生");
        }
    }

    /**
     * 拍摄快照
     *
     * @return
     */
    public Memento createMemento() {
        Memento m = new Memento(money);
        for (String fruit : fruits) {
            if (fruit.startsWith("美味い")) {
                m.addFruits(fruit);
            }
        }
        return m;
    }

    /**
     * 撤销
     *
     * @param m
     */
    public void restoreMemento(Memento m) {
        this.money = m.money;
        this.fruits = m.getFruits();
    }

    @Override
    public String toString() {
        return "[money=" + money + ", fruits=" + fruits + ']';
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "美味い";
        }
        return prefix + fruitsNames[random.nextInt(fruitsNames.length)];
    }
}
