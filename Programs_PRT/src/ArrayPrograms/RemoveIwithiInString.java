package ArrayPrograms;

public class RemoveIwithiInString {
	public static void main(String[] args) {
		String s1="India";
		char[] s2 = s1.toCharArray();
		for(int i=0;i<s2.length;i++)
		{
			if(s2[i]=='I')
			{
				s2[i]='i';
			}
		}
		for(int i=0;i<s2.length;i++)
		{
			System.out.print(s2[i]);
		}
	}

}
