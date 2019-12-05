import java.io.*;
import java.util.*;
class C1
{
double width,height,depth;
C1(double width,double height,double depth)
{
this.width=width;
this.height=height;
this.depth=depth;
}
double volume()
{
double vol=0;
vol=width*height*depth;
return vol;
}
public static void main(String args[])
{
Scanner hr=new Scanner(System.in);
System.out.println("enter width,height,depth");
double a=hr.nextDouble();
double b=hr.nextDouble();
double c=hr.nextDouble();
C1 ob=new C1(a,b,c);
System.out.println("volume of box is "+ob.volume());
}
}