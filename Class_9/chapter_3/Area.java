package Class_9.chapter_3;

import java.util.*;

public class Area
{
    void circle(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius :");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area : " + area);
    }
}
