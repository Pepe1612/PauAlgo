package sort;

public abstract class SortingAlgorithm {

    private double[] array;
    private double[] optArray;
    private double[] pesArray;

    abstract void sort(double[] array);
    protected double sortTime(double[] array) {
        double tStart = System.currentTimeMillis();

        sort(array);

        double tEnd = System.currentTimeMillis();
        double result = tEnd - tStart;
        result /= 1000.0;
        return result;
    }
    public void printResult(double[] arr, double[] optArr, double[]pesArr) {
        this.array = arr;
        this.optArray = optArr;
        this.pesArray = pesArr;

        System.out.println(this.getClass().getName());
        System.out.println("realistic time: " + sortTime(array));
        System.out.println("optimistic time: " + sortTime(optArray));
        System.out.println("pessimistic time: " + sortTime(pesArray));
    }
}
