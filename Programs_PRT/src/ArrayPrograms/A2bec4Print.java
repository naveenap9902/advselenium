package ArrayPrograms;

public class A2bec4Print {
	public static void main(String[] args) {
		String s1="a2b3c4";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				int count=s1.charAt(i)-48;
				for(int j=0;j<count;j++)
				{
					s2=s2+s1.charAt(i-1);
				}
			}
		}
		System.out.println(s2);
	}

}
