package Class_9.chapter_4;
import java.util.*;
public class DanglingElseOne {
    static void wrong(double marks) {
        if (marks > 90)
            if (marks <= 100)
                System.out.println("Excellent");
            else
                System.out.println("Good");
    }

    static void correct(double marks) {
        if (marks > 90) {
            if (marks <= 100) {
                System.out.println("Excellent");
            } else {
                System.out.println("Good");
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks ");
        int marks = sc.nextInt();
        System.out.println("Wrong -->>");
        wrong(marks);
        System.out.println("Correc ---->");
        correct(marks);
        sc.close();
    }
}
