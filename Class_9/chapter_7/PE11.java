package Class_9.chapter_7;

import java.util.Scanner;

class PE11 {

    static Scanner sc = new Scanner(System.in);

    static void first() {
        System.out.println("Enter X : ");
        int x = sc.nextInt();
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (double) i / x;
        }
        System.out.println("Sum = " + sum);
    }

    static void second() {
        System.out.println("Enter X : ");
        int x = sc.nextInt();
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        double sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += (double) i / x;
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        first();
    }
}
