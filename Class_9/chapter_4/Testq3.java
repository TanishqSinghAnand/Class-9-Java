package Class_9.chapter_4;

import java.util.*;

public class Testq3 {
    static void fun(double income) {
        double tax = 0;
        if (income <= 100000) {
            tax = 0;
        } else if (income >= 100001 && income <= 150000) {
            tax = 0.1 * income;
        } else if (income >= 150001 && income <= 250000) {
            tax = 0.2 * income;
        } else if (income > 250000) {
            tax = 0.3 * income;
        }
        System.out.println("Tax = " + tax);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String name = sc.nextLine();
        System.out.println("Enter income : ");
        double income = sc.nextDouble(),tax=0;
        // double tax = 0;
        if (income <= 100000) {
            tax = 0;
        } else if (income >= 100001 && income <= 150000) {
            tax = 0.1 * income;
        } else if (income >= 150001 && income <= 250000) {
            tax = 0.2 * income;
        } else if (income > 250000) {
            tax = 0.3 * income;
        }
        System.out.println("Tax = " + tax);
    }
}
