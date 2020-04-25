import java.util.Scanner;
class NthTerm1{
	static void showN2(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter n number which you want to find Nth term series:");
		int s=scanner.nextInt();
		System.out.println("Enter n number which you want to find Nth term series:");
		int n=scanner.nextInt();
		System.out.println("enter the term which you want to used:");
		int term=scanner.nextInt();
		for(int i=s; i<n; i++)
		{
			int n2=1,total;
			total=((term*i)+n2);
			System.out.print("\t"+total);
		}
		
	}
}
public class NthTerm{
	public static void main(String args[])
	{
		NthTerm1.showN2();
	}
}