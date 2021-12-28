package ArrayPrograms;

public class PrimeNumber {
	public static void main(String[] args) {
		int no=12;
		boolean flag=true;
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				flag=false;			
			}
		}
		if(flag==true) {
		System.out.println(no+"  is prime");
	}
		else
		{
			System.out.println(no+ " is not prime");
		}
	}
}
