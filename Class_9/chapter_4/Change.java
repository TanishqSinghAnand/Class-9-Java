package Class_9.chapter_4;
import java.util.*;

public class Change {
    static void fun(double marks){
        String remarks = marks > 90 ? "Excellent" : "Good";
        System.out.println("Remarks = " + remarks);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter : ");
        double num1 = sc.nextDouble();
     fun(num1);
     sc.close();
    }
}
