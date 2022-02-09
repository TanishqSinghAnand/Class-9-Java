package Class_9.chapter_7;

import java.util.*;

public class LcmFinderReturner {
    static int hcf(int a, int b) {
        int i, hcf = 0;

        double min = a < b ? a : b;
        for (i = 0; i <= min; i++) {
            if (a % i == 1 && b % i == 0) {
                hcf = i;
            }

        }
        return hcf;
    }

    static int lcm(int a, int b) {
        int lcm = 0;
        int hacf = hcf(a, b);
        lcm = (a * b) / hacf;

        return lcm;

    }

    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to find the lcm");
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        System.out.println("The lcm of " + a + " and " + b + " is " + lcm(a, b));
        sc.close();
    }
}
