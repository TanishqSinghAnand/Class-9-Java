package Class_9.chapter_4;

import java.util.*;

public class SwichCaseEx10 {
    static void fun(int month) {
        switch (month) {
            case 1:
            case 3:
            case 7:
            case 5:
            case 8:
            case 10:
            case 12:
                System.out.println("31 Days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 Days");
                break;
            case 2:
                System.out.println("28");
                break;
            default:
                System.out.println("Invalid Month");
                break;

        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month :");
        int month = sc.nextInt();
        fun(month);
        sc.close();
    }
}