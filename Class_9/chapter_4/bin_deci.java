package Class_9.chapter_4;

import java.util.Scanner;

class bin_deci {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int binary, a, i = 0;
        double decimal = 0;
        System.out.println("\nEnter the Binary Number:- ");
        binary = sc.nextInt();
        while (binary != 0)

        {
            a = binary % 10;
            decimal = decimal + a * (Math.pow(2, i));
            binary = binary / 10;
            i++;
        }
        System.out.println("\nDecimal Number = " + decimal);
    }
}