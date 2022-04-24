package com.zxk.decorator;

/**
 * @author zhouer
 * @date 2022-04-24
 */

public abstract class Display {
    public abstract int getColumns();              // 获取横向字符数

    public abstract int getRows();                 // 获取纵向行数

    public abstract String getRowText(int row);     // 获取第 row 行的字符数

    // 全部显示
    public final void show() {
        for (int i = 0; i < getRows(); i++) System.out.println(getRowText(i));
    }

}
