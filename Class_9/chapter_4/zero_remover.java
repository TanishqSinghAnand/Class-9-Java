package Class_9.chapter_4;

import java.util.Scanner;
class zero_remover
{
public static void main(String[]args)
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter the number");
long n=ob.nextLong();
long digit;
long s=0,s1,s2=0;
while (n>0)
{
digit=n%10;
if (digit==0)
{
s=s;
}
else
{
s=s*10+digit;
}
n=n/10;
}
while (s>0)
{
digit=s%10;
s2=s2*10+digit;
s=s/10;
}
System.out.println("The number without zeroes is =>>"+s2);
}
}