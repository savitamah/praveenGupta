import java.util.Scanner;
class Product1
{
 	static void showM(){
		int mul=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the 1 to n number which you want to product :");
		int n=scanner.nextInt();
		for(int i=1;i<=n; i++)
		{
			mul=mul*i;
			
		}
		System.out.println("product of n number:"+mul);
	}
}
public class Product{
	public static void main(String args[])
	{
		Product1.showM();
	}
}