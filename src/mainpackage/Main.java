package mainpackage;

import sort.*;
import tests.*;

public class Main {

    public static void main(String[] args) {
        //zad1
        TestOne testOne = new TestOne(new QuickSort());
        testOne.printResult();

        //zad2
        TestTwo testTwo = new TestTwo();
        testTwo.spot();

        //zad3
        TestThree testThree = new TestThree();
        testThree.test();

        //zad4
        TestFour testFour = new TestFour();
        testFour.test();

        //zad5
        TestFive testFive = new TestFive();
        testFive.print();
    }
}
