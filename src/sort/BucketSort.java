package sort;

import java.awt.*;
import java.util.Collections;

public class BucketSort extends SortingAlgorithm {

    @Override
    protected void sort(double[] array) {

        double max_value = 0.0;
        for (double value : array)
            if (value > max_value)
                max_value = value;

        double[] bucket = new double[(int) (max_value + 1)];
        double[] sorted_arr = new double[array.length];

        for (double v : array) bucket[(int) v]++;

        int pos = 0;
        for (int i = 0; i < bucket.length; i++)
            for (int j = 0; j < bucket[i]; j++)
                sorted_arr[pos++] = i;
    }
}
