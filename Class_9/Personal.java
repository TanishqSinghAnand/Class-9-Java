package Class_9;
import java.util.Scanner;
import java.util.Random;
public class Personal
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name = "Tanishq";
        System.out.println(name);
        int a = 5;
        System.out.println(a);
        float b = 5.3435f;
        System.out.println(b);
        boolean c = true;
        System.out.println(c);
        byte d = 28;
        System.out.println(d);
        double e = 5.556;
        System.out.println(e);
        char f = 'a';
        System.out.println(f);
        int num10 = 3 ;
        num10 %= 2;
        System.out.println(num10);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Age");
        int input = scan.nextInt();
        scan.close();
        System.out.println(input);



        String nameTsa = "Tanishq";
        String channel = "Techny Teams";
        System.out.println(nameTsa);
        double lenghtOfNameTsa = nameTsa.length();
        System.out.println(lenghtOfNameTsa);
        System.out.println(nameTsa.toLowerCase());
        System.out.println(nameTsa.toUpperCase());
        System.out.println("HI  this is a string which is enclosed in two\"");
        System.out.println("This is called escape \\  \n Tanishq");
        System.out.println(nameTsa.contains("Tan"));
        System.out.println(nameTsa.charAt(5));
        System.out.println(nameTsa.endsWith("hq"));
        System.out.println(nameTsa.indexOf("nos"));
        System.out.println(nameTsa.indexOf("nis"));
        System.out.println(nameTsa + " From " + channel);

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
