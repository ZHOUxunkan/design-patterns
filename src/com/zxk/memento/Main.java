package com.zxk.memento;

import com.zxk.memento.game.Gamer;
import com.zxk.memento.game.Memento;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();// 初始状态
        for (int i = 0; i < 30; i++) {
            System.out.println("======" + i);     // 骰子当前结果
            System.out.println("当前状态" + gamer);
            gamer.bet();// 进行游戏
            System.out.println("所持金钱" + gamer.getMoney());
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("金钱增加，更新快照");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("钱少了,回滚");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
