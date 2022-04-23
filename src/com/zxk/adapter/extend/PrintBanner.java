package com.zxk.adapter.extend;

/**
 * @author zhouer
 * @date 2022-04-23
 * 接口实现类 包装 Banner 方法用以适配 Print
 */

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String s) {
        super(s);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
