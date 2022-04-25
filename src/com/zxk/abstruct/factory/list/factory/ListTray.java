package com.zxk.abstruct.factory.list.factory;

import com.zxk.abstruct.factory.factory.Tray;

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
