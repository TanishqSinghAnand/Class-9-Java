package Class_9.chapter_7;

public class ClassTest {
    public static void main(String[] args) {
        tsa(3);
    }

    static void tsa(int n ){
        int sum = 0,k=2;
        for(int i =2;i<=n;i++){
            sum += k;
            k = (k*20)+2;
        }
        System.out.println(sum);
    }
}
