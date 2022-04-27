package com.zxk.facade;

import java.io.Writer;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }
    public void title(String title) {
        // 输出标题
    }
    public void paragraph(String paragraph) {
        // 输出段落
    }
    public void link(String href, String caption) {
        // 输出超链接
    }
    public void mail(String mail, String name) {
        // 输出邮件地址
    }
    public  void close() {
        // 结束输出
    }

}
