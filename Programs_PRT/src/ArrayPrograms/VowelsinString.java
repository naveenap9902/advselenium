package ArrayPrograms;

public class VowelsinString {
	public static void main(String[] args) {
		String s="abceihgu";
		String vowels="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'||s.charAt(i)=='u')
			{
				vowels=vowels+s.charAt(i);
			}
		}
		System.out.println(vowels);
	}
}
