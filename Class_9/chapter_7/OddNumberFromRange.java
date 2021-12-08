package Class_9.chapter_7;

import java.util.*;

public class OddNumberFromRange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter that starting number of range");
        int st = sc.nextInt();
        System.out.println("Enter that ending number of range");
        int end = sc.nextInt();
        int count = 0;

        if (end < st) {
            System.out.println("Ending of the range cant be less than the start. Re-enter please");
            System.out.println("Enter that starting number of range");
            st = sc.nextInt();
            System.out.println("Enter that ending number of range");
            end = sc.nextInt();
        }
        for(int i = st; i<end ; i++){
            if(i%2!=0){
                System.out.print(i+", ");
                count++ ;
            }
        }
        System.out.println("\nTotal odd numbers = " + count);
        sc.close();
    }
}
