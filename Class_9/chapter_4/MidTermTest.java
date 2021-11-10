package Class_9.chapter_4;

import java.util.*;

public class MidTermTest {

    public static void main(String args[]) {
        System.out.println("XD");
    }

    void q6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice 1 for cuboid, 2 for cylinder, 3 for cone : ");
        int choice = sc.nextInt();

        switch (choice) {
        case 1:
            System.out.println("Enter Lenght");
            double l = sc.nextDouble();
            System.out.println("Enter height");
            double h = sc.nextDouble();
            System.out.println("Enter width");
            double w = sc.nextDouble();

            double volume = l * w * h;
            System.out.println("Volume = " + volume);
            break;
        case 2:
            System.out.println("Enter Radius");
            double r = sc.nextDouble();
            System.out.println("Enter height");
            double height = sc.nextDouble();

            double volumeCylider = 3.14 * r * r * height;
            System.out.println("Volume = " + volumeCylider);
            break;
        case 3:
            System.out.println("Enter Readius");
            double rad = sc.nextDouble();
            System.out.println("Enter height");
            double ht = sc.nextDouble();
            double volumeCone = 3.14 * rad * rad * ht / 3;
            System.out.println("Volume = " + volumeCone);
            break;
        default:
            System.out.println("Invalid choice");
            break;

        }
        sc.close();
    }

    void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in maths : ");
        int math = sc.nextInt();
        System.out.println("Enter marks in English : ");
        int eng = sc.nextInt();
        System.out.println("Enter marks in Science : ");
        int sci = sc.nextInt();

        if (eng >= 80 && math >= 80 && sci >= 80) {
            System.out.println("Pure Science");
        } else if (eng >= 80 && sci >= 80 && math >= 60) {
            System.out.println("Bio Science");
        } else if (eng >= 60 && math >= 60 && sci >= 60) {
            System.out.println("Commerce");
        } else {
            System.out.println("Consult a teacher");
        }
        sc.close();

    }

    void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter double digit number : ");
        int num = sc.nextInt();
        if (num > 9 && num < 100) {
            if (num % 11 == 0) {
                System.out.println("Both digits are same");
            } else {
                System.out.println("Not Same");
            }
        } else {
            System.out.println("Invalid");
        }
        sc.close();
    }

    void q1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds : ");
        int seconds = sc.nextInt();
        int hour = seconds / 3600;
        int min = (seconds % 3600) / 60;
        int rSec = seconds - (min*60) - (hour * 3600);
        System.out.println(hour + "H : " + min + "M : " + rSec + "S");
        sc.close();
    }
}
