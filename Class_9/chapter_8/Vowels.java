package Class_9.chapter_8;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String line = sc.nextLine();
        int vowelCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.toLowerCase().charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o'
                    || line.charAt(i) == 'u' || line.charAt(i) == 'A' || line.charAt(i) == 'E'
                    || line.charAt(i) == 'I' || line.charAt(i) == 'U' || line.charAt(i) == 'O') {
                        vowelCount++;
            }
        }
        System.out.println("Number of vowels = " + vowelCount);
        sc.close();
    }
}
