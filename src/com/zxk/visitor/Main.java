package com.zxk.visitor;

/**
 * @author zhouer
 * @date 2022-04-25
 */

public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");
        root.add(bin);
        root.add(tmp);
        root.add(usr);
        bin.add(new File("ww", 10000));
        bin.add(new File("ee", 10000));
        root.accept(new ListVisitor());
    }
    /* 输出：
        /root (20000)
        /root/bin (20000)
        /root/bin/ww (10000)
        /root/bin/ee (10000)
        /root/tmp (0)
        /root/usr (0)
     */
}
