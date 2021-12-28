package ArrayPrograms;

public class RemoveandReplaceChar {
	public static void main(String[] args) {
		String s="india";
		char[] s3 = s.toCharArray();
		for(int i=0;i<s3.length;i++)
		{
			if(s3[i]=='i')
			{
				s3[i]='a';
			}
		}
		for(int i=0;i<s3.length;i++)
		{
			System.out.print(s3[i]);
		}
	}

}
