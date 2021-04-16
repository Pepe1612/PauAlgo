package tests;

import kaprekar.*;

public class TestFive {
    Kaprekar kap;

    public TestFive() {
        kap = new Kaprekar();
    }

    public void print() {
        int x = 2222;
        System.out.println(kap.kaprekar(x));
    }
}
