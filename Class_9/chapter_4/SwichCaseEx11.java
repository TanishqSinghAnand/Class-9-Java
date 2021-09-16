package Class_9.chapter_4;
import java.util.*;
public class SwichCaseEx11 {
    static void fun(int d) {
        switch (d) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                // break;
            case 4:
                System.out.println("Thrusday");
                // break;
            case 5:
                System.out.println("Friday");
                // break;
            case 6:
                System.out.println("Saturday");
                // break;
            case 7:
                System.out.println("Sunday");
                // break;

            default:
                break;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day : ");
        int d = sc.nextInt();
        fun(d);
        sc.close();
    }
}
