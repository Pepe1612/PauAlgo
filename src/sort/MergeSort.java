package sort;

import java.util.Random;

public class MergeSort implements Strategy {

    private double[] array;
    private double[] optArray;
    private double[] pesArray;

    public MergeSort() {
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
        int left = 0;
        int right = array.length - 1;
        mergeSort(array, left, right);
    }

    private void merge(double[] arr, int left, int m, int right) {
        int n1 = m - left + 1;
        int n2 = right - m;

        double[] L = new double[n1];
        double[] R = new double[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        int i = 0;
        int j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    private void mergeSort(double arr[], int left, int right) {
        if (left < right) {
            int m = left + (right - left) / 2;
            mergeSort(arr, left, m);
            mergeSort(arr, m + 1, right);
            merge(arr, left, m, right);
        }
    }

    @Override
    public void printResult() {
        System.out.println("----MergeSort----");
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
