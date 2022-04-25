package com.zxk.abstruct.factory.list.factory;

import com.zxk.abstruct.factory.factory.Page;

/**
 * @author zhouer
 * @date 2022-04-24
 */

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    protected String makeHTML() {
        // 业务逻辑
        return "page" + title + " of " + author;
    }
}
