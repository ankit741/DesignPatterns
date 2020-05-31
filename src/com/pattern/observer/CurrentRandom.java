package com.pattern.observer;

public class CurrentRandom implements Observer{

    private Subject randomData;

    public CurrentRandom(Subject randomData) {
        this.randomData=randomData;
        randomData.registerObserver(this);
    }

    @Override
    public void update(int num) {
       display(num);
    }

    private void display(int num) {
        System.out.println("Current Random Value ::"+num);
    }
}
