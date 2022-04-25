package com.zxk.brigde;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("偷着乐"));
        Display d2 = new CountDisplay(new StringDisplayImpl("偷着乐"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("偷着乐"));

        d1.display();
        d2.display();
        d3.display();
        d3.plusFunction();
    }
}
