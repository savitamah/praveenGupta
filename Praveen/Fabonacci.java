import java.util.Scanner; 
class Fabonacci1{
	static void showF(){
	    Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number which you want to find fabonacci series:");
		int n=scanner.nextInt();
		int f=0,s=1,t,i;
		System.out.println(f+"");
		System.out.println(s+"");
		for(i=1;i<=n;i++)
		{
			t=f+s;
			System.out.println(""+t);
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
		