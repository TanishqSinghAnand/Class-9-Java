package Class_9.chapter_2;


import java.util.*;
public class TTSA
{
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A ");
        int a = sc.nextInt();
        System.out.println("Enter value of B ");
        int b = sc.nextInt();
        if(a!=b)
            System.out.println("A & B are not equal");
        else if(b==a)
            System.out.println("A & B are equal");
    }
}
