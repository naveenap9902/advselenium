package ArrayPrograms;

public class VowelsByConveLowercase {
	public static void main(String[] args) {
		String s="AwIog";
		String s1 = s.toLowerCase();
		
		String vowels="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='o'||s1.charAt(i)=='i'||s1.charAt(i)=='u')
			{
				vowels=vowels+s.charAt(i);
			}
		}
		System.out.println(vowels);
	}

}
