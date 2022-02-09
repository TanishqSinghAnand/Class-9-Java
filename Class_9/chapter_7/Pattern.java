package Class_9.chapter_7;

public class Pattern {
    static void oneTwoThree() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j + " ");
            }
        }
    }

    static void oneOneTwo() {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        oneOneTwo();
    }
}
