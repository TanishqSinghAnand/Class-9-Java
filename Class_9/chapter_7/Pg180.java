package Class_9.chapter_7;

public class Pg180 {
    static void OneTwoThree(int total) {
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

    static void OneTwoTwo(int total) {
        for (int i = 1; i <= total; i++) {
            for (int x = 0; x < total - i; x++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
        }
    }

    static void AAA(int total) {
        for (int i = 1; i <= total; i++) {
            for (int x = 0; x < total - i; x++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("a ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        System.out.println("123");
        OneTwoThree(3);
        System.out.println("122333");
        OneTwoTwo(3);
        System.out.println("aaa");
        AAA(3);
    }
}
