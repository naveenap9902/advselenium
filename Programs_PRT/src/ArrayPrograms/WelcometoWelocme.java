package ArrayPrograms;

public class WelcometoWelocme {
	public static void main(String[] args) {
		String s1="welcome";
		String s2 = "";
		for(int i=0;i<s1.length();i++)
		{
			String temp=""+s1.charAt(i);
			for(int j=i+1;j<s1.length();j++)
			{
				temp=temp+s1.charAt(j);
				if(temp.equals("co"))
				{
					s2=s2+rev(temp);
				}
				}
			if(s1.charAt(i)!='c' && s1.charAt(i)!='o')
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);	
	}
	public static String rev(String x) 
	{
		String rev="";
		for(int i=x.length()-1;i>=0;i--)
		{
			rev=rev+x.charAt(i);
		}
		return rev;
	}

}
