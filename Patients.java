import java.io.*;
import java.util.*;
class patient
{
String name;
double height,weight;
patient(String name,double height,double weight)
{
this.name=name;
this.height=height;
this.weight=weight;
}
double bmi()
{
double tot=0;
tot=(weight/(height*height))*703;
return tot;
}
}
class Patients
{
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);
System.out.println("enter name,weight in pounds,height in inches");
String s=hr.nextLine();
double a=hr.nextDouble();
double b=hr.nextDouble();
patient ob=new patient(s,a,b);
System.out.println(ob.bmi());
}
}