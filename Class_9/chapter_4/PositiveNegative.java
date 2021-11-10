package Class_9.chapter_4;

import java.util.*;

public class PositiveNegative {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number : ");
            double num = sc.nextDouble();
            if (num > 0) {
                System.out.println("Positive \n");
            } else if (num < 0) {
                System.out.println("Nagative \n");
            } else {
                System.out.println("Invalid Input");
                break;
            }
        }
        sc.close();

    }
}
