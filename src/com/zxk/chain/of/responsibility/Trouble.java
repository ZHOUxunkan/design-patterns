package com.zxk.chain.of.responsibility;

/**
 * @author zhouer
 * @date 2022-04-25
 * 发生问题的类
 */

public class Trouble {
    private  int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble "+ number + ']';
    }
}
