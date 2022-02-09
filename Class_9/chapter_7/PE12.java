package Class_9.chapter_7;

import java.util.Scanner;

public class PE12 {
    void a(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        System.out.println("Sum = " + sum);
    }

    void b__submit(int n) {
        double sum = 0;
        boolean sub = true;
        for (int i = 1; i <= n; i += 2) {
            if (sub == true) {
                sum -= i;

            } else {
                sum += i;
            }
            sub = !sub;
        }
        System.out.println("Sum = " + sum);
    }

    void c(int n) {
        double sum = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= (double) 1 / i;
            } else {
                sum += (double) 1 / i;
            }
        }
        System.out.println("Sum = " + sum);
    }

    void d(int n) {
        double sum = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                sum += (double) 1 / i;
            } else {
                sum -= (double) 1 / i;
            }
        }
        System.out.println("Sum = " + sum);
    }

    void e__submit(int x, int n) {
        double sum = 0;
        boolean sub = true;
        for (int i = 2; i <= n; i += 2) {
            if (sub == true) {
                sum += (double) x / i;
            } else {
                sum -= (double) x / i;
            }
            sub = !sub;
        }
        System.out.println("Sum = " + sum);
    }

    void f__submit(int x, int n) {
        double sum = 0;
        boolean sub = true;
        for (int i = 1; i <= n; i++) {
            if (sub == true) {
                sum -= (double) Math.pow(x, i + 1) / (double) i;
            } else {
                sum += (double) Math.pow(x, i + 1) / (double) i;
            }
            sub = !sub;
        }
        System.out.println("Sum = " + sum);
    }

    void e(int x, int n) {
        double sum = 0;
        for (int i = 2, addOrSum = 1; i <= n; i += 2, addOrSum++) {
            if (addOrSum % 2 == 0) {
                sum -= (double) x / i;
            } else {
                sum += (double) x / i;
            }
        }
        System.out.println("Sum = " + sum);
    }

    void b(int n) {
        double sum = 0;
        for (int i = 1, subOrAdd = 1; i <= n; i += 2, subOrAdd++) {
            if (subOrAdd % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        System.out.println("Sum = " + sum);
    }

    void f(int x, int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += (double) Math.pow(x, i + 1) / i;

            } else {
                sum -= (double) Math.pow(x, i + 1) / i;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
