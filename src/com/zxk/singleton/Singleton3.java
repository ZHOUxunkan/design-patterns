package com.zxk.singleton;

/**
 * @author zhouer
 * @date 2022-04-23
 * 双重校验锁式
 */

public class Singleton3 {
    private Singleton3() {
    }

    private volatile static Singleton3 instance;

    public static Singleton3 getInstance() {
        if (instance == null) { //检查实例，如果为空，就进入同步代码块
            synchronized (Singleton3.class) {
                if (instance == null) { //再检查一次，仍未空才创建实例
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
