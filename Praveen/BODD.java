import java.util.Scanner;
class BOdd1{
	static void showSB1(){
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 to n number which you want to find odd number backward:");
		int n=scanner.nextInt();
		for(i=100; i>=n; i--)
		{
			if(i%2!=0){
				System.out.print(i+"\t");
				
			}
		}
	}
}
public class BOdd{
	public static void main(String args[])
	{
		BOdd1.showSB1();
	}
}