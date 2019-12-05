import java.io.*;
import java.util.*;
import java.lang.Math;
class Calculator
{
static double powerInt(int num1,int num2)
{
return (Math.pow(num1,num2));
} 
static double powerDouble(double num1,int num2)
{
return (Math.pow(num1,num2));
}
}
class C2
{
public static void main(String args[])
{
System.out.println(Calculator.powerInt(2,4));
System.out.println(Calculator.powerDouble(10.33,4));
}
}