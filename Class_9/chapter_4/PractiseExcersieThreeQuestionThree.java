package Class_9.chapter_4;

import java.util.*;

public class PractiseExcersieThreeQuestionThree {
    static void commision(double sales){
        double commision = 0;
        if(sales >= 0 && sales <= 1000){
            commision = 0 * sales;
        }
        else if (sales >= 1001 && sales <= 5000) {
            commision = 0.05 * sales;
        }
        else if (sales >= 5001 && sales <= 10000) {
            commision = 0.10 * sales;
        }
        else if (sales >= 10001) {
            commision = 0.20 * sales;
        }
        else if(sales < 0){
            System.out.println("Sales cant be negative mf");
        }
        System.out.println("Commision = "  + commision);
    }

    void dublob(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales : ");
        int sales = sc.nextInt();
        double commision = 0;
        if (sales >= 0 && sales <= 1000) {
            commision = 0 * sales;
        } else if (sales >= 1001 && sales <= 5000) {
            commision = 0.05 * sales;
        } else if (sales >= 5001 && sales <= 10000) {
            commision = 0.10 * sales;
        } else if (sales >= 10001) {
            commision = 0.20 * sales;
        } else if (sales < 0) {
            System.out.println("Sales cant be negative mf");
        }
        System.out.println("Commision = " + commision);
        sc.close();
    }
    
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter sales : ");
     int sales = sc.nextInt();
     commision(sales);
     sc.close();
    }
}
