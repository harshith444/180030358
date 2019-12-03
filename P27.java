import java.io.*;
import java.util.*;
import java.lang.*;
class P27
{
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);
char a=hr.next().charAt(0);
if(a=='r'||a=='R')
System.out.println("Red");
else if(a=='b'||a=='B')
System.out.println("Blue");
else if(a=='g'||a=='G')
System.out.println("green");
else if(a=='o'||a=='O')
System.out.println("orange");
else if(a=='y'||a=='Y')
System.out.println("yellow");
else
System.out.println("white");
}
}