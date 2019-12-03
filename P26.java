import java.io.*;
import java.io.*;
import java.util.*;
class P26
{
public static void main(String args[])
    {
       
      if(args[0].equals("male"))
      {
         
        int age=Integer.parseInt(args[1]);
      
        if(age>=1&& age<=60)
        System.out.println("interest is 9.2%");
       else if(age>=61 && age<=120)
      System.out.println("interest is 8.3");
      else
       System.out.println("sorry wrong selection");
      }
    else if(args[0].equals("female"))
     {
int age=Integer.parseInt(args[1]);
      
        if(age>=1&& age<=60)
        System.out.println("interest is 7.6%");
       else if(age>=61 && age<=120)
      System.out.println("interest is 8.2%");
      else
       System.out.println("sorry wrong selection");
      }     

   else
{
System.out.println("wrong entre");
}
   }

}