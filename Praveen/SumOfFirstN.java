import java.util.Scanner;
class SumOfFirstN1
{
 	static void showSN(){
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the 1 to n number which you want to sum :");
		int n=scanner.nextInt();
		for(int i=1;i<=n; i++)
		{
			sum=sum+i;
			
		}
		System.out.println("Sum of n number:"+sum);
	}
}
public class SumOfFirstN{
	public static void main(String args[])
	{
		SumOfFirstN1.showSN();
	}
}