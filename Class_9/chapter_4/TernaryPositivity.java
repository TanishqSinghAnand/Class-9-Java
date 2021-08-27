package Class_9.chapter_4;

import java.util.*;

public class TernaryPositivity {
    static void change(int a) {
        int c = a < 0 ? Math.abs(a) : a;
        System.out.println("A is " + c);
    }

    static void pos(int a){
        String c = a < 0 ? "Negative" : "Positive";
        System.out.println(a + " is : " + c);
    }

    static void dhruvAkaDublob(){
        int a = 5 ;
        int b = 6;
        int c;

        c = a>b ? 1 : 0;

        if (c ==1){
            System.out.println(c);
        }

        if (a > b) {
            c = 1;
        } else {
            c = 0;
        }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int num1 = sc.nextInt();

        change(num1);
        sc.close();
    }
}
