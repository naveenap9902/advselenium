package Prorams;

public class StringConcat {
	public static void main(String[] args) 
	{
		String s="abcxyz";
		for(int i=0;i<(s.length()/2);i++)
		{
			System.out.print(s.charAt(i)+""+s.charAt((s.length()/2)+i));
		}
	}
}
