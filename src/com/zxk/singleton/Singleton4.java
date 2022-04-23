package com.zxk.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author zhouer
 * @date 2022-04-23
 * CAS + AtomicReference 实现
 */

public class Singleton4 {
    private Singleton4() {
    }

    //2.在类的内部创建一个类的实例
    private static final AtomicReference<Singleton4> instance = new AtomicReference<>();

    //3.对外部提供调用方法：将创建的对象返回，只能通过类来调用
    public static Singleton4 getInstance() {
        while (true) {
            Singleton4 current = instance.get();
            if (current != null) {
                return current;
            }
            current = new Singleton4();
            if (instance.compareAndSet(null, current)) {
                return current;
            }
        }
    }
}
