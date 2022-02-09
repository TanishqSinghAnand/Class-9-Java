package Class_9.chapter_7;

import java.util.Scanner;

public class PE3 {
    static void first(int n) {
        int orignal = n;
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        if (rev == orignal) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    static void second(int n) {
        int orignal = n;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, 3);
            n = n / 10;
        }
        if (sum == orignal) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");

        }
    }

    static void third(int n) {
        double orignal = n;
        double sum = 0;
        double product = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            product *= d;
            n = n / 10;
        }
        double total = sum + product;
        if (total == orignal) {
            System.out.println("Special 2 digit number");
        } else {
            System.out.println("Not a special 2 digit number");
        }
    }

    static void fourth() {
        Scanner sc = new Scanner(System.in);

        double pSum = 0;
        double nSum = 0;

        while (true) {
            System.out.println("Enter : ");
            int num = sc.nextInt();
            if (num == -1) {
                System.out.println("Positive Sum = " + pSum);
                System.out.println("Negative Sum = " + nSum);
                System.exit(0);
            } else if (num > 0) {
                pSum += num;
            } else if (num < 0) {
                nSum += num;
            }
        }
    }

    static void fifth(){
        Scanner sc = new Scanner(System.in);

        double pSum = 0;
        double nSum = 0;

        while (true) {
            System.out.println("Enter : ");
            int num = sc.nextInt();
            if (num == -999) {
                System.out.println("Positive Sum = " + pSum);
                System.out.println("Negative Sum = " + nSum);
                System.exit(0);
            } else if (num > 0) {
                pSum += num;
            } else if (num < 0) {
                nSum += num;
            }
        }
    }

    static void sixth(){
        Scanner sc = new Scanner(System.in);

        double pCount = 0;
        double nCount = 0;

        while (true) {
            System.out.println("Enter : ");
            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("Positive Count = " + pCount);
                System.out.println("Negative Count = " + nCount);
                System.exit(0);
            } else if (num > 0) {
                pCount += 1;
            } else if (num < 0) {
                nCount += 1;
            }
        }
    }

    public static void main(String[] args) {
        fifth();
    }
}