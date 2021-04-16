package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import spot.*;

public class TestTwo {
    private List<Integer> list;
    private Random random = new Random();

    public TestTwo() {
        this.list = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            list.add(random.nextInt(2000) - 1000);
        }
    }

    public void spot() {
        Spot spotObject = new Spot();
        System.out.println("----zad2----");
        int[] arr;
        try {
            arr = spotObject.spot(list, 100);
        }
        catch (NoSolutionException ex) {
            System.out.println(ex.getMessage());
            return;
        }
        System.out.println("result: " + arr[0] + " and " + arr[1]);
    }
}
