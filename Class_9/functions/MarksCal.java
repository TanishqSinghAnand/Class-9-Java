package Class_9.functions;
import java.util.*;
import java.net.InetAddress;
public class MarksCal {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total subjects");
        int totalSub = sc.nextInt();
        System.out.println("Enter Total subjects from which u want percent");
        int NoOfPercentageSubjects;
        NoOfPercentageSubjects = sc.nextInt();
        while (NoOfPercentageSubjects > totalSub) {
            System.out.println("No. of subjects cant be bigger than the total subjects");
            System.out.println("Enter it again");
            NoOfPercentageSubjects = sc.nextInt();
        }
        System.out.println("Enter total no. of marks of each subject");
        double totalMarks = sc.nextDouble();
        double marks[] = new double[totalSub];
        for (int i = 1; i <= totalSub; i++) {
            System.out.println("Enter marks for " + i + " subject");
            double tempSubMarks = sc.nextDouble();
            while (tempSubMarks > totalMarks) {
                System.out.println("Marks cant be greater than the total marks \n Enter marks again");
                tempSubMarks = sc.nextDouble();
            }
            marks[i - 1] = tempSubMarks;
        }
        MaxFromArray obj = new MaxFromArray();
        double maxMarksArray[] = obj.max(NoOfPercentageSubjects, marks);
        double totalMarksGained = 0;
        for (int i = 0; i < maxMarksArray.length; i++) {
            totalMarksGained += maxMarksArray[i];
        }
        double percent = (totalMarksGained / (NoOfPercentageSubjects * totalMarks)) * 100;
        System.out.println("Total = " + Math.floor(percent) + " %");
        sc.close();
    }
}
