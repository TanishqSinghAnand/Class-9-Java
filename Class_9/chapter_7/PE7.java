package Class_9.chapter_7;

import java.util.Scanner;

public class PE7 {

    static Scanner sc = new Scanner(System.in);

    static void board() {
        System.out.println("Enter max n : ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println(sum);
            sum += (double) i / (i + 1);
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
       board();
    }
}
