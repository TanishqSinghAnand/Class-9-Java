package Class_9.chapter_3;

import java.util.*;

public class Area
{
    void circle(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius :");
        var radius = sc.nextDouble();
        var area = 3.14 * radius * radius;
        System.out.println("Area : " + area);
    }
}
