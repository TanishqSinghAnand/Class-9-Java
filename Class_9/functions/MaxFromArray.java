package Class_9.functions;


public class MaxFromArray {
    public static double[] max(int NoOfElementsToFind, double[] marks) {
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
}
