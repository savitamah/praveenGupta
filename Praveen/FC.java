import java.util.Scanner;
class FC1
{
	void showFC(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the temperature in farenheit:");
		float f=scanner.nextFloat();
		float c=((f-32)*5)/9;
		System.out.println("Centigrate is:"+c);
	}
}
public class FC{
	public static void main(String args[])
	{
		FC1 ob=new FC1();
		ob.showFC();
	}
}