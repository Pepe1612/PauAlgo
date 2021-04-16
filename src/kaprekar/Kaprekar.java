package kaprekar;

import java.util.Arrays;

public class Kaprekar {
    int i = 0;

    public int kaprekar(int a) {
        if (a > 9999) return 0;

        int[] num = new int[2];
        num = changeNumbers(a, num);
        int result = num[1] - num[0];
        p(num, a);

        if (result != 6174) kaprekar(result);

        return ++i;
    }

    private int[] changeNumbers(int result, int[] num) {
        int[] arr = new int[2];
        int num1 = num[0];
        int num2 = num[1];
        StringBuilder tmp = new StringBuilder();
        String number = String.valueOf(result);

        if (number.length() <= 3) {
            if (number.length() == 3) {
                number = "0" + number;
            } else if (number.length() == 2) {
                number = "00" + number;
            } else {
                number = "000" + number;
            }
        }

        number = sortString(number);
        num1 = Integer.parseInt(number);
        tmp.append(number);
        tmp.reverse();

        if (tmp.charAt(0) == '0') {
            if (tmp.charAt(1) == '0') {
                if (tmp.charAt(2) == '0') {
                    tmp.replace(0, 2, "");
                }
                tmp.replace(0, 1, "");
            }
            tmp.replace(0, 0, "");
        }

        number = tmp.toString();
        num2 = Integer.parseInt(number);
        arr[0] = num1;
        arr[1] = num2;

        return arr;
    }

    private String sortString(String s) {
        char[] tmp = s.toCharArray();
        Arrays.sort(tmp);
        return new String(tmp);
    }

    private void p(int[] num, int result) {
        System.out.print("od " + result + " do ");
        System.out.print(num[1] + " - ");
        System.out.println(num[0] + ";");
    }
}
