package tests;

import java.util.Random;

import sort.*;

public class TestOne implements Strategy{

    public Strategy strategy;

    public TestOne(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public double sortTime(double[] array) {
        return strategy.sortTime(array);
    }

    @Override
    public void sort(double[] array) {
        strategy.sort(array);
    }

    @Override
    public void printResult() {
        strategy.printResult();
    }
}
