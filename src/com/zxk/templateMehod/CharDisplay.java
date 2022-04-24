package com.zxk.templateMehod;

/**
 * @author zhouer
 * @date 2022-04-23
 * 模板类的不同具体实现
 */

public class CharDisplay extends AbstractDisplay{

    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.println("<<");
    }

    @Override
    public void print() {
        System.out.println(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
