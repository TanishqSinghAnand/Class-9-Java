package Class_9.chapter_8;

import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String name = sc.nextLine();
        String reversed = "";
        int lastInd;
        int spaces = 0;
        for(int i =0; i <name.length();i++ ){

            if(name.charAt(i)==32){
                spaces++;
            }
        }
        for (int i = 0; i<spaces; i++) {
            lastInd = name.lastIndexOf(" ");
            reversed += name.substring(lastInd + 1, name.length()) + " ";
            name = name.substring(0, lastInd);
        }
        reversed += name;
        System.out.println("reversed = " + reversed);
        sc.close();
    }
}
