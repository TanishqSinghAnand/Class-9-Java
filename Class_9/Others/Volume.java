package Class_9.Others;

// Voulume of cube , cuboid and cylinder
public class Volume
{
    void cube(double side) {
        double volumeCube = Math.pow(side, 3);
        System.out.println("Volume of the cube is = " + volumeCube);
    }

    void cuboid(double l, double h, double b) {
        double volumeCuboid = l * b * h;
        System.out.println("Volume of the cuboid is " + volumeCuboid);
    }
    
    void cylinder(double r , double h){
        double volumeCylinder = 3.14 * r*r * h;
        System.out.println("Volume of the cylinder is " + volumeCylinder);
    }
}
