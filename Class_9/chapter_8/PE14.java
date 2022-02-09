package Class_9.chapter_8;

import java.util.Scanner;

public class PE14 {
    static Scanner sc = new Scanner(System.in);

    static void first(){
        System.out.println("Respect your elders".startsWith("yours"));
    }

    static void second(){
        System.out.println("Respect your elders".endsWith("elders"));
    }

    static void third(){
        System.out.println("Strings are easy to print".startsWith("Strings"));
    }

    static void fourth(){
        String x = "Strings are easy to access";
        String y = "access";
        boolean b = x.endsWith(y);
        System.out.println(b);
    }

    static void fifth(){
        System.out.println("Language is important to express ideas".startsWith("L"));
    }

    public static void main(String args[]){
        fifth();
    }
}