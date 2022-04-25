package com.zxk.prototype;

/**
 * @author zhouer
 * @date 2022-04-23
 */

public class MessageBox implements Product {
    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String s) {
        //具体实现功能
        int length=s.getBytes().length;
        for (int i = 0; i < length; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
        System.out.println(s);
        for (int i = 0; i < length; i++) {
            System.out.print(decoChar);
        }
        System.out.println();
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
