package Class_9.chapter_4;

public class MathClass
{
    static void math(){
        double x = 16;
        double y = 27;
        // double z = 16;

        System.out.println("Max of x and y is : " + Math.max(x,y));

        System.out.println("Min of x and y is : " + Math.min(x,y));

        System.out.println("Square root of x is : " + Math.sqrt(x));

        System.out.println("Cube root of x is : " + Math.cbrt(y));

        System.out.println("x raise to the power y is : " + Math.pow(x,y));
        
        System.out.println("");
        System.out.println(Math.random());
    }
    public static void main(String[] args) {
        math();
    }
}
