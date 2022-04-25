package com.zxk.stratery;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public class Main {
    public static void main(String[] args) {
        Player la = new Player("la", new WinningStrategy(3));
    }
}
