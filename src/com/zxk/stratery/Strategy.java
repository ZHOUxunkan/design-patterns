package com.zxk.stratery;

/**
 * @author zhouer
 * @date 2022-04-24
 * 定义策略的接口
 */

public interface Strategy {
    /**
     * 返回下一局要出的手势
     * @return
     */
    Hand nextHand();

    /**
     * 学习上一局的输赢
     * @param win
     */
    void study(boolean win);
}
