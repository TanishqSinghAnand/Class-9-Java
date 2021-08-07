package Class_9.chapter_4;

import java.util.*;


public class Arethmetic
{
    static void fun(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter : ");
        int num1 = sc.nextInt();  

        System.out.println("Enter : ");
        int num2 = sc.nextInt();  

        System.out.println("Enter : ");
        char operator = sc.next().charAt(0);  

        double result = 0;
        boolean changes = false;

        if (operator == '-' ){
            result = num1 - num2;
            changes = true;
        }
        else if(operator == '+'){
            result = num1 + num2;
            changes = true;
        }
        else if (operator == '/' || operator == '÷'){
            result = num1 / num2;
            changes = true;
        }
        else if(operator == '*' || operator == '×' || operator == 'x' || operator =='X'){
            result = num1 * num2;
            changes = true;
        }
        else{
            System.out.println("Invalid operator");
        }
        if(changes == true){
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
        sc.close();
    }
    
    
    public static void main(String args[]){
     fun();
    }
}
