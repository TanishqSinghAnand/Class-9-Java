package Class_9.chapter_8;

import java.util.Scanner;

public class PE16 {
    static Scanner sc = new Scanner(System.in);

    static void first() {
        System.out.println("Enter String : ");
        String str = sc.nextLine();

        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
        }
    }

    static void second() {
        String g = "try";
        char[] charArr = g.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
        }
    }

    static void third() {
        char[] b = "xyz".toCharArray();
        for(int i =0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }

    public static void main(String[] args) {
        third();

    }
}
