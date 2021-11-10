package Class_9.chapter_4;
import java.io.*;

class zero$remover
{
public static void main(String arg[])throws IOException
{
BufferedReader ob =new BufferedReader(new InputStreamReader(System.in));
int n,a,x,num;

 
String str,p="";
char c;
System.out.println("Enter the number");
n=Integer.parseInt(ob.readLine());
str=Integer.toString(n);
a=str.length();
x=a-1;
for(int i=x;i>=0;i--)
{
c=str.charAt(i);
if(c!='0')
p=c+p;
}
num=Integer.parseInt(p);
System.out.println("The number without Zero = "+num);
}
}