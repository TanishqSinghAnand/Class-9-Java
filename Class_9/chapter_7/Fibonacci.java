package Class_9.chapter_7;

public class Fibonacci {
    static void read(int n) {
        int perv = 0;
        int next = 1;
        int fib;
        System.out.println(perv + " " + next);
        int i = 3;
        while (i <= n) {
            fib = perv + next;
            System.out.println(fib);
            perv = next;
            next = fib;
            i++;
        }
    }
    public static void main(String[] args) {
        read(9);
    }
}
