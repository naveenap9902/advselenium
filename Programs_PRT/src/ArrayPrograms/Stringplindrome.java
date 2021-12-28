package ArrayPrograms;

public class Stringplindrome 
{
	public static void main(String[] args) {
		String s= "abcba";
		String copy=s;
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(rev.equals(copy))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
		{
			
		}
		
	}

}
