package Class_9.chapter_4;

import java.util.*;

public class OddEven {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter number : ");
            double num = sc.nextDouble();
            if (num % 2 == 0) {
                System.out.println("Even");
            } else if (num % 2 != 0) {
                System.out.println("Odd");
            } else {
                System.out.println("Invalid Input");
                break;
            }
        }
        sc.close();
        
    }
}
