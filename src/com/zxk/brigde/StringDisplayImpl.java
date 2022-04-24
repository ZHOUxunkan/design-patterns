package com.zxk.brigde;

/**
 * @author zhouer
 * @date 2022-04-24
 * 实现层次结构的具体实现
 */

public class StringDisplayImpl implements DisplayImpl {
    private String s;
    private int width;

    public StringDisplayImpl(String s) {
        this.s = s;
        width = s.getBytes().length;
    }

    @Override
    public void rawOpen() {
        // ...
    }

    @Override
    public void rawPrint() {

    }

    @Override
    public void rawClose() {

    }
}
