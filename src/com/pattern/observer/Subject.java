package com.pattern.observer;

public interface Subject {

    void notifyObserver();

    void registerObserver(Observer o);

    void removeObserver(Observer o);
}
