import java.util.Scanner;
class Square1
{
	static void showSquare()
	{
		int sq;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number which you want to find square:");
		int n=scanner.nextInt();
		sq=n*n;
		System.out.println("Square of given number is:"+sq);
	}
}
public class Square{
	public static void main(String args[]){
		Square1.showSquare();
	}
}
		
		