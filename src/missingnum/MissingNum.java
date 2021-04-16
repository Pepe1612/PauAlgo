package missingnum;

import java.util.ArrayList;
import java.util.List;

public class MissingNum {

    public int[] missingNum(List<Integer> a, int max) {

        List<Integer> missingElements = new ArrayList<>();

        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j) == i) break;
                if (j == a.size() - 1) missingElements.add(i);
            }
        }

        //przepisanie do int[]
        int[] result = new int[missingElements.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = missingElements.get(i);
        }

        return result;
    }

}
