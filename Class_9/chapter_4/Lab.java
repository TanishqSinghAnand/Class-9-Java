package Class_9.chapter_4;
import java.util.*;

public class Lab {
    static void read(double one, double two, double three, double four){
        // double sum_first = one + two;
        // double sum_second = three + four;

        // String c = (sum_first == sum_second) ? "Equal" : "Unequal";
        String c = ((one+two) == (three+four)) ? "Equal" : "Unequal";

        System.out.println(c);
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int one = sc.nextInt();
        
        System.out.println("Enter 2nd number : ");
        int two = sc.nextInt();

        System.out.println("Enter 3rd number : ");
        int three = sc.nextInt();

        System.out.println("Enter 4th number : ");
        int four = sc.nextInt();

        read(one,two,three,four);
        sc.close();
    }
}
