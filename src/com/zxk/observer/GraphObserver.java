package com.zxk.observer;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class GraphObserver implements Observer{
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.print("GraphObserver:");
        int count = numberGenerator.getNumber();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
