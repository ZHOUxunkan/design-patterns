package com.zxk.observer;

/**
 * @author zhouer
 * @date 2022-04-27
 */

public class Main {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();
        randomNumberGenerator.add(digitObserver);
        randomNumberGenerator.add(graphObserver);
        randomNumberGenerator.execute();
    }
    /*
        DigitObserver:39
        GraphObserver:***************************************
        DigitObserver:48
        GraphObserver:************************************************
        DigitObserver:32
        GraphObserver:********************************
        DigitObserver:27
        GraphObserver:***************************
        DigitObserver:18
        GraphObserver:******************
        DigitObserver:31
        GraphObserver:*******************************
        DigitObserver:4
        GraphObserver:****
        DigitObserver:20
        GraphObserver:********************
        DigitObserver:33
        GraphObserver:*********************************
        DigitObserver:39
        GraphObserver:***************************************
        DigitObserver:13
        GraphObserver:*************
        DigitObserver:21
        GraphObserver:*********************
        DigitObserver:10
        GraphObserver:**********
        DigitObserver:4
        GraphObserver:****
        DigitObserver:30
        GraphObserver:******************************
        DigitObserver:14
        GraphObserver:**************
        DigitObserver:33
        GraphObserver:*********************************
        DigitObserver:16
        GraphObserver:****************
        DigitObserver:45
        GraphObserver:*********************************************
        DigitObserver:20
        GraphObserver:********************
     */
}
