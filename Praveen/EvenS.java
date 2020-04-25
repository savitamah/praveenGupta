import java.util.Scanner;
class EvenS1{
	static void showES1(){
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1to n number which you want to find even number:");
		int n=scanner.nextInt();
		for(i=1; i<=n; i++)
		{
			if(i%2==0){
				System.out.print(i+"\t");
				
			}
		}
	}
}
public class EvenS{
	public static void main(String args[])
	{
		EvenS1.showES1();
	}
}