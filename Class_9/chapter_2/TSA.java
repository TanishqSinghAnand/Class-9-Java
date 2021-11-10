package Class_9.chapter_2;


import java.util.*;
public class TSA
{
    public void funlol(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A ");
        int a = sc.nextInt();
        System.out.println("Enter value of B ");
        int b = sc.nextInt();
        if(a<b)
            System.out.println("A is smaller");
        else if(b<a)
            System.out.println("B is smaller");
        else if(b==a)
            System.out.println("A & B are equal");
    }
    void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of A ");
        int a = sc.nextInt();
        System.out.println("Enter value of B ");
        int b = sc.nextInt();
        if(a<b)
            System.out.println("A is smaller");
        else if(b<a)
            System.out.println("B is smaller");
        else if(b==a)
            System.out.println("A & B are equal");
    }
}
