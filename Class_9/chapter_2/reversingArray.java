package Class_9.chapter_2;
import java.util.*;
  
public class reversingArray {
  
    /*function reverses the elements of the array*/
    static void reverse(Integer a[])
    {
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
  
    public static void main(String[] args)
    {
        Integer [] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        reverse(arr);
    }
}