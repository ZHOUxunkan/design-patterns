package com.zxk.proxy;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class PrintProxy implements Printable {
    private String name;
    private Printer real;

    public PrintProxy() {
    }

    public PrintProxy(String name) {
        this.name = name;
    }

    @Override
    public void setPrintName(String name) {
        if (real != null) {
            real.setPrintName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrintName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
