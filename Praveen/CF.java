import java.util.Scanner;
class CF1
{
	void showCF(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the temperature in centigrate:");
		float c=scanner.nextFloat();
		double f=c*(9.0/5.0)+32;
		System.out.println("farenheit is:"+f);
	}
}
public class CF{
	public static void main(String args[])
	{
		CF1 ob=new CF1();
		ob.showCF();
	}
}