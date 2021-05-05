package Class_9.chapter_2;

public class Reverse_Array
{
    static void reverse(int a[], int n)
    {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
  
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }
  
    public static void main(String[] args)
    {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        reverse(arr, arr.length);
    }
}
