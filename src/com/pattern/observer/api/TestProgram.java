package com.pattern.observer.api;

public class TestProgram {

    public static void main(String[] args) {
        RandomData rnd=new RandomData();
        CurrentRandom currentRandom=new CurrentRandom(rnd);
        FutureRandom futureRandom=new FutureRandom(rnd);
        rnd.setRandomNumber(50);
        rnd.setRandomNumber(500);
    }
}
