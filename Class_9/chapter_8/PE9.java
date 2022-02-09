package Class_9.chapter_8;

import java.util.*;

public class PE9 {
    static void pather() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Path");
        String path = sc.nextLine();
        int LastDot = path.lastIndexOf(".");
        int LastSlash = path.lastIndexOf("\\");
        System.out.println("Path = " + path.substring(0, LastSlash));
        System.out.println("Extion Name = " + path.substring(LastDot+1, path.length()));
        System.out.println("Filename = " + path.substring(LastSlash+1, LastDot));
        sc.close();

    }

    static void souts() {
        System.out.println("Mahatma Gandhi".substring(8));
        System.out.println("Mahatma Gandhi".substring(0, 7));
        System.out.println("Platform independent language".substring(0, 8));
        System.out.println("Platform independent language".substring(9, 20));
        System.out.println("Platform independent language".substring(21, 29));
    }

    public static void main(String[] args) {
        pather();
    }
}
