package Class_9.chapter_4;

// package Class_9.chapter_4;

import java.util.*;

public class Hrithvik_School_Project {
    static void p1q1(double side) {
        double area = side * side;
        double perimeter = 4 * side;
        double diagonal = Math.sqrt(2) * side;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Diagonal = " + diagonal);
    }

    static void p1q2(double p, double r, double t) {
        double si = p * r * t / 100;
        System.out.println("SI = " + si);
    }

    static void p1q3(int days) {

        int years = days / 365;
        int months = days / 30 - (years * 12);
        int daysLeft = days % 365 - (months * 30);
        System.out.println("Years = " + years + " Months = " + months + " Days = " + daysLeft);

    }

    static void p1q4(double num1, double num2) {
        System.out.println("Numbers before swapping are " + num1 + " & " + num2);
        double num1Temp = num1;
        num1 = num2;
        num2 = num1Temp;
        System.out.println("Numbers after swapping are " + num1 + " & " + num2);
    }

    static void p1q5(double num1, double num2, double num3, double num4) {
        double sum = num1+num2+num3+num4;
        double average = sum/4;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }

    static void p2q1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your salary");
        double  salary = sc.nextDouble();
        double hra = 0.15*salary;
        double da = 0.7*salary;
        double ta = 0.2*salary;
        double pf = 0.1*salary;
        double netSalary = salary+hra+da+ta+pf;
        System.out.println(name + "\'s net salary is " + netSalary);
        // 90-100 A
        // 80-89 B
        //  70 - 79 C
        // <70

    }

    public static void main(String args[]) {
        // p1q4(400, 500);
        p2q1();
    }
}