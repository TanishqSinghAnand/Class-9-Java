package Class_9.chapter_2;

import java.io.*;

class ArrowPattern {

    static void print_arrow(int n) {
        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < n - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int n = 5;

        print_arrow(n);

    }
}
