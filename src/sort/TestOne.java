package sort;

import java.util.Random;

public class TestOne {

    private final int size = 10000;
    private final double[] array;
    private final double[] optArray;
    private final double[] pesArray;

    private final SortingAlgorithm algorithm;

    public TestOne(SortingAlgorithm algorithm) {
        array = new double[size];
        optArray = new double[size];
        pesArray = new double[size];
        makeProblem();
        this.algorithm = algorithm;
    }

    private void makeProblem() {
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
    public void printResult() {
        algorithm.printResult(array, optArray, pesArray);
    }
}