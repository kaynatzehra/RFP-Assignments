package com.day6;
import java.util.Arrays; 
import java.util.Scanner; 
public class TemperatureConversion {
	 public static void main(String args[]) {
		 double a,b,c,f;
  	    Scanner sc=new Scanner(System.in);	   	 
System.out.println("Enter  Celsius temperature");
        a=sc.nextDouble(); 
System.out.println("Fahrenheit temperature is = "+fahrenheit(a));			 
System.out.println("Enter  Fahrenheit temperature");
b=sc.nextDouble(); 
System.out.println("Celsius temperature is = "+celcius(b));	
} 
public static double fahrenheit(double c)
{	
double  fahrenheit = ((9*c)/5)+32;
return fahrenheit;
}
public static double celcius(double f)
{	
double  celcius = (f-32)*5/9;
return celcius;
}
}
