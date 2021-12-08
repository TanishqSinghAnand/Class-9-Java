package Class_9.chapter_8;
import java.util.*;


public class PE1 {
    static void first(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String f = sc.nextLine();
        System.out.println("Enter String 2 : ");
        String s = sc.nextLine();
        System.out.println("String 1 = " + f + "\n String 2 = " + s);
        sc.close();
    }

    static void second(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String tsa = sc.nextLine();
        System.out.println("Lenght of string = " + tsa.trim().length());
        sc.close();
    }
    
    static void third(){
        // A
        int a = "pen drive".length();
        System.out.println("Part a  = "+a);
        // B
        System.out.println("CD ROM".length());

    }

    public static void main(String[] args) {
        third();
    }
}
