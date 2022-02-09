package Class_9.chapter_8;

import java.util.*;

public class PE2 {
    static Scanner sc = new Scanner(System.in);

    static void first() {
        System.out.println("Enter String : ");
        String inp = sc.nextLine();
        System.out.println(inp.charAt(3));

    }

    static void second() {
        System.out.println("Enter string : ");
        String inp = sc.nextLine();
        System.out.println("Lenght : " + inp.length());
        System.out.println("chat at 2 : " + inp.charAt(1));
    }

    static void third() {
        System.out.println("Enter string : ");
        String inp = sc.nextLine();
        System.out.println("First Letter : " + inp.charAt(0));
        System.out.println("Last Letter : " + inp.charAt(inp.length() - 1));
    }

    static void fourth() {
        System.out.println("Enter string : ");
        String inp = sc.nextLine();
        int count = 0;
        if (inp.trim().length() > 0) {
            count = 1;
        }
        inp = inp.trim();
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == 32) {
                count++;
            }
        }
        System.out.println("No. of words = " + count);
    }

    static void fifth() {
        System.out.println("Enter string : ");
        String inp = sc.nextLine();
        inp = inp.trim();
        System.out.print(inp.charAt(0));
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == 32) {
                System.out.print(inp.charAt(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        fifth();
    }
}
