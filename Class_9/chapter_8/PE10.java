package Class_9.chapter_8;

import java.util.Scanner;

public class PE10 {
    static Scanner sc = new Scanner(System.in);

    static void first() {
        System.out.println("Enter nationality");
        String nationality = sc.nextLine();
        if (nationality.equals("Indian")) {
            System.out.println("OP u are Indian");
        } else {
            System.out.println("Not indian :/");
        }
    }

    static void second() {
        System.out.println("Enter mail id : ");
        String mailId = sc.nextLine();
        if (mailId.equals("abc123@gmail.com")) {
            System.out.println("ID matched");
        } else {
            System.out.println("Wrong mail ID");
        }
    }

    static void third() {
        System.out.println("Enter name :");
        String name = sc.nextLine();
        if (name.equalsIgnoreCase("SARVANI")) {
            System.out.println("U are Sarvani");
        } else {
            System.out.println("You are " + name + " not Sarvani");
        }
    }

    static void fourth(){
        System.out.println("bag".equals("bag"));
    }

    public static void main(String[] args) {
        fourth();
    }
}
