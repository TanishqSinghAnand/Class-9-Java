package Class_9.chapter_7;


public class Pg190 {
    static void first(){
        for(int i =1;i<=5;i++){
            for(int j=5;j>5-i;j--){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }

    static void second(int total) {
        for (int i = 1; i <= total; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        second(5);
    }
}
