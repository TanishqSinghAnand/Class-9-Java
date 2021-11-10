package Class_9.chapter_4;

import java.util.*;

    public class Test {
        void one() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name : ");
            String name = sc.nextLine();
            System.out.println("Enter Rate : ");
            double rate = sc.nextDouble();
            System.out.println("Enter Quantity : ");
            double quantity = sc.nextDouble();
            double amount = rate * quantity;
            double total = amount + 0.125 * amount;
            System.out.println(name + " = " + total);
        }
    }
