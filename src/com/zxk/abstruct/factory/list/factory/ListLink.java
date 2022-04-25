package com.zxk.abstruct.factory.list.factory;

import com.zxk.abstruct.factory.factory.Link;

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
