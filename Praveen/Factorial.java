import java.util.Scanner;
class Factorial1{
	static void showFactorial(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number which you want to find factorial:");
		int n=scanner.nextInt();
		int i,fact=1;
		if (n<0){
			System.out.println("sorry,factorial does not exist.");
		}
		else if(n==0){
			System.out.println("The factorial of 0 is 1");
		}
		else{
			for(i=1;i<=n;i++)
			fact=fact*i;
			System.out.println("the factorial is:"+fact);
			
		}
	}
}
public class Factorial{
	public static void main(String args[]){
		Factorial1.showFactorial();
	}
}
		