import java.util.Scanner;
class SUMOFN1{
	static void showSUMN(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number which you want to find 1 to n:");
		int n=scanner.nextInt();
		int sum=n*(n+1)/2;
		System.out.println("Sum of n number:"+sum);
    }
}
public class SUMOFN{
	public static void main(String args[]){
		SUMOFN1.showSUMN();
	}
}

