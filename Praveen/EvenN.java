import java.util.Scanner;
class EvenN1{
	static void showES2(){
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number which you want started to find even number:");
		int s=scanner.nextInt();
		System.out.println("Enter 1to n number which you want to find even number:");
		int n=scanner.nextInt();
		for(i=s; i<=n; i++)
		{
			if(i%2==0){
				System.out.print(i+"\t");
				
			}
		}
	}
}
public class EvenN{
	public static void main(String args[])
	{
		EvenN1.showES2();
	}
}