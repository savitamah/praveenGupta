import java.util.Scanner;
class SumOfEven1{
	static void showES2(){
		int i,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1to n number which you want to find sum of even number:");
		int n=scanner.nextInt();
		for(i=1; i<=n; i++)
		{
			if(i%2==0){
				sum=sum+i;
			}
			
		}
		System.out.print("Sum of even number is:"+sum);
	}
}
public class SumOfEven{
	public static void main(String args[])
	{
		SumOfEven1.showES2();
	}
}