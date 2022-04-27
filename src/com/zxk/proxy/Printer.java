package com.zxk.proxy;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class Printer implements Printable {
    private String name;

    public Printer() {
        heavyJob("Printer的实例生成中....");
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer的实例 " + name + " 生成中....");
    }

    @Override
    public void setPrintName(String name) {
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("====" + name + "====");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("end");
    }
}
