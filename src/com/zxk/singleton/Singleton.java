package com.zxk.singleton;

/**
 * @author zhouer
 * @date 2022-04-23
 * 饿汉式 基础实现
 */

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
