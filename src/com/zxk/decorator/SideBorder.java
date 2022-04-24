package com.zxk.decorator;

/**
 * @author zhouer
 * @date 2022-04-24
 * 实现加侧边功能的装饰实现类
 */

public class SideBorder extends Border {
    private char boardChar;

    public SideBorder(Display display, char boardChar) {
        super(display);
        this.boardChar = boardChar;
    }

    @Override
    public int getColumns() {
        return 2 + display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return boardChar + display.getRowText(row) + boardChar;
    }
}
