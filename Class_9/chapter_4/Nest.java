package Class_9.chapter_4;

import java.util.*;
public class Nest
{
    String grade;
    void tsa(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        double marks = sc.nextInt();
        if( marks>=40){
            if(marks >=95)
            grade = "Excellent";
            else if(marks >=80)
            grade = "Very good";
            else if(marks >=40)
            grade = "good";
        }
        else{
            grade = "Well tried";
        }
        System.out.println(grade);
        sc.close();
        
    }
}
