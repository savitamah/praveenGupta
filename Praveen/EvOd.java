class EVOD1
{
	static int x;
	void eo(int n)
	{
		x=n;
		if(n%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}
}
class EvOd{
	public static void main(String args[])
	{
		EVOD1 ob=new EVOD1();
		ob.eo(5);
	}
}
		