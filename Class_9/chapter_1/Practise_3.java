package Class_9.chapter_1;

public class Practise_3 {
    double square(double s) {
        double perimeter = 4 * s;
        return perimeter;
    }

    void rect(double l, double b) {
        double perimeter;
        if (l != b) {
            perimeter = 2 * (l + b);
            System.out.println("Perimeter of the rectangle with lenght " + l + " and width " + b + " is " + perimeter);
        } else {
            perimeter = square(l);
            System.out.println("This is a square , with side " + l + " is and perimeter is " + perimeter);
        }
    }
}
