import java.util.Scanner;
class OddSum1{
	static void showOS2(){
		int i,sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1to n number which you want to find sum of odd number:");
		int n=scanner.nextInt();
		for(i=1; i<=n; i++)
		{
			if(i%2!=0){
				sum=sum+i;
			}
			
		}
		System.out.print("Sum of odd number is:"+sum);
	}
}
public class OddSum{
	public static void main(String args[])
	{
		OddSum1.showOS2();
	}
}