import java.util.Scanner;
class AvgAsPercentage1{
	void showAP(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the three number which you want to find percentage of average:");
		float n1=scanner.nextFloat();
		float n2=scanner.nextFloat();
		float n3=scanner.nextFloat();
		float avg=(n1+n2+n3)/3;
		float percentageofavg=(avg/100)*100;
		System.out.println("average as percentage:"+percentageofavg);
	}
}
public class AvgAsPercentage{
	public static void main(String args[])
	{
		AvgAsPercentage1 ob=new AvgAsPercentage1();
		ob.showAP();
	}
}
		