package Class_9;

public class CH_1_Practice_4 {
    void cube(double s) {
        double vol = Math.pow(s, 3);
        System.out.println("Volume of Cube of Side : " + s + " is : " + vol);

    }

    void cuboid(double l, double b, double h) {
        if ((l == b) && (l == h)) {
            System.out.println("This is a cube not a cuboid");
            cube(l);
        } else {
            double vol = l * b * h;
            System.out.println(
                    "Volume of Cuboid with lenght " + l + " , breadth " + b + " and height " + h + " is " + vol);
        }
    }

    void cylinder(double r, double h) {
        double vol = 22 / 7 * r * h;
        System.out.println("Volume of a cylinder with radius " + r + " and height " + h + " , the volume is " + vol);
    }
}
