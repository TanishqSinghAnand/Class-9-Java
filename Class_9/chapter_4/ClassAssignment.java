package Class_9.chapter_4;

import java.util.*;

class ClassAssignment {
    static void first() {
        int y = 8;
        y += ++y + y-- + y;
        System.out.println(y);
    }

    static void second() {
        System.out.println(Math.floor(-4.7));
        System.out.println(Math.ceil(3.4) + Math.pow(2, 3));
    }

    static void third() {
        System.out.println("Tanishq" + "\n" + "Anand");
    }

    static void fourth() {
        int var = 3;
        switch (var) {
        case 1:
            System.out.println("Good");
            break;
        case 2:
            System.out.println("Better");
            break;
        case 3:
            System.out.println("Best");
            break;
        default:
            System.out.println("Invalid");
            break;
        }
    }

    static void five() {
        double bill = 500000;
        double discount = bill > 10000 ? bill * 0.1 : bill * 0.05;
        System.out.println(discount);
    }

    static void read() {
        Scanner s1 = new Scanner(System.in);
        while (true) {
            System.out.println(
                    " enter 1 for addition; 2 for subtraction; 3 for multiplication; 4 for division; 0 for exit");
            int choice = s1.nextInt();
            switch (choice) {
            case 1:
                System.out.println("enter numbers");
                int num = s1.nextInt();
                int num2 = s1.nextInt();
                System.out.println("result=" + (num + num2));
                break;
            case 2:
                System.out.println("enter numbers");
                int num3 = s1.nextInt();
                int num4 = s1.nextInt();
                System.out.println("result=" + (num3 - num4));
                break;
            case 3:
                System.out.println("enter numbers");
                int num5 = s1.nextInt();
                int num6 = s1.nextInt();
                System.out.println("result=" + (num5 * num6));
                break;
            case 4:
                System.out.println("enter numbers");
                int num7 = s1.nextInt();
                int num8 = s1.nextInt();
                System.out.println("result=" + (num7 / num8));
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("invalid");
            }
            s1.close();
        }

    }

    static void six() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "Enter your choice \n 1 : Addition \n 2 : Subtraction \n 3 : Multiplication \n 4 : Division \n 0 : exit");
            int choice = sc.nextInt();
            double num1, num2, result;
            switch (choice) {
            case 0:
                System.exit(0);
                break;
            case 1:
                System.out.println("Enter Number");
                num1 = sc.nextDouble();
                System.out.println("Enter Number");
                num2 = sc.nextDouble();
                result = num1 + num2;
                System.out.println("Sum = " + result);
                break;
            case 2:
                System.out.println("Enter Number");
                num1 = sc.nextDouble();
                System.out.println("Enter Number");
                num2 = sc.nextDouble();
                result = num1 - num2;
                System.out.println("Difference = " + result);
                break;
            case 3:
                System.out.println("Enter Number");
                num1 = sc.nextDouble();
                System.out.println("Enter Number");
                num2 = sc.nextDouble();
                result = num1 * num2;
                System.out.println("Multiplication = " + result);
                break;
            case 4:
                System.out.println("Enter Number");
                num1 = sc.nextDouble();
                System.out.println("Enter Number");
                num2 = sc.nextDouble();
                result = num1 / num2;
                System.out.println("Division = " + result);
                break;

            }
            sc.close();
        }
    }

    public static void main(String args[]) {
        six();
    }
}