package com.zxk.factory.method.framework;

/**
 * @author zhouer
 * @date 2022-04-23
 */

public abstract class Factory {

    // 规定 create 方法来生成实例，调用的 createProduct 方法由子类实现，实现解耦
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product p);

}
