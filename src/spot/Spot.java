package spot;

import java.util.List;

public class Spot {
    public int[] spot(List<Integer> a, int target) throws NoSolutionException {

        for (int i = 0; i < a.size(); i++) {

            for (int j = i; j < a.size(); j++) {

                if (a.get(i) + a.get(j) == target) {
                    return new int[]{a.get(i), a.get(j)};
                }
            }
        }

        throw new NoSolutionException();
    }
}
