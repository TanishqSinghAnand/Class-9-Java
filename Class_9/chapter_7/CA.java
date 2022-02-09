package Class_9.chapter_7;
import java.util.*;
public class CA {

    static Scanner sc = new Scanner(System.in);

    static void first(){
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        for(int i =1; i<11;i++){
            System.out.println(num*i);
        }
    }

    static void second(){
        System.out.println("Enter no. of numbers you want : ");
        int no = sc.nextInt();
        int sumP = 0;
        int sumN = 0;

        for(int i =0; i <no;i++){
            System.out.println("Enter number : ");
            int temp = sc.nextInt();
            if(temp<0){
                sumN += temp;
            }
            else if(temp>0){
                sumP += temp;
            }
        }
        System.out.println("Sum of +ve = " + sumP);
        System.out.println("Sum of -ve = " + sumN);
    }

    public static void main(String[] args) {
        second();
        
    }
}
