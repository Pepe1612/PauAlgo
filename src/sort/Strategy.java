package sort;

public interface Strategy {
    final int size = 10000;
    double sortTime(double[] array);
    void sort(double[] array);
    void printResult();
}
