package sort;

import java.util.Random;

public class BubbleSort implements Strategy {

    private final double[] array;
    private final double[] optArray;
    private final double[] pesArray;

    public BubbleSort() {
        array = new double[size];
        optArray = new double[size];
        pesArray = new double[size];
        setArrays();
    }

    @Override
    public double sortTime(double[] array) {
        double tStart = System.currentTimeMillis();

        sort(array);

        double tEnd = System.currentTimeMillis();
        double result = tEnd - tStart;
        result /= 1000.0;
        return result;
    }

    @Override
    public void sort(double[] array) {
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

    @Override
    public void printResult() {
        System.out.println("----BubbleSort----");
        System.out.println("realistic time: " + sortTime(array));
        System.out.println("optimistic time: " + sortTime(optArray));
        System.out.println("pessimistic time: " + sortTime(pesArray));
    }

    public void setArrays() {
        Random random = new Random();
        for ( int i = 0; i<size; i++){
            array[i] = random.nextInt(size / 2);
        }
        for (int i = size - 1; i >= 0; i--) {
            optArray[i] = i + 1;
        }
        for (int i = size - 1, j = 1; i >= 0; i--, j++) {
            pesArray[i] = j;
        }
    }
}
