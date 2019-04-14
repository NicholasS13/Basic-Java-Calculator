import java.util.Scanner;
public class BasicJavaCalculator{
	public static double ans = 0;
	public static void main(String[] args){
		Scanner numScan = new Scanner(System.in);
		System.out.print("Please type in your first number: ");
		double firstnum = numScan.nextDouble();
		System.out.print("Please type in the opperatior you would like to use(1=+,2=-,3=/,4=*: ");
		int operator = numScan.nextInt();
		System.out.print("Please type in your second number: ");
		double secondnum = numScan.nextDouble();
		if(operator==1)
			addition(firstnum,secondnum);
		if(operator==2)
			subtraction(firstnum,secondnum);
		if(operator==3)
			division(firstnum,secondnum);
		if(operator==4)
			multiply(firstnum,secondnum);
		System.out.println(firstnum+"+"+secondnum+"="+ans);
	}
	public static void addition(double a,double b){
		ans += a+b;
	}
	public static void subtraction(double a,double b){
		ans += a-b;
	}
	public static void division(double a, double b){
		ans += a/b;
	}
	public static void multiply(double a, double b){
		ans += a*b;
	}
}
