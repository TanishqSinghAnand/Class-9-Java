package Class_9.chapter_4;

import java.util.*;
class Dublob
    {
        void read()
        {
        Scanner s1= new Scanner(System.in);
        System.out.println("Enter kilometers");
        int a= s1.nextInt();
        int b = 0;
        if(a<=19)
        {
            b=100;
        }
        else if(a>=20 && a<=50)
        {
            b=500;
        }
        else if(a>=51 && a<=80)
        {
            b=700;
        }
        else if(a>=81 && a<=100)
        {
            b=1000;
        }
        else if(a>=101 && a<=500)
        {
            b=1500;
        }
        else if(a>=501)
        {
            b=2000;
        }
        System.out.println("Fare = " + b);
    }
}
