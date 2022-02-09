package Class_9.finals_practise;

import java.util.*;

public class TwentyFirst {
    void read() {
        Scanner sc = new Scanner(System.in);

        int input = 0, smaller = Integer.MAX_VALUE;
        for (int num = 1; num <= 10; num++) {
            System.out.println("Enter number :");
            input = sc.nextInt();
            if (input < smaller) {
                smaller = input;
            }
        }
        System.out.println("Smallest = " + smaller);
    }
}


