// TODO : Practise excersise 8

package Class_9.chapter_7;

import java.util.*;

public class PractiseExcersise1 {
    static void first() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "\u00B3 = " + Math.pow(i, 3));
        }
    }

    static void second() {
        for (int i = 10; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    static Scanner sc = new Scanner(System.in);

    static void third() {
        System.out.println("Enter that no. till which you need the odd numbers");
        int max = sc.nextInt();

        for (int i = 0; i <= max; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }

    static void four() {
        System.out.println("Enter that no. till which you need the even numbers");
        int max = sc.nextInt();
        int count = 0;

        for (int i = 0; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
                count++;
            }
        }
        System.out.println("\nTotal even numbers = " + count);
    }

    static void five() {
        System.out.println("Enter number : ");
        int max = sc.nextInt();
        for (int i = max; i >= 0; i--) {
            System.out.print(i + ", ");
        }
    }

    static void six() {
        int smallest = Integer.MAX_VALUE;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i + " : ");
            int num = sc.nextInt();
            if (num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest number = " + smallest);
    }

    static void SOrting() {
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter the number " + i);
            numbers[i] = sc.nextInt();
        }

        Arrays.sort(numbers);

        int[] tempArray = new int[3];
        System.out.println("Temp Array = " + Arrays.toString(tempArray));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i=" + i);
            tempArray[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println("Normal = " + Arrays.toString(numbers));
        System.out.println("Reversed = " + Arrays.toString(tempArray));

    }

    static void seven() {
        double sum = 0;
        int i ;
        for (i = 1; i <= 5; i++) {
            System.out.println("Enter Marks of subject " + i + " : ");
            sum += sc.nextDouble();
        }
        System.out.println("I = "+i);
        double average = sum / 5;
        System.out.println("Average = " + average);
    }

    static void eight() {
        double count = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }
        System.out.println("Total of " + count + " numbers divisible by 5 in range 1-1000");
    }

    public static void main(String[] args) {
        seven();
    }
}


