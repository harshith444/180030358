import java.io.*;
import java.util.*;
import java.lang.*;

class P39
{
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);
int n=hr.nextInt();
int i,j,count=0;
for(i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2){
System.out.println(n+"not composite but prime");
}
else if(count!=2)
{
int count1=0;
for(i=0;i<=n;i++)
{
if(n%i==0)
{
count1++;
}
}
if(count1>2)
System.out.println("composite but not prime"+n);
}
}

}