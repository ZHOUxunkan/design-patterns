package com.zxk.prototype;

/**
 * @author zhouer
 * @date 2022-04-23
 */

public interface Product extends Cloneable {
    void use(String s);

    /**
     * 用于复制实例
     * @return
     */
    Product createClone();
}
