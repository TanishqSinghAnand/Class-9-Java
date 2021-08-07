package Class_9.chapter_4;

public class eg1 {
    static void vals(int a, int b) {
        System.out.println("Values before swap : " + a + "," + b);
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
        }
        System.out.println("Values after swap : " + a + "," + b);

    }

    static void val(int a, int b) {
        System.out.println("Values before swap : " + a + "," + b);
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("Values after swap : " + a + "," + b);

    }
    public static void main(String args[]) {
        val(5, 1);
        vals(5, 1);
    }
}
