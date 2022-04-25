package com.zxk.abstruct.factory.factory;

/**
 * @author zhouer
 * @date 2022-04-24
 * 所有零件类的父类
 */

public abstract class Item {
    private String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getCaption() {
        return caption;
    }

    public abstract String makeHTML();
}
