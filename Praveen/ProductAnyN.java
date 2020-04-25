import java.util.Scanner;
class ProductAnyN1
{
 	static void showAM(){
		int mul=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number where you want to start excute product of n number:");
		int s=scanner.nextInt();
		System.out.println("Enter the 1 to n number which you want to product :");
		int n=scanner.nextInt();
		for(int i=s;i<=n; i++)
		{
			mul=mul*i;
			
		}
		System.out.println("product of n number:"+mul);
	}
}
public class ProductAnyN{
	public static void main(String args[])
	{
		ProductAnyN1.showAM();
	}
}