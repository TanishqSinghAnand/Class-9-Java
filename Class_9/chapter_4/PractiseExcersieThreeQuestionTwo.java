package Class_9.chapter_4;

import java.util.*;

public class PractiseExcersieThreeQuestionTwo {
    static String trianleTypeString(double sideOne, double sideTwo, double sideThree) {
        if (sideOne == sideThree && sideOne == sideTwo) {
            return "Eqilateral";
        } else if (sideOne == sideTwo || sideTwo == sideThree || sideThree == sideOne) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
    
    static void trianleType(double sideOne, double sideTwo, double sideThree) {
        if (sideOne == sideThree && sideOne == sideTwo) {
            System.out.println("Eqilateral");
        } else if (sideOne == sideTwo || sideTwo == sideThree || sideThree == sideOne) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side one : ");
        int sideOne = sc.nextInt();
        System.out.println("Enter side two : ");
        int sideTwo = sc.nextInt();
        System.out.println("Enter side three : ");
        int sideThree = sc.nextInt();
        System.out.println("Returning String ->>>");
        String TriangleType = trianleTypeString(sideOne,sideTwo,sideThree);
        System.out.println("This Triangle is : " + TriangleType);
        sc.close();
        System.out.println("Void Function");
        trianleType(sideOne, sideTwo, sideThree);
    }
}
