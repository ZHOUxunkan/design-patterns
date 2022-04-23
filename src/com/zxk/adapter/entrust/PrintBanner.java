package com.zxk.adapter.entrust;

/**
 * @author zhouer
 * @date 2022-04-23
 * 接口实现类 包装 Banner 方法用以适配 Print
 */

public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String s) {
        banner = new Banner(s);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
