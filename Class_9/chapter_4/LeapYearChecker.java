package Class_9.chapter_4;
import java.util.Calendar;

public class LeapYearChecker {
    static void fun() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int c = 0;
        while (c<100){
            if(year % 4 == 0){
                System.out.println(year + " is a leap Year");
                c++;
            }
            year ++;
        }
    }

    public static void main(String args[]) {
        fun();
    }
}
