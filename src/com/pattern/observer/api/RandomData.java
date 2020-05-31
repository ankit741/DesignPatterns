package com.pattern.observer.api;

import java.util.Observable;

public class RandomData extends Observable {

    private int randomNum;

    public RandomData() {

    }

    public void setRandomNumber(int num) {
        this.randomNum = num;
        valueChanged();

    }

    private void valueChanged() {
        setChanged();
        notifyObservers(randomNum);
    }

    public int getRandomNum() {
        return randomNum;
    }
}
