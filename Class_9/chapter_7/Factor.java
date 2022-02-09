package Class_9.chapter_7;

public class Factor {
    static void Eg39(int num) {
        double sum = 0, factor = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                factor *= j;
                System.out.println("I = " + i + " J = " + j + " factor = " + factor);
            }
            sum = (double) i / (double) factor;
        }
        System.out.println(sum);
    }

    public static void main(String args[]) {
        Eg39(3);
    }
}
