package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomData implements Subject {
    int randomNum;
    private List<Observer> observerList;
    public RandomData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observerList) {
            observer.update(randomNum);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    public void setRandomNumber(int num) {
        this.randomNum = num;
        notifyObserver();
    }
}
