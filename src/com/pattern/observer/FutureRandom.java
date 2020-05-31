package com.pattern.observer;

public class FutureRandom implements Observer {

    private Subject randomData;

    public FutureRandom(Subject randomData) {
        this.randomData = randomData;
        randomData.registerObserver(this);
    }

    @Override
    public void update(int num) {
        display(num);
    }

    private void display(int num) {
        System.out.println("Future Random Value ::"+num);
    }
}
