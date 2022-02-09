package Class_9.PYQ;

import java.net.SocketTimeoutException;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 12;
        arr[2] = 31;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Orignal arr");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            int temp;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("\n\n\nAfter SORT");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        // int a[] = new int[2];
        // a[0] = 100;
        // a[1]=20;
        // System.err.println("a="+ a[0] + " b="+a[1]);
        // int temp;
        // if (a[0]>a[1]) {
        // temp=a[0];
        // a[0] = a[1];
        // a[1] = temp;
        // }
        // System.err.println("a=" + a[0] + " b=" + a[1]);

    }
}
