package Class_9.chapter_8;

import java.util.Scanner;

public class PE12 {
    static Scanner sc = new Scanner(System.in);

    static void first(){
        System.out.println("Enter string : ");
        String st = sc.nextLine();
        System.out.println("Lenght = " + st.length());
        System.out.println("Uppercase = " + st.toUpperCase());
    }
    static void second(){
        System.out.println("Enter string : ");
        String st = sc.nextLine();
        System.out.println("First charecter = " + st.charAt(0));
        System.out.println("Lowercase = " + st.toLowerCase());
    }
    static void third(){
        System.out.println("Hello".toUpperCase());
    }
    static void fourth(){
        String x = "THIS IS A BOOK";
        System.out.println(x.toLowerCase());
    }

    public static void main(String[] args) {
        System.out.println("First");
        first();
        System.out.println("Second");
        second();
        System.out.println("Third");
        third();
        System.out.println("Fourth");
        fourth();
    }
}
