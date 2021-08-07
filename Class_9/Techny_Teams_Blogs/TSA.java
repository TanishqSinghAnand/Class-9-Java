package Class_9.Techny_Teams_Blogs;
// Importing everything from Java.util
import java.util.*;

public class TSA
{
    public static void main(String args[])
    {
        // Creating a Scanner
        Scanner sc = new Scanner(System.in);
        // Taking radius input from the user
        System.out.println("Enter Radius ");
        int r = sc.nextInt();
        // Calculating area
        double area = 3.14*r*r;
        System.out.println("Area = "+ area);
    }
}
