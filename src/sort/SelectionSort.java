package sort;

public class SelectionSort extends SortingAlgorithm{

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
}
