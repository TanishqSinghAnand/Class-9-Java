package Class_9.chapter_4;
import java.util.*; 
public class PractiseExcersieThreeQuestionFour {
    static void day(double dayNum){
        if (dayNum == 1) {
            System.out.println("Monday");
        }
        else if (dayNum == 1) {
            System.out.println("Tuesday");
        }
        else if (dayNum == 3) {
            System.out.println("Wednesday");
        }
        else if (dayNum == 4) {
            System.out.println("Thrusday");
        }
        else if (dayNum == 5) {
            System.out.println("Friday");
        }
        else if (dayNum == 6) {
            System.out.println("Saturday");
        }
        else if (dayNum == 7) {
            System.out.println("Sunday");
        }
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number: ");
        int dayNum = sc.nextInt();
        day(dayNum);
        sc.close();
    }
}
