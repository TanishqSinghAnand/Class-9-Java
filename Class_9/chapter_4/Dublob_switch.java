package Class_9.chapter_4;

import java.util.*;

public class Dublob_switch {

    public static void main(String args[]) {
        char a = 'a';

        switch (a) {
            case 'a':
            case 'e':
            case 'o':
            case 'u':
            case 'i':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel");
                break;

        }

        switch (a) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a vowel");
                break;

        }
    }
}