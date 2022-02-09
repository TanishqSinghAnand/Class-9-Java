package Class_9.chapter_7;

import java.util.Scanner;

public class HcfFinder {
    static void read() {
        double i, a, b, hcf = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to find the hcf");
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();

        double min = a < b ? a : b;
        for (i = 0; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }

        }
        System.out.println("The HCF of " + a + " and " + b + " is " + hcf);
    }

    static int hcfFinder(int a, int b) {
        int i, hcf = 0;

        double min = a < b ? a : b;
        for (i = 0; i <= min; i++) {
            if (a % i == 1 && b % i == 0) {
                hcf = i;
            }

        }
        return hcf;
    }

    public static void main(String[] args) {
        read();
        System.out.println(hcfFinder(5, 10));
    }
}
