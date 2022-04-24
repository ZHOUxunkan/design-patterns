package com.zxk.abstractFactory.listFactory;

import com.zxk.abstractFactory.factory.Factory;
import com.zxk.abstractFactory.factory.Link;
import com.zxk.abstractFactory.factory.Page;
import com.zxk.abstractFactory.factory.Tray;

/**
 * @author zhouer
 * @date 2022-04-24
 */

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }

}
