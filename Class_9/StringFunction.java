package Class_9;

public class StringFunction
{
   public static void main(){
       
       // Converting to bytes and then to convert to string and display it
       String s = "Tanishq";
       byte[] tanishq = s.getBytes();
       System.out.println("Tanishq Array = " + tanishq);
       String Tanishq = new String(tanishq);
       System.out.println("Name : " + Tanishq);
       
       // Converting a charecter array and then converting it into a String
       char[] ch={'T','a','n','i','s','h','q'};  
       String tan = new String(ch);  
       System.out.println(tan);
       String tani ="Tanishq";  
       
       //Checking which charecter is at 5 index
       System.out.println(tani.charAt(5));
       
       // Declared name and channel name and channel name 
       String nameTsa = "Tanishq";
        String channel = "Techny Teams";
        System.out.println(nameTsa);
        // Lenght if the my Name variable
        double lenghtOfNameTsa = nameTsa.length();
        System.out.println(lenghtOfNameTsa);
        // Converting the String to lower case letters
        System.out.println(nameTsa.toLowerCase());
        // Converting the String to upper case letters
        System.out.println(nameTsa.toUpperCase());
        // Using escape charecters to add a " , / , \ , | and etc.
        System.out.println("HI  this is a string which is enclosed in two\"");
        // Using \n for going to the next line
        System.out.println("This is called escape \\  \n Tanishq");
        // Checking if a string contains 
        System.out.println(nameTsa.contains("Tan"));
        System.out.println(nameTsa.charAt(5));
        System.out.println(nameTsa.endsWith("hq"));
        System.out.println(nameTsa.indexOf("nos"));
        System.out.println(nameTsa.indexOf("nis"));
        System.out.println(nameTsa + " From " + channel);
       
   }
}

