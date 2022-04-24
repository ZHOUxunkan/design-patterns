package com.zxk.abstractFactory.listFactory;

import com.zxk.abstractFactory.factory.Factory;
import com.zxk.abstractFactory.factory.Tray;

/**
 * @author zhouer
 * @date 2022-04-24
 */

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        // 自定义逻辑
        return getCaption();
    }
}
