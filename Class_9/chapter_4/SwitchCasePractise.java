package Class_9.chapter_4;
import java.util.*;
/**
 * hue hue hue
 *
 * @TanishqSinghAnand @1.0.1
 */
public class SwitchCasePractise {
    static void switchCase(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
            case 'C':
                System.out.println("Well Done");
                break;
            case 'E':
                System.out.println("You need to work hard");
            default:
                System.out.println("Invalid grade");
                break;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grade : ");
        char grade = sc.next().charAt(0);;
        switchCase(grade);
        sc.close();
    }
}
