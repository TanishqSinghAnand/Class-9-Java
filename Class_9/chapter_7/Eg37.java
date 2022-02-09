package Class_9.chapter_7;


public class Eg37 {

    static void read(int n){
        int sum = 0;
        for(int i =1;i<=n;i++){
            if(i %2==0){
                sum -= i;
                System.out.println("Even = " + i +"Sum = "+sum); 
            }
            else{
                sum += i;
                System.out.println("ODD = " + i + "Sum = " + sum);

            }
        }
        System.out.println("Sum = "+sum);
    }

    public static void main(String[] args) {
        read(2);
    }
}
