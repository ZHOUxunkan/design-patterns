package com.zxk.composite;

/**
 * @author zhouer
 * @date 2022-04-24
 * 统一 file 和 directory
 */

public abstract class Entry {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentsException {
        throw new FileTreatmentsException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String s);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
