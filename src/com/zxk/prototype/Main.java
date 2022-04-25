package com.zxk.prototype;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        MessageBox box1 = new MessageBox('/');
        MessageBox box2 = new MessageBox('*');
        manager.register("斜杠",box1);
        manager.register("星星",box2);

        Product p1 = manager.create("斜杠");
        Product p2 = manager.create("星星");
        p1.use("偷着乐");
        p2.use("偷着乐");
    }
    /*
        /////////
        偷着乐
        /////////
        *********
        偷着乐
        *********
     */
}
