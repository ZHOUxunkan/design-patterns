package com.zxk.abstruct.factory.factory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouer
 * @date 2022-04-24
 */

public abstract class Tray extends Item {
    private List<Item> tray = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
