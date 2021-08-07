package Class_9.chapter_4;

import java.util.*;
public class Absolute
{
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = sc.nextInt();
        
        if(num1 > 0){
            System.out.println(num1 + " It is a positive no. ");
        }
        else if(num1 < 0){
            System.out.println(num1 + " Is a negative no.  " );
        }
        else if(num1 == 0){
            System.out.println(num1 + " Is equal to 0" );
        }
    }
}
