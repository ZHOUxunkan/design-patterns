package com.zxk.builder;

/**
 * @author zhouer
 * @date 2022-04-24
 * 定义要被 direct 调用的接口
 */

public abstract class Builder {
    public abstract void makeTitle(String s);

    public abstract void makeString(String s);

    public abstract void makeItems(String s);

    public abstract void close();
}
