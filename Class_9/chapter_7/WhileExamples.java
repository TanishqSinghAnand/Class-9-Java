package Class_9.chapter_7;

public class WhileExamples {
    static void Eg10(int n) {
        while (n > 0) {
            int d = n % 10;
            System.out.println(d);
            n = n / 10;
        }
    }

    
    static void Eg11(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println("Count : " + count);
    }
    
    static void Eg12(int n) {
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
    static void Eg13(int n) {
        double sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            n /= 10;
        }
        System.out.println("Sum : " + sum);
    }
    
    static void Eg14(int n) {
        while (n > 0) {
            int d = n % 10;
            System.out.print(d);
            n = n / 10;
        }
    }

    static void Eg15(int n) {
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

    static void Eg16(){
        
    }

}
