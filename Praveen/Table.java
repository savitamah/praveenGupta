import java.util.Scanner;
class Table1
{
 	static void showTable(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number which you want to find table:");
		int m=scanner.nextInt();
		System.out.println("Enter the number how many perform the table:");
		int n=scanner.nextInt();
		for(int i=1;i<=n; i++)
		{
			System.out.println(m+" * "+i+" = "+m*i);
		}
	}
}
public class Table{
	public static void main(String args[])
	{
		Table1.showTable();
	}
}
		