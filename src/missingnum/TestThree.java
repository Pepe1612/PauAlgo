package missingnum;

import java.util.ArrayList;
import java.util.List;

public class TestThree {
    MissingNum missingNum;

    public TestThree() {
        this.missingNum = new MissingNum();
    }

    public void test() {
        List<Integer> array = new ArrayList<>();
        int[] missingElements;
        array.add(1);
        array.add(4);
        array.add(5);
        array.add(8);
        array.add(2);
        array.add(19);
        array.add(10);
        array.add(14);
        array.add(18);

        int target = 20;
        missingElements = missingNum.missingNum(array, target);

        System.out.println("----zad3----");
        System.out.print("<<< ");

        for (int missingElement : missingElements) {
            System.out.print(missingElement + " ");
        }

        System.out.println(">>>");
    }
}
