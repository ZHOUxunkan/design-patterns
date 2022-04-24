package com.zxk.builder;

/**
 * @author zhouer
 * @date 2022-04-24
 */

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 规定建构的逻辑，即对 builder 方法的统一调用逻辑
     */
    public void construct() {
        // 自定义
        builder.makeTitle("xxx");
        builder.makeItems("xxx");
        builder.makeString("xxx");
        builder.close();
    }
}
