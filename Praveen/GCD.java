import java.util.Scanner;
class GCD1
{
	static void showGcd(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the num1");
		int n1=scanner.nextInt();
		System.out.println("Enter the num2");
		int n2=scanner.nextInt();
		while(n1!=n2)
		{
			if(n1>n2)
			{
				n1=n1-n2;
			}
			else
			{
				n2=n2-n1;
			}
		}
		System.out.println("Greatest common divisor is:"+n1);
	}
}
public class GCD{
	public static void main(String args[])
	{
		GCD1.showGcd();
	}
}