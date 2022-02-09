package Class_9.chapter_7;

import java.util.Scanner;

public class PE10 {

    
    static Scanner sc = new Scanner(System.in);
    static void first() {
        System.out.println("Enter max n : ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (double) i / (i + 1);
        }
        System.out.println("Sum = " + sum);
    }

    static void second() {
        System.out.println("Enter max n : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i) + 1;
        }
        System.out.println("Sum = " + sum);
    }

    static void third() {
        System.out.println("Enter max n : ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (double) i / (i * i);
        }
        System.out.println("Sum = " + sum);
    }

    static void fourth() {
        System.out.println("Enter max n : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Before = " + sum);
            sum += (double) i / (i+1);
            System.out.println("After = " + sum);
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        first();
    }
}
