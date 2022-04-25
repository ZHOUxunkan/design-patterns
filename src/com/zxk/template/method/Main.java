package com.zxk.template.method;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public class Main {
    public static void main(String[] args) {
         AbstractDisplay d1 = new CharDisplay('H');
         AbstractDisplay d2 = new StringDisplay("Hello");
         d1.display();
         d2.display();
    }
    /*
        <<HHHHH>>
        +-----+
        |Hello|
        |Hello|
        |Hello|
        |Hello|
        |Hello|
        +-----+
     */
}
