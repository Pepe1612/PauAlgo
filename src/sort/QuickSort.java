package sort;

import java.util.Random;

public class QuickSort implements Strategy {

    private double[] array;
    private double[] optArray;
    private double[] pesArray;

    public QuickSort() {
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
        int low = 0;
        int high = array.length - 1;
        quickSort(array, low, high);
    }

    private void swap(double[] arr, int i, int j) {
        double tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    @Override
    public void printResult() {
        System.out.println("----QuickSort----");
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
            pesArray[i] = i + 1;
        }
        for (int i = size - 1, j = 1; i >= 0; i--, j++) {
            optArray[i] = j;
        }
    }
}
