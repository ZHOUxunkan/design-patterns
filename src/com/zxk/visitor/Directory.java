package com.zxk.visitor;

import com.zxk.composite.FileTreatmentsException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zhouer
 * @date 2022-04-24
 */

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    public Iterator iterator() throws FileTreatmentsException {
        return directory.iterator();
    }

    /**
     * 接受访问者的访问
     * @param v
     */
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
