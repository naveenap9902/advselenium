package ArrayPrograms;

public class IndiaPRintindia {
	public static void main(String[] args) {
		String s="India";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=65 && s.charAt(i)<=90)
			{
				s1=s1+((char)(s.charAt(i)+32));
			}else {
			   s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}

}
