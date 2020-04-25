import java.util.Scanner;
class Cube1
{
	static void showCube()
	{
		int cu;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number which you want to find cube:");
		int n=scanner.nextInt();
		cu=n*n*n;
		System.out.println("Square of given number is:"+cu);
	}
}
public class Cube{
	public static void main(String args[]){
		Cube1.showCube();
	}
}
		