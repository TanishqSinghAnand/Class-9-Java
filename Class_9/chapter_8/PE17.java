package Class_9.chapter_8;

import java.util.Scanner;

public class PE17 {
    static Scanner sc = new Scanner(System.in);
    static void first(){
        System.out.println("Enter first String: ");
        String first = sc.nextLine();
        System.out.println("Enter second String: ");
        String second = sc.nextLine();
        System.out.println(first.concat(second));
    }

    static void second() {
        System.out.println("Hello".concat(", How are you?"));
    }

    static void third() {
        System.out.println("Hands on ".concat("Exercise"));
    }

    public static void main(String[] args) {
        third();
    }
}
