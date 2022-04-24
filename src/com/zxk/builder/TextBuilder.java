package com.zxk.builder;

/**
 * @author zhouer
 * @date 2022-04-24
 * builder 的实现类 在 direct 中被调用
 */

public class TextBuilder extends Builder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void makeTitle(String s) {
        // 自定义方法
    }

    @Override
    public void makeString(String s) {

    }

    @Override
    public void makeItems(String s) {

    }

    @Override
    public void close() {

    }

    /**
     * 提供一个结果返回的接口
     *
     * @return
     */
    public String getResult() {
        return sb.toString();
    }
}
