package Class_9.chapter_7;
import java.util.*;

public class PE9 {
    static Scanner sc = new Scanner(System.in);
    static void first(){
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        double sum = 0;
        int num = 2;
        for(int i =1; i <=n;i++){
            sum += num*i;
        }
        System.out.println("Sum = " + sum);

    }

    static void second(){
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        double sum = 0;
        int num = 1;
        for(int i =1; i <=n;i++){
            sum += num*i;
        }
        System.out.println("Sum = " + sum);
    }

    static void third(){
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        double sum = 0;
        int num = 5;
        for (int i = 1; i <= n; i++) {
            sum += num;
            num+=5;
        }
        System.out.println("Sum = " + sum);
    }

    static void fourth() {
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        double sum = 0;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(num, 2);
            num++;
        }
        System.out.println("Sum = " + sum);
    }

    static void fifth() {
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        double sum = 0;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(num, 3);
            num++;
        }
        System.out.println("Sum = " + sum);
    }

    static void sixth() {
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2) - 1;
        }
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        sixth();
    }
}
