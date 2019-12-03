import java.io.*;
import java.util.*;
class P21
{
   public static void main(String args[])
   {
    Scanner hr=new Scanner(System.in);
    int s=hr.nextInt();
    if(s>0)
    System.out.println("positive");
    else if(s<0)
   System.out.println("negative");
   else
System.out.println("zero");
   }
}