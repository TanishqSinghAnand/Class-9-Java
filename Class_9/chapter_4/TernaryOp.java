package Class_9.chapter_4;

import java.util.*;

public class TernaryOp {
    static void fun(int a, int b){
        int c = a>b ? b : a;
        System.out.println("Smaller no. is " + c);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int num1 = sc.nextInt();

        System.out.println("Enter b : ");
        int num2 = sc.nextInt();
        fun(num1, num2);
        sc.close();
    }
}
