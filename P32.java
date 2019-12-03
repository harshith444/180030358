import java.io.*;
import java.util.*;
class P32
{
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);
int n=hr.nextInt();
int sum=0;

while(n>0)
{
int r=n%10;
sum=sum*10+r;
n=n/10;
}
System.out.println(sum);
}
}