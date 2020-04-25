import java.util.Scanner;
class BEven1{
	static void showSEB1(){
		int i;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 1 to n number which you want to find Even number backward:");
		int n=scanner.nextInt();
		for(i=100; i>=n; i--)
		{
			if(i%2==0){
				System.out.print(i+"\t");
				
			}
		}
	}
}
public class BEven{
	public static void main(String args[])
	{
		BEven1.showSEB1();
	}
}