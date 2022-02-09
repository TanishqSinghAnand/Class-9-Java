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
        double sum = num1 + num2 + num3 + num4;
        double average = sum / 4;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }

    static void p2q1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your salary");
        double salary = sc.nextDouble();
        double hra = 0.15 * salary;
        double da = 0.7 * salary;
        double ta = 0.2 * salary;
        double pf = 0.1 * salary;
        double netSalary = salary + hra + da + ta + pf;
        System.out.println(name + "\'s net salary is " + netSalary);
    }

    static void p2q2(int noOfStudents) {
        double noOfBus = noOfStudents / 25;
        if (noOfStudents % 25 != 0) {
            noOfBus++;
        }
        System.out.println("No of mini bus required = " + noOfBus);
        System.out.println("No of students in last bus = " + (noOfStudents % 25));
    }

    static void p2q4(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area = " + area);
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter = " + perimeter);
    }

    static void p3q1(int number) {
        if (number > -1 && number < 10) {
            System.out.println("Single digit number");
        } else if (number > 9 && number < 100) {
            System.out.println("Two digit number");
        } else if (number > 99 && number < 1000) {
            System.out.println("Three digit number");
        } else {
            System.out.println("Invalid number");
        }
    }

    static void p3q2(String name, double salary, double saving) {
        if (saving > salary) {
            System.out.println("Saving cant be greater than salary");
        } else {
            double taxIncome = salary - saving;
            double tax = 0;
            if (taxIncome < 20_000) {
                System.out.println("0% tax");
                tax = 0;
            } else if (taxIncome >= 20000 && taxIncome <= 500000) {

                tax = 0.1 * taxIncome;
                System.out.println("10% tax");

            } else if (taxIncome >= 500000 && taxIncome < 1000000) {

                tax = 0.2 * taxIncome;
                System.out.println("20% tax");

            } else if (taxIncome > 1000000) {

                tax = 0.3 * taxIncome;
                System.out.println("30% tax");

            }
            System.out.println("Tax = " + tax);
        }

    }

    static void p3q3(int num1, int num2) {
        int res = num1 > num2 ? num1 + num2 : num1 - num2;
        System.out.println("Result = " + res);
    }

    static void p4q1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice \n 1. For cuboid \n 2. For cylinder \n 3. For cone");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your choice is cuboid");
                System.out.println("Enter length");
                double length = sc.nextDouble();
                System.out.println("Enter breadth");
                double breadth = sc.nextDouble();
                System.out.println("Enter height");
                double height = sc.nextDouble();
                double volume = length * breadth * height;
                System.out.println("Volume = " + volume);
                break;
            case 2:
                System.out.println("Your choice is cylinder");
                System.out.println("Enter radius");
                double radius = sc.nextDouble();
                System.out.println("Enter height");
                double height1 = sc.nextDouble();
                double volume1 = Math.PI * Math.pow(radius, 2) * height1;
                System.out.println("Volume = " + volume1);
                break;
            case 3:
                System.out.println("Your choice is cone");
                System.out.println("Enter radius");
                double radius1 = sc.nextDouble();
                System.out.println("Enter height");
                double height2 = sc.nextDouble();
                double volume2 = Math.PI * radius1 * radius1 * height2 / 3;
                System.out.println("Volume = " + volume2);
                break;
        }
    }

    static void p5q1() {
        for (int i = 20; i > 0; i--) {
            System.out.println(i);
        }
    }

    static void p5q2() {
        for (int i = 0; i < 5; i++) {
            int second = (10 - i);
            System.out.print(i + "\t" + second + "\n");
        }
    }

    static void p5q3(int num) {
        String numString = Integer.toString(num);
        String numReversed = "";
        for (int i = 0; i < numString.length(); i++) {
            numReversed += numString.charAt(numString.length() - i - 1);
        }
        int reveredNum = Integer.parseInt(numReversed);
        if (num == reveredNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }

    static void p5q4(){
        Scanner sc = new Scanner(System.in);
        double totalSum =0;
        while(true){
            System.out.println("Enter 1 to add number and 0 to exit");
            int num = sc.nextInt();
            switch(num){
                case 1:
                    System.out.println("Enter number");
                    totalSum += sc.nextDouble();
                    break;
                case 0:
                    System.out.println("Total sum = " + totalSum);
                    System.exit(0);
                    break;
                default:
                System.out.println("Invalid input");
            }
        }
    }

    public static void main(String args[]) {
        // p1q4(400, 500);
        p5q4();
    }
}