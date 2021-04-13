package Class_9;


import java.util.Random;
public class MathFunction
{
    void main(){
            int num1 =4 ,  num2 = 7;
        System.out.println(Math.max(num1,num2));
        System.out.println(Math.min(num1,num2));
        System.out.println(Math.sqrt(900));
        System.out.println(Math.abs(-5));
        System.out.println(Math.abs(5));
        System.out.println(4+(8-4) * Math.random());
        System.out.println(4+(8-4) * Math.random());
        System.out.println(4+(8-4) * Math.random());
        System.out.println(4+(8-4) * Math.random());
        System.out.println(4+(8-4) * Math.random());
        Random rand = new Random();
        int n = rand.nextInt(50);
        System.out.println(n);
        int min = 500;
        int max = 40000;
        System.out.println(Math.floor(Math.random()*(max-min+1)+min));
    }
}
