package com.zxk.stratery;

/**
 * @author zhouer
 * @date 2022-04-24
 */

public class Player {
    private String name;
    private Strategy strategy;
    private int win;
    private int lose;
    private int game;

    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void win() {
        strategy.study(true);
        win++;
        game++;
    }

    public void lose() {
        strategy.study(false);
        lose++;
        game++;
    }

    public void even() {
        game++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", win=" + win +
                ", lose=" + lose +
                ", game=" + game +
                '}';
    }
}
