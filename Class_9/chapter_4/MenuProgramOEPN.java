package Class_9.chapter_4;

import java.util.*;

public class MenuProgramOEPN {
    static void read() {
        Scanner s1 = new Scanner(System.in);
        while (true) {
            System.out.println("1 for even or odd; 2 for pos or neg; 0 for exit");

            int choice = s1.nextInt();
            switch (choice) {
                case 1:
                    if (choice == 1) {
                        System.out.println("enter num");
                        double num = s1.nextDouble();
                        if (num > 0) {
                            System.out.println("pos");
                        } else if (num < 0) {
                            System.out.println("neg");
                        }
                    }
                    break;
                case 2:
                    if (choice == 2) {
                        System.out.println("enter num");
                        int num1 = s1.nextInt();
                        if (num1 % 2 == 0) {
                            System.out.println("number is even");
                        } else if (num1 % 2 != 0) {
                            System.out.println("number is odd");
                        }
                    }
                    break;
                case 3:
                    if (choice == 0) {
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("invalid");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter \n 1: Positive and Negative \n 2 : Odd and Even \n 0 : Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter number");
                    double num = sc.nextDouble();
                    if (num > 0) {
                        System.out.println("Positive");
                    } else if (num < 0) {
                        System.out.println("Negative");
                    } else {
                        System.out.println("Zero");
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Enter number");
                    int num1 = sc.nextInt();
                    if (num1 % 2 == 0) {
                        System.out.println("Even");
                    } else if (num1 % 2 != 0) {
                        System.out.println("Odd");
                    } else {
                        System.out.println("Invalid");
                    }
                    System.out.println("\n");
                    break;
                case 0:
                    System.out.println("Thx , exiting the program");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        // read();

    }
}

/*
 * void read() { Scanner s1=new Scanner(System.in); while (true)
 * System.out.println("1 for even or odd 2 for pos or negitive 0 for exit");
 * 
 * int ch=s1.nextInt(); switch(ch) { case 1: if (ch==1){
 * System.out.println("enter num"); double num=s1.nextDouble(); if (num>0){
 * System.out.println("pos"); } else if (num<0){ System.out.println("neg"); } }
 * break; case 2: if (ch==2){ System.out.println("enter num"); int
 * num1=s1.nextInt(); if (num1 % 2==0){ System.out.println("number is even"); }
 * else if(num1 %2 !=0){ System.out.println("number is odd"); } } break; case 3:
 * System.exit (0); break; default: System.out.println("invalid"); } }
 * 
 * 
 * 
 * 
 * 
 * }
 */