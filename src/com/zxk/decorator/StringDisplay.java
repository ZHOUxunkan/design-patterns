package com.zxk.decorator;

/**
 * @author zhouer
 * @date 2022-04-24
 * 显示单行字符串
 */

public class StringDisplay extends Display {
    private String s;

    public StringDisplay(String s) {
        this.s = s;
    }

    @Override
    public int getColumns() {
        return s.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return s;
        } else {
            return null;
        }
    }
}
