package com.pattern.observer.api;

import java.util.Observable;
import java.util.Observer;

public class FutureRandom implements Observer {
    Observable observable;

    public FutureRandom(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        display((int) o);
    }

    private void display(int num) {
        System.out.println("Future Random Value ::" + num);
    }
}
