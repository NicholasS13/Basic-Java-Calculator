import java.util.Scanner;
import java.util.*;
import java.lang.Math;
public class BasicJavaCalculator{
	public static double ans = 0;
	public static void main(String[] args){
		Scanner numScan = new Scanner(System.in);
		System.out.print("Please type in your first number: ");
		double firstnum = numScan.nextDouble();
		System.out.println("Please type in the opperatior you would like to use(1=+,2=-,3=/,4=*, 5=^, 6=sin(),7=cos(),8=tan(),9=sqr: ");
		int operator = numScan.nextInt();
		double secondnum = 0;
		if(operator<6){
			System.out.print("Please type in your second number: ");
			secondnum = numScan.nextDouble();
		}
		if(operator==1)
			addition(firstnum,secondnum);
		if(operator==2)
			subtraction(firstnum,secondnum);
		if(operator==3)
			division(firstnum,secondnum);
		if(operator==4)
			multiply(firstnum,secondnum);
		if(operator==5)
			exponent(firstnum,secondnum);
		if(operator==6)
			sin(firstnum);
		if(operator==7)
			cos(firstnum);
		if(operator==8)
			tan(firstnum);
		if(operator==9)
			sqr(firstnum);

	}
	public static void addition(double a,double b){
		ans += a+b;
		System.out.println(a+"+"+b+"="+ans);
	}
	public static void subtraction(double a,double b){
		ans += a-b;
		System.out.println(a+"-"+b+"="+ans);
	}
	public static void division(double a, double b){
		ans += a/b;
		System.out.println(a+"/"+b+"="+ans);
	}
	public static void multiply(double a, double b){
		ans += a*b;
		System.out.println(a+"x"+b+"="+ans);
	}
	public static void exponent(double a, double b){
		ans = 1;
		for(int i = 0;i<b;i++){
			ans*=a;
		}
		System.out.println(a+"^"+b+"="+ans);
	}
	public static void sin(double a){
		double radians = Math.toRadians(a);
		ans = Math.sin(radians);
		System.out.println("sin("+a+") = "+ans);
	}
	public static void cos(double a){
		double radians = Math.toRadians(a);
		ans = Math.cos(radians);
		System.out.println("cos("+a+") = "+ans);
	}
	public static void tan(double a){
		double radians = Math.toRadians(a);
		ans = Math.tan(radians);
		System.out.println("tan("+a+") = "+ans);
	}
	public static void sqr(double a){
		ans= Math.sqrt(a);
		System.out.println("Square root of "+a+" is "+ans);
	}
}
