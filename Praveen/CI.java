import java.util.Scanner;
import java.io.*;
class CI1
{
	void showCI(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the pricipal of compound interest:");
		float p=scanner.nextFloat();
		System.out.println("Enter the rate of compound interest:");
		float r=scanner.nextFloat();
		System.out.println("Enter the time of compound interest:");
		int t=scanner.nextInt();
		double ci=p*(Math.pow((1+r/100), t));
		System.out.println("compound Interest is:"+ci);
	}
}
public class CI{
	public static void main(String args[])
	{
		CI1 ob=new CI1();
		ob.showCI();
	}
}