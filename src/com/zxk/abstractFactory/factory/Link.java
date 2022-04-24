package com.zxk.abstractFactory.factory;

/**
 * @author zhouer
 * @date 2022-04-24
 */

public abstract class Link extends Item {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Link(String caption,String url) {
        super(caption);
        this.url = url;
    }
}
