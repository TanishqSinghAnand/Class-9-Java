package Class_9.chapter_7;

import java.util.Scanner;


public class ClassAssignment1Dec {
    static void first(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++){
            int result = num*i;
            System.out.println(num + "*"+i +" = " + result);
        }
    }

    static void second(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num1 = sc.nextInt();
        double sum_odd = 0;
        double sum_even = 0;
        for(int i=1;i<=num1;i++){
            if(i%2==0){
                sum_even = sum_even + i;
            }
            else{
                sum_odd = sum_odd + i;
            }
        }
        System.out.println("ODD sum = " + sum_odd);
        System.out.println("Even sum = " + sum_even);
    }

    static void third(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sumber : ");
        int num1 = sc.nextInt();

        for(int i = 0; i <=20;i++){
            int result = num1*i;
            System.out.println(num1 + "*"+i +" = " + result);
        }
    }
    public static void main(String[] args) {
        third();
    }
}
