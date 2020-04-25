import java.util.Scanner;
class AVG1{
	void showAVG(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the num1:");
		float n1=scanner.nextFloat();
		System.out.println("enter the num2:");
		float n2=scanner.nextFloat();
		System.out.println("enter the num3:");
		float n3=scanner.nextFloat();
		double avg=(n1+n2+n3)/3;
		System.out.println("The total number of average is:"+avg);
	}
}
public class AVG{
	public static void main(String args[])
	{
		AVG1 ob=new AVG1();
		ob.showAVG();
	}
}
		