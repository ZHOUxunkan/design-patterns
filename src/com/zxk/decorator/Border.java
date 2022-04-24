package com.zxk.decorator;

/**
 * @author zhouer
 * @date 2022-04-24
 * 装饰物
 */

public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
