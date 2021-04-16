package spot;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestTwo {
    private final List<Integer> list;

    public TestTwo() {
        this.list = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            Random random = new Random();
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
