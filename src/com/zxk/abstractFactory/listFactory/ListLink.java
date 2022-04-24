package com.zxk.abstractFactory.listFactory;

import com.zxk.abstractFactory.factory.Link;

/**
 * @author zhouer
 * @date 2022-04-24
 */

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        // 自定义处理逻辑
        return getCaption() + " " + getUrl();
    }
}
