import java.io.*;
import java.util.*;
import java.lang.*;
class P38
{
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);
char s=hr.next().charAt(0);

if(Character.isLowerCase(s))
{
System.out.println(Character.toUpperCase(s));
}
else if(Character.isUpperCase(s))
{
System.out.println(Character.toLowerCase(s));
}
else
System.out.println("sorry incorrect input");
}
}
