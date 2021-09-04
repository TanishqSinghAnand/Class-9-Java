package Class_9.chapter_4;


import java.util.*;
public class PractiseExcersise1
{
    static void first(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd no.");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " Is greater than " + num2);
        }
        else if(num2 > num1){
            System.out.println(num2 + " Is greater than " + num1);
        }
        else if(num1 == num2){
            System.out.println(num1 + " Is equal to " + num2);
        }
        sc.close();

    }
    void second(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        if(num1 % 5 == 0){
            System.out.println(num1 + " is divisible by 0");
            sc.close();
        }
    }
    void third(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd no.");
        int num2 = sc.nextInt();
        if (num1 % num2 == 0) {
            System.out.println(num1 + " Is divisble by " + num2);
        } else {
            System.out.println(num1 + " Is not divisble by " + num2);
        }
        sc.close();

    }
    void forth(){
        System.out.println("4");
    }
    public static void main(String args[]){
        first();
    }
}
