package com.zxk.adapter;

import com.zxk.adapter.extend.Print;
import com.zxk.adapter.extend.PrintBanner;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
    /*
        (Hello)
        *Hello*
     */
}
