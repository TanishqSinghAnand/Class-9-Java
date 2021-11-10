package Class_9.chapter_4;

import java.util.*;

public class GradeFromMarks {
    static void fun(double marks) {
        // 90-100 A
        // 80-89 B
        // 70 - 79 C
        // <70

        if (marks >= 90 && marks <= 100) {
            System.out.println("A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println('C');
        } else if (marks < 70 && marks > 0) {
            System.out.println('F');
        } else if (marks > 100 || marks < 0) {
            System.out.println("Invalid marks");
        }

    }

    static void prabhdeep() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter Num2 : ");
        int num2 = sc.nextInt();
        System.out.println("Enter : ");
        int choice = sc.next().charAt(0);
        double res = 0;

        switch (choice) {
            case 'D':
                res = num1 / num2;
            case 'M':
                res = num1 / num2;
            default:
                System.out.println("Invalid Input");

        }
        System.out.println("Res = " + res);
        sc.close();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks : ");
        int marks = sc.nextInt();
        fun(marks);
        sc.close();
    }
}
