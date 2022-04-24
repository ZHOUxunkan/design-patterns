package com.zxk.templateMehod;

/**
 * @author zhouer
 * @date 2022-04-23
 * 模板类的不同具体实现
 */

public class StringDisplay extends AbstractDisplay {

    private String s;
    private int width;

    public StringDisplay(String s) {
        this.s = s;
        width = s.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + s + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.println("+");
        for (int i = 0; i < width; i++) System.out.println("-");
        System.out.println("+");
    }
}
