package Class_9.chapter_4;

import java.util.*;

public class Lab_Excersise_q_one {
    static void accept(int sales) {
        int commision = 0;
        if (sales < 1000) {
            commision = 0;
        } else if (sales >= 1000 && sales <= 3000) {
            commision = 100;
        } else if (sales >= 3001 && sales <= 5000) {
            commision = 300;
        } else if (sales >= 5001 && sales <= 10000) {
            commision = 500;
        } else if (sales >= 10000) {
            commision = 1000;
        }
        System.out.println("Commision = " + commision);
    }

    void dublob() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sales ");
        int sales = sc.nextInt();
        int commision = 0;
        if (sales < 1000) {
            commision = 0;
        } else if (sales >= 1000 && sales <= 3000) {
            commision = 100;
        } else if (sales >= 3001 && sales <= 5000) {
            commision = 300;
        } else if (sales >= 5001 && sales <= 10000) {
            commision = 500;
        } else if (sales >= 10000) {
            commision = 1000;
        }
        System.out.println("Commision = " + commision);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sales ");
        int a = sc.nextInt();
        accept(a);
        sc.close();

        // double a = -6.35;
        // double b = 14.74;
        // double x = Math.abs(Math.ceil(a));
        // double y = Math.ceil(3.4) + Math.pow(2,3);
        // System.out.println("Commision = " + Math.floor(-4.7));
        // System.out.println("Commision = " + y);

    }
}
