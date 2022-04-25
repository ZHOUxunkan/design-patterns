package com.zxk.decorator;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("偷着乐");
        Display d2 = new SideBorder(d1, '*');
        d2.show();

        Display d3 = new SideBorder(new SideBorder(new SideBorder(d2, '3'), '2'), '1');
        d3.show();
    }
    /*
        *偷着乐*
        123*偷着乐*321
     */
}
