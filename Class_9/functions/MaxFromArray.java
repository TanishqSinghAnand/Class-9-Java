package Class_9.functions;

import java.util.Arrays;

public class MaxFromArray {
    public double[] max(int NoOfElementsToFind, double[] marks) {
        double max[] = new double[NoOfElementsToFind];
        double maxM = 0;
        int index;
        for (int j = 0; j < NoOfElementsToFind; j++) {
            maxM = marks[0];
            index = 0;
            for (int i = 1; i < marks.length; i++) {
                if (maxM < marks[i]) {
                    maxM = marks[i];
                    index = i;
                }
            }
            max[j] = maxM;
            marks[index] = Integer.MIN_VALUE;
        }
        return max;
    }
    
    static double[] min(int NoOfElementsToFind, double[] marks) {
        double min[] = new double[NoOfElementsToFind];
        double minM = 0;
        int index;
        for (int j = 0; j < NoOfElementsToFind; j++) {
            minM = marks[0];
            index = 0;
            for (int i = 1; i < marks.length; i++) {
                if (minM > marks[i]) {
                    minM = marks[i];
                    index = i;
                }
            }
            min[j] = minM;
            marks[index] = Integer.MAX_VALUE;
        }
        return min;
    }

    public static void main(String args[]){
        double maxA[] = {0,1,2,3,4,5,6,4,7,8,5,3,9,4};
        double minA[] = min(5,maxA);
        System.out.println(Arrays.toString(minA));

    }
}
