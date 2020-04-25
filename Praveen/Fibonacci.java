import java.util.Scanner; 
class Fabonacci1{
	static void showF(){
		int f=0,s=1,t;
	    Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number which you want to find fabonacci series:");
		int n=scanner.nextInt();
		for(i=1;i<=n;i++)
		{
			t=f+s;
			System.out.println("t="+t);
			f=s;
			s=t;
		}
	}
}
public class Fabonacci{
	public static void main(String args[]){
		Fabonacci1.showF();
	}
}
		