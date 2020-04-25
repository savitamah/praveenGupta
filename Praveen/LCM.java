import java.util.Scanner;
class LCM1
{
	static void showLcm(){
		int n1,n2,x,y,gcd,lcm;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the num1");	
	    n1=scanner.nextInt();
		System.out.println("Enter the num2");
	    n2=scanner.nextInt();
		x=n1;
		y=n2;
		while(n1!=n2)
		{
			if(n1>n2)
			{
				n1=n1-n2;
			}
			else
			{
				n2=n2-n1;
			}
		}
	     gcd=n1;
		lcm=(x * y)/gcd;
		System.out.println("Least Common Multiple is:"+lcm);
	}
}
public class LCM{
	public static void main(String args[])
	{
		LCM1.showLcm();
	}
}