package com.zxk.templateMehod;

/**
 * @author zhouer
 * @date 2022-04-23
 * 模板抽象类 规定了 display方法的逻辑
 */

public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) print();
        close();
    }
}
