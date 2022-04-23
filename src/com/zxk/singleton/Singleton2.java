package com.zxk.singleton;

/**
 * @author zhouer
 * @date 2022-04-23
 * 静态内部类实现
 */

public class Singleton2 {

    private Singleton2() {
    }

    private static class SingletonHolder {
        private static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.instance;
    }
}
