import java.util.Scanner;
class SumOfAnyN1
{
 	static void showSAN(){
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number where you want to start excute sum of n number:");
		int s=scanner.nextInt();
		System.out.println("Enter the 1 to n number which you want to sum :");
		int n=scanner.nextInt();
		for(int i=s;i<=n; i++)
		{
			sum=sum+i;
			
		}
		System.out.println("Sum of any n number:"+sum);
	}
}
public class SumOfAnyN{
	public static void main(String args[])
	{
		SumOfAnyN1.showSAN();
	}
}