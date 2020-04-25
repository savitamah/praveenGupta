import java.util.Scanner;
class EvenOdd1{
	public void show()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number which you want to check even or odd number");
		int n=scanner.nextInt();
		if(n%2==0){
			System.out.println("Even Number");
		}
		else{
			System.out.println("Odd Number");
		}
	}
}
public class EvenOdd{
	public static void main (String args[])
	{
		EvenOdd1 ob=new EvenOdd1();
		ob.show();
	}
}
		