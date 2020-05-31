package com.pattern.observer;

public class TestPattern {
    public static void main(String[] args) {
        RandomData rnd = new RandomData();
        CurrentRandom currentRandom = new CurrentRandom(rnd);
        FutureRandom futureRandom = new FutureRandom(rnd);
        rnd.setRandomNumber(20);
        rnd.setRandomNumber(27);
        rnd.setRandomNumber(90);

    }
}
