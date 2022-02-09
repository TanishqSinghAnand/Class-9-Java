package Class_9.chapter_8;

import java.util.Scanner;

public class PE13 {
    static Scanner sc = new Scanner(System.in);
    
    static void first(){
        System.out.println("Enter String");
        String st = sc.nextLine();
        System.out.println(st.trim());
    }

    static void second(){
        System.out.println("   Java is a language".trim());
    }

    static void third(){
        String str  = " Platform Independent Language";
        System.out.println(str.trim());
    }

    static void fourth(){
        System.out.println("  Hello".trim().equals("Hello"));
    }

    public static void main(String[] args) {
        fourth();
    }
}
