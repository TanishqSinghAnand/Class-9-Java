package Class_9.chapter_8;

public class Retro1 {
    static void first(double side) {
        double area = side * side;
        System.out.println("Area : " + area);
        double perimeter = 4 * side;
        System.out.println("Perimeter : " + perimeter);
        double diagonal = side * Math.sqrt(2);
        System.out.println("Diagonal : " + diagonal);
    }

    static void second(double p, double r, double t) {
        double si = (p * r * t) / 100;
        double amt = p + si;
        System.out.println("Amount : " + amt);
        System.out.println("SI : " + si);

    }

    static void third(){
        
    }

    public static void main(String[] args) {
        second(2, 6, 3);
    }
}
