package com.zxk.abstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouer
 * @date 2022-04-24
 * 产品的抽象类
 */

public abstract class Page {
    private String title;
    private String author;
    private List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    // 一个模板方法 规定逻辑
    public void output() {
        String filename = title + ".html";
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected abstract String makeHTML();
}
