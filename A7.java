import java.io.*;
import java.util.*;
class A7
{
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);
System.out.println("enter size of array");
int n=hr.nextInt();
int a[]=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=hr.nextInt();
}
for(i=0;i<n-1;i++)
{
if(a[i]==a[i+1])
{
a[i]=a[i+1];

}
}
for(i=0;i<n;i++)
{
System.out.println("  "+a[i]);
}
}
}