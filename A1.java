import java.io.*;
import java.util.*;
import java.lang.*;
class A1
{
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);
System.out.println("enter size of array");
int n=hr.nextInt();
int a[]=new int[n];
int i,sum=0,avg=0;
System.out.println("enter array elements");
for(i=0;i<n;i++)
{
a[i]=hr.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
avg=sum/n;
System.out.println("sum is="+sum+"Average is="+avg);

}
}