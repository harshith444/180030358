import java.io.*;
import java.util.*;
import java.lang.*;
class P24
{
   public static void main(String args[])
   {
    Scanner hr=new Scanner(System.in);
    char s=hr.next().charAt(0);
   char v=hr.next().charAt(0);
    if(s<v)
    System.out.println(s+" is greater than "+v+"so the order"+s+","+v);
   
   else
System.out.println(s+" is smaller than "+v+"so the order"+v+","+s);
   }
}