package sort;

public class BubbleSort extends SortingAlgorithm {

    @Override
    protected void sort(double[] array) {
        double tmp;
        double breakLoop;

        do {
            breakLoop = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    tmp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = tmp;
                    breakLoop++;
                }
            }
        } while (breakLoop != 0);
    }

}
