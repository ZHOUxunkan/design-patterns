package com.zxk.visitor;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public interface Element {
    void accept(Visitor v);
}
