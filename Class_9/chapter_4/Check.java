package Class_9.chapter_4;

import java.util.*;
public class Check
{
    void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no.");
        int int1 = sc.nextInt();
        System.out.println("Enter 2nd no.");
        int int2 = sc.nextInt();
        if(int1 > int2){
            System.out.println(int1 + " Is greater than " + int2);
        }
        else if(int2 > int1){
            System.out.println(int2 + " Is greater than " + int1);
        }
        else if(int1 == int2){
            System.out.println(int1 + " Is equal to " + int2);
        }
    }
}
