package Class_9.chapter_4;

import java.util.*;

public class MarksCal {
    // Output grade
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Inpunt no. of subjects
        System.out.println("Enter no. of subjects");
        int n = sc.nextInt();
        // Input max marks
        System.out.println("Enter max marks");
        int max = sc.nextInt();
        // Input marks of each subject'
        double[] marks = new double[n];
        double[] percent = new double[n];
        double totalMarks =0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks from subject " + i);
            marks[i - 1] = sc.nextDouble();
            double tempPercent = i/max*100;
            percent[i-1] = tempPercent;
            totalMarks += marks[i-1];
        }
        // Output total marks
        System.out.println("Total Marks = " + totalMarks);
        Arrays.sort(marks);
        // Output percentage
        double percentage = totalMarks/(n*max)*100;
        System.out.println("Percentage = " + percentage + "%");
        char grade;
        if(percentage < 33){
            grade = 'f';
        }
        else if (percentage >= 33 && percentage < 50) {
            grade = 'c';
        } else if (percentage >= 50 && percentage < 70) {
            grade = 'b';
        } else if (percentage >= 70 && percentage < 85) {
            grade = 'c';
        } else if (percentage >= 85 && percentage < 100) {
            grade = 'c';
        }
        System.out.println("Array : " + Arrays.toString(marks));
        sc.close();
    }
}
