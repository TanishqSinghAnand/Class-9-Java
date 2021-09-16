package Class_9.chapter_4;

import java.util.*;

public class MenuProgram {

    public static void main(String args[]) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for division");
            System.out.println("Press 4 for multiplication");
            System.out.println("Press 0 to exit");
            int c = sc.nextInt();
            if (c == 0) {
                break;
            }
            else if (c == 1) {
                System.out.println("U have chosen Addition");
                System.out.println("Enter 1st number : ");
                double num1 = sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                double num2 = sc.nextDouble();
                double sum = num1+num2;
                System.out.println("Sum = " + sum);
            }
            else if (c == 2) {
                System.out.println("U have chosen subtraction");
                System.out.println("Enter 1st number : ");
                double num1 = sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                double num2 = sc.nextDouble();
                double sub = num1-num2;
                System.out.println("Subtraction = " + sub);
            }
            else if (c == 3) {
                System.out.println("U have chosen division");
                System.out.println("Enter 1st number : ");
                double num1 = sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                double num2 = sc.nextDouble();
                double division = num1/num2;
                System.out.println("Sum = " + division);
            }
            else if (c == 4) {
                System.out.println("U have chosen multiplication");
                System.out.println("Enter 1st number : ");
                double num1 = sc.nextDouble();
                System.out.println("Enter 2nd number : ");
                double num2 = sc.nextDouble();
                double multiplication = num1*num2;
                System.out.println("Sum = " + multiplication);
            }
            else{
                System.out.println("Invalid Input");
            }
        }

    }
}
