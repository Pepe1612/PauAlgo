package sort;

import java.util.Random;

public class SelectionSort implements Strategy{

    private double[] array;
    private double[] optArray;
    private double[] pesArray;

    public SelectionSort() {
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
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int minID = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minID]) {
                    minID = j;
                }
            }
            double tmp = array[minID];
            array[minID] = array[i];
            array[i] = tmp;
        }
    }

    @Override
    public void printResult() {
        System.out.println("----SelectionSort----");
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
