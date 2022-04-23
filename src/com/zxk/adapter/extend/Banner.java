package com.zxk.adapter.extend;

/**
 * @author zhouer
 * @date 2022-04-23
 * 被包装的父类
 */

public class Banner {
    private String s;

    public Banner(String s) {
        this.s = s;
    }

    public void showWithParen() {
        System.out.println("(" + s + ")");
    }

    public void showWithAster() {
        System.out.println("*" + s + "*");
    }
}
