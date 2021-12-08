package Class_9.chapter_7;
import java.util.*;
public class LcmFinder {
    static void read(){
        double i, a, b, hcf, lcm = 0;
        hcf = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to find the lcm");
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();

        double min = a < b ? a : b;
        for (i = 0; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        lcm = (a * b) / hcf;
        System.out.println("The lcm of " + a + " and " + b + " is " + lcm);
        
    }

    public static void main(String[] args) {
        read();
    }
}
