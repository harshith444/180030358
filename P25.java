import java.io.*;
import java.util.*;
import java.lang.*;
class P25
{
   public static void main(String args[])
   {
   Scanner hr=new Scanner(System.in);
   char s=hr.next().charAt(0);
   if(s>65 && s<122)
   System.out.println("character");
   else if(s>=48 && s<=57)
 System.out.println("digits");
else
 System.out.println("special character");  

  }
}