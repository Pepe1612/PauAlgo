package sort;

import java.util.Collections;
import java.util.Random;
import java.util.Vector;

public class BucketSort implements Strategy{

    private double[] array;
    private double[] optArray;
    private double[] pesArray;

    public BucketSort() {
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
        Vector<Double>[] buckets = new Vector[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new Vector<Double>();
        }
        for (double v : array) {
            int IDx = (int) v * n;
            buckets[IDx].add(v);
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                array[index++] = buckets[i].get(j);
            }
        }
    }

    @Override
    public void printResult() {
        System.out.println("----BucketSort----");
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
