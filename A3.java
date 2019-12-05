import java.io.*;
import java.util.*;
import java.lang.*;
class A3
{
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);
System.out.println("enter size of array");
int n=hr.nextInt();
int a[]=new int[n];
int i,flag=0;
System.out.println("enter array elements");
for(i=0;i<n;i++)
{
a[i]=hr.nextInt();
}
System.out.println("enter the search element");
int sea=hr.nextInt();
for(i=0;i<n;i++)
{
if(a[i]==sea)
{
flag=1;
System.out.println("element found at index"+i);
break;
}
}
if(flag!=1)
{
System.out.println(-1);
}

}
}