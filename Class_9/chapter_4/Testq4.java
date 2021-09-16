package Class_9.chapter_4;

import java.util.*;

public class Testq4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        double area = 0;
        switch (choice) {
            case 1:
                int lenght = sc.nextInt();
                int width = sc.nextInt();
                area = lenght * width;
                break;
            case 2:
                int radius = sc.nextInt();
                area = 22 / 7 * radius * radius;
                break;
            case 3:
                int base = sc.nextInt();
                int height = sc.nextInt();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid input");
        }
        System.out.println("Area = " + area);
    }
}
