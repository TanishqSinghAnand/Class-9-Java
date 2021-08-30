// package

import java.util.*;

public class Lab_Excersise_q_two {
    static void accept(int num1, int num2){
        if(num1 == num2){
            System.out.println("Equal");
        }
        else{
            System.out.println("Unequal");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        accept(a,b);
        sc.close();
    }
}