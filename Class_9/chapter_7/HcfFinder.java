package Class_9.chapter_7;

import java.util.Scanner;

public class HcfFinder {
    static void read(){
        double i,a,b,hcf = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of numbers you want to find the hcf");
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();

        double min = a<b ? a : b;
        for(i = 0 ; i <= min; i++){
            if(a%i == 0 && b%i == 0){
                hcf = i;
            }
        

            }
        System.out.println("The HCF of " + a + " and " + b + " is " + hcf);
    }

    public static void main(String[] args) {
        read();
    }
}
