package Class_9.chapter_4;

import java.util.*;

public class PractiseExcersieThreeQuestionOne {
    static void greatest(double one, double two, double three) {
        double greatest = 0;
        if (one > two && one > three) {
            greatest = one;
        } else if (two > one && two > three) {
            greatest = two;
        } else if (three > one && three > one) {
            greatest = three;
        }
        System.out.println(greatest + " is the greatest");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double num1 = 0, num2 = 0, num3 = 0;
        System.out.println("Enter 1st number : ");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        num2 = sc.nextInt();
        System.out.println("Enter 3rd number : ");
        num3 = sc.nextInt();
        if (num1 != num2 && num2 != num3 && num1 != num3) {
            greatest(num1, num2, num3);
        } else if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("Numbers cant be equal");
        }

        sc.close();
    }
}
