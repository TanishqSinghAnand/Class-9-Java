package Class_9.chapter_7;

import java.util.Scanner;

public class PE13 {

    static void read(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 5 == 0)
                System.out.println(i);
            sum += i;
        }
        System.out.println(sum);
    }

    // 1!/x + 2!/x + 3/x
    static void first(int x, int n) {
        double sum = 0;
        double factor = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                factor *= j;
            }
            sum += (double) factor / x;
        }
        System.out.println("Sum = " + sum);
    }

    static void second(int x, int n) {
        // 1!/X + 3!/X + 5!/x
        double sum = 0;
        double factor = 1;
        for (int i = 1; i <= n; i += 2) {
            for (int j = 1; j < i; j++) {
                factor *= j;
            }
            sum += (double) factor / x;
        }
        System.out.println("Sum = " + sum);
    }

    static void third(int x, int n) {
        // x/2! + x/4! + x/6!
        double sum = 0;
        double factor = 1;
        for (int i = 2; i <= n; i += 2) {
            for (int j = 1; j < i; j++) {
                factor *= j;
            }
            sum += (double) x / factor;
        }
        System.out.println("Sum = " + sum);
    }

    static void fourth(int x, int n) {
        // x^2/2! + x^2/4! + x^2/6!
        double sum = 0;
        double factor = 1;
        for (int i = 2; i <= n; i += 2) {
            for (int j = 1; j < i; j++) {
                factor *= j;
            }
            sum += (double) Math.pow(x, 2) / factor;
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter X : ");
        // int x = sc.nextInt();
        // System.out.println("Enter N : ");
        // int n = sc.nextInt();
        // first(x, n);

        read(10);
    }
}
