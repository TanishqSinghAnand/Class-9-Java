package Class_9.chapter_7;

public class Eg14 {
    static void reverseNumber(int n) {
        while (n > 0) {
            int d = n % 10;
            System.out.print(d);
            n = n / 10;
        }
    }

    public static void main(String[] args) {
        reverseNumber(14568);
    }
}