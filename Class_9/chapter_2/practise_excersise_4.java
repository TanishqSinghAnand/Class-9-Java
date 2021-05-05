package Class_9.chapter_2;

public class practise_excersise_4
{
    // instance variables - replace the example below with your own
    void first()
    {
        int a =4;
        int b = 5 ;
        int c = ++a +a +b-- - a-- + ++b;
        System.out.println("\n \n \n");
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c2 = ++a + b-- - a-- + ++b + b--;
        System.out.println("\n \n \n");
        System.out.println("c2 = " + c2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int c3 = a + --a + b-- + ++b + b--;
        System.out.println("\n \n \n");
        System.out.println("c2 = " + c3);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
