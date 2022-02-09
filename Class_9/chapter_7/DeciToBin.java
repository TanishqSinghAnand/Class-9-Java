package Class_9.chapter_7;

public class DeciToBin {
    static void convert(int n) {
        int deci = 0;
        int count = 0;
        while (n > 0) {
            int d = n % 10;
            deci += d * Math.pow(2, count);
            count++;
            n = n / 10;
        }
        System.out.print(deci);
    }

    public static void main(String[] args) {
        convert(1111110101);
    }
}
