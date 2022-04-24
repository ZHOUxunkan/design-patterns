package com.zxk.abstractFactory.listFactory;

import com.zxk.abstractFactory.factory.Page;

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
        return null;
    }
}
