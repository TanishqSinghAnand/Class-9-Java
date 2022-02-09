package Class_9.chapter_7;

import java.util.*;

public class Test {

    static void q1() {
        Scanner sc = new Scanner(System.in);
        int pCount = 0, nCount = 0, pSum = 0, nSum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter number : ");
            int num = sc.nextInt();
            if (num > 0) {
                pCount++;
                pSum += num;
            } else if (num < 0) {
                nCount++;
                nSum += num;
            }
        }
        System.out.println("Positive count = " + pCount);
        System.out.println("Positive sum = " + pSum);
        System.out.println("Negative count = " + nCount);
        System.out.println("Nagative sum = " + nSum);
    }

    static void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(10, i) - 1;
        }
        System.out.println("Sum = " + sum);
    }

    static void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += Math.pow(i, 2);
            } else if(i%2!=0 && i > 1){
                sum -= Math.pow(i, 2);
            }
            else if(i == 1){
                sum += Math.pow(i,2);
            }
        }
        System.out.println("Sum = "+sum);
    }

    public static void main(String[] args) {
        q3();
    }
}
// 