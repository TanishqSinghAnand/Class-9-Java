package Class_9.chapter_4;

import java.util.*;

public class eg2 {
    static void read(double average) {
        if (average >= 40 && average <= 100) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Average");
        double average = sc.nextDouble();
        read(average);
    }
}
