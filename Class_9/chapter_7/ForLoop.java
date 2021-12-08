package Class_9.chapter_7;

public class ForLoop {
    static void even() {
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }
    }

    static void odd() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
    }

    static void natural() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    static void square() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "\u00B2 = " + Math.pow(i, 2));
        }
    }

    public static void main(String[] args) {
        square();
    }
}
