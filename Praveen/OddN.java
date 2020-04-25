import java.util.Scanner;
class OddN1{
	static void showSN1(){
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number which you want started to find odd number:");
		int s=scanner.nextInt();
		System.out.println("Enter n number which you want to find odd number:");
		int n=scanner.nextInt();
		for(i=s; i<=n; i++)
		{
			if(i%2!=0){
				System.out.print(i+"\t");
				
			}
		}
	}
}
public class OddN{
	public static void main(String args[])
	{
		OddN1.showSN1();
	}
}