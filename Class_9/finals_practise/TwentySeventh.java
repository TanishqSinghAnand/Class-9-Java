package Class_9.finals_practise;

import java.util.*;

public class TwentySeventh {
    static void six() {
        Scanner sc = new Scanner(System.in);
        int smallest = Integer.MAX_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number ");
            int num = sc.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest number = " + smallest);
    }
    static void crux() {
        for (int i = 0; i <= 20; i = i + 2) { // i = i+2
            System.out.println(i);
        }
    }

    static void seven() {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter Number : ");
            int num = sc.nextInt();
            sum += num;
        }
        double average = sum / 5;
        System.out.println("Average : " + average);
    }

    static void eight(){
        int count = 0;
        for(int i =1; i <=1000;i++){
            if(i%5==0){
                count++;
            }
        }
        System.out.println("Count = " + count);
    }


    public static void main(String[] args) {
        eight();
    }
}
