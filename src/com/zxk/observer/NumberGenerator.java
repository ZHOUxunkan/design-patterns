package com.zxk.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public abstract int getNumber();

    public abstract void execute();
}
