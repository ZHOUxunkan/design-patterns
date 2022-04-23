package com.zxk.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouer
 * @date 2022-04-23
 */

public class Manager {
    private Map<String, Product> showCase = new HashMap();

    /**
     * 注册已知的实例，以便之后调用 create 复制实例
     * @param name
     * @param product
     */
    public void register(String name, Product product) {
        showCase.put(name, product);
    }

    /**
     * 调用 createClone 实现复制
     * @param name
     * @return
     */
    public Product create(String name) {
        Product p = showCase.get(name);
        return p.createClone();
    }

}
