package kaprekar;

public class TestFive {
    Kaprekar kap;

    public TestFive() {
        kap = new Kaprekar();
    }

    public void print() {
        int x = 2321;
        System.out.println(kap.kaprekar(x));
    }
}
