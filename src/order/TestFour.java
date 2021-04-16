package order;

public class TestFour {
    OrderNumbers orderNumbers;

    public TestFour() {
        orderNumbers = new OrderNumbers();
    }

    public void test() {
        int[] arr = {4129, 824, 43, 777, 730, 251516, 1319};
        orderNumbers.orderDigits(arr);
    }
}
