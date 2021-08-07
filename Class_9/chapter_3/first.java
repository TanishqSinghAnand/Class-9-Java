package Class_9.chapter_3;
import java.util.*;
public class first
{   
    void read(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Name :");
        String name = sc.nextLine();
        
        //sc = new Scanner(System.in);
        System.out.println("Enter your Class :");
        int student_class = sc.nextInt();
        
        //sc = new Scanner(System.in);
        System.out.println("Enter your Percentage :");
        double percentage = sc.nextDouble();
        
        System.out.println("Name : " + name + " , Class : " + student_class + " , Percentage : " + percentage);
    }
}
