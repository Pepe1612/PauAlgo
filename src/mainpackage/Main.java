package mainpackage;

import kaprekar.TestFive;
import missingnum.TestThree;
import order.TestFour;
import spot.TestTwo;
import sort.*;

public class Main {

    public static void main(String[] args) {
        //zad1
        TestOne testOne = new TestOne(new BubbleSort());
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
