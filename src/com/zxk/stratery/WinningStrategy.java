package com.zxk.stratery;

import java.util.Random;

/**
 * @author zhouer
 * @date 2022-04-24
 * 策略的具体实现之一
 */

public class WinningStrategy implements Strategy {
    private Random random;
    private boolean won;
    private Hand preHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            preHand = Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
