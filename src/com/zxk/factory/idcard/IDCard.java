package com.zxk.factory.idcard;

import com.zxk.factory.framework.Product;

/**
 * @author zhouer
 * @date 2022-04-23
 */

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("制造" + owner + "的卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "的卡");
    }

    public String getOwner() {
        return owner;
    }
}
