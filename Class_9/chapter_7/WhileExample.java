package Class_9.chapter_7;

public class WhileExample {
    static void reverseNumber(int n) {
        while (n > 0) {
            int d = n % 10;
            System.out.print(d);
            n = n / 10;
        }
    }

    static void sumOfDigits(int n) {
        double sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }
        System.out.println("Sum : " + sum);
    }

    static void digitCount(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        System.out.println("Count : " + count);
    }

    public static void main(String[] args) {
        digitCount(789);
    }
}