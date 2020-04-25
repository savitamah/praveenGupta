import java.util.Scanner;
class SI1
{
	void showSI(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the pricipal of simple interest:");
		float p=scanner.nextFloat();
		System.out.println("Enter the rate of simple interest:");
		float r=scanner.nextFloat();
		System.out.println("Enter the time of simple interest:");
		int t=scanner.nextInt();
		float si=(p*r*t/100);
		System.out.println("Simple Interest is:"+si);
	}
}
public class SI{
	public static void main(String args[])
	{
		SI1 ob=new SI1();
		ob.showSI();
	}
}
		