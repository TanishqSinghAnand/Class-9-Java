package Class_9.chapter_8;

import java.util.Scanner;

public class PE15 {
    static Scanner sc = new Scanner(System.in);

    static void first() {
        String day = "August 15 is an independence day";
        day = day.replace("August", "January");
        day = day.replace("15", "26");
        day = day.replace("independence", "republic");
        day = day.replace("a", "an");
        System.out.println(day);
    }

    static void second() {
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        str = str.replace(" is", " was");
        System.out.println(str);
    }

    static void third() {
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        str = str.replace('c', 'k');
        System.out.println(str);
    }

    public static void main(String[] args) {
        third();
    }
}