package com.zxk.factory.method;

import com.zxk.factory.method.framework.Factory;
import com.zxk.factory.method.framework.Product;
import com.zxk.factory.method.idcard.IDCardFactory;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("a");
        Product card2 = factory.create("b");
        Product card3 = factory.create("c");
        card1.use();
        card2.use();
        card3.use();
    }
    /*
        制造a的卡
        制造b的卡
        制造c的卡
        使用a的卡
        使用b的卡
        使用c的卡
     */
}
