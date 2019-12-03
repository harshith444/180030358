import java.io.*;
import java.util.*;
class P43
{
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);
int s=hr.nextInt();
int sum=0;
int n=s;
while(s>0)
{
int r=s%10;
sum=sum*10+r;
s=s/10;
}
if(n==sum)
System.out.println("palindrome");
else
System.out.println("not a palindrome");
}
}