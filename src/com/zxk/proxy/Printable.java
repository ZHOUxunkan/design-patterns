package com.zxk.proxy;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public interface Printable {
    void setPrintName(String name);

    String getPrintName();

    void print(String string);
}
