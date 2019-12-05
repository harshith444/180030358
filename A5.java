import java.io.*;
import java.util.*;
import java.lang.*;
class A5
{
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);

int a[]=new int[5];
int i,j;
System.out.println("enter array elements");
for(i=0;i<5;i++)
{
a[i]=hr.nextInt();
}
int temp=0;
for(i=0;i<5;i++)
{
for(j=i;j<5;j++)
{
if(a[i]<a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("maximum 2 elements are="+a[0]+" "+a[1]+"minimum 2 elements are="+a[4]+" "+a[3]);

}
}