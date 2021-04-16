package order;

import java.util.Arrays;

public class OrderNumbers {

    public void orderDigits(int[] a) {

        String[] elements = new String[a.length];

        System.out.println("----zad4----");

        for (int i = 0; i < a.length; i++) {
            elements[i] = String.valueOf(a[i]);
        }

        System.out.print("<<< ");

        for (int i = 0; i < elements.length; i++) {
            char[] tmpArr = elements[i].toCharArray();
            Arrays.sort(tmpArr);
            elements[i] = new String(tmpArr);
            a[i] = Integer.parseInt(elements[i]);
            System.out.print(a[i] + " ");
        }

        System.out.println(">>>");
        System.out.print("<<< ");

        for (int i = 0; i < elements.length; i++) {
            StringBuilder tmp = new StringBuilder();
            char[] tmpArr = elements[i].toCharArray();
            Arrays.sort(tmpArr);
            elements[i] = new String(tmpArr);
            tmp.append(elements[i]);
            tmp.reverse();
            elements[i] = tmp.toString();
            a[i] = Integer.parseInt(elements[i]);
            System.out.print(a[i] + " ");
        }

        System.out.println(">>>");
    }
}

