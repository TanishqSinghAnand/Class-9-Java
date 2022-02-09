package Class_9.chapter_7;

public class Triangle {
    static void rightAngledTriangle(int total) {
        for (int i = 1; i <= total; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    static void equilateralTriangle(int total) {
        for (int i = 1; i <= total; i++) {
            for (int x = 0; x < total - i; x++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        equilateralTriangle(5);
    }
}
