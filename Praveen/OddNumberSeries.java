import java.util.Scanner;
class OddNumbers1{
	static void showS1(){
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1to n number which you want to find odd number:");
		int n=scanner.nextInt();
		for(i=1; i<=n; i++)
		{
			if(i%2!=0){
				System.out.print(i+"\t");
				
			}
		}
	}
}
public class OddNumberSeries{
	public static void main(String args[])
	{
		OddNumbers1.showS1();
	}
}