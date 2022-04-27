package com.zxk.proxy;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class Main {
    public static void main(String[] args) {
        Printable proxy = new PrintProxy("lisi");
        System.out.println(proxy.getPrintName());
        proxy.setPrintName("zhangsan");
        System.out.println(proxy.getPrintName());
        proxy.print("打印");
    }
}
