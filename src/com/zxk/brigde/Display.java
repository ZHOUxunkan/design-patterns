package com.zxk.brigde;

/**
 * @author zhouer
 * @date 2022-04-24
 * 功能层次结构
 * 调用 DisplayImpl 具体实现类的方法
 */

public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
