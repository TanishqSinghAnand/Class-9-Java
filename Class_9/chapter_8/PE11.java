package Class_9.chapter_8;

import java.util.Scanner;

public class PE11 {
    static Scanner sc = new Scanner(System.in);

    static void first() {
        System.out.println("Enter string 1");
        String f = sc.nextLine();
        System.out.println("Enter string 2");
        String s = sc.nextLine();

        if (f.compareTo(s) == 0) {
            System.out.println(f + " is equal to " + s);
        } else {
            System.out.println(f + " is not equal to " + s);
        }
    }

    static void second() {
        System.out.println("Enter string 1");
        String f = sc.nextLine();
        System.out.println("Enter string 2");
        String s = sc.nextLine();

        if (f.compareTo(s) < 0) {
            System.out.println(f + " is smaller.");
        } else if (f.compareTo(s) > 0) {
            System.out.println(s + " is smaller.");
        } else {
            System.out.println(f + " is equal to " + s);
        }

    }

    public static void main(String[] args) {
        second();
        sc.close();
    }
}
