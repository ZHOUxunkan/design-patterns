package com.zxk.visitor;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public interface Visitor {
    void visit(File file);

    void visit(Directory directory);
}
