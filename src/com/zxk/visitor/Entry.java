package com.zxk.visitor;

import com.zxk.composite.FileTreatmentsException;

import java.util.Iterator;

/**
 * @author zhouer
 * @date 2022-04-24
 * 统一 file 和 directory
 */

public abstract class Entry implements Element {
    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentsException {
        throw new FileTreatmentsException();
    }

    public Iterator iterator() throws FileTreatmentsException {
        throw new FileTreatmentsException();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
