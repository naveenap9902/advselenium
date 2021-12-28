package ArrayPrograms;

public class SeparatealphaDigitChar {
	public static void main(String[] args) {
		String s="abcd#324#g";//step1:-declare string 
		String alpha="";
		String num="";
		String spc="";
		//step2:-separate alphabets from the String
		for(int i=0;i<s.length();i++)
		{
		//	if((s.charAt(i)>=65 && s.charAt(i)<=90)||(s.charAt(i)>=97 && s.charAt(i)<=122))
				if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z'))
			{
				alpha=alpha+s.charAt(i);
			}
				//step3:- separate Digits from String
			else if (s.charAt(i)>=48 && s.charAt(i)<=57) {
				num=num+s.charAt(i);
			}
				//step4;- if else store the char as special char
			else
			{
				spc=spc+s.charAt(i);
			}
		}
		//step5:- print all the chars separate
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spc);
	} 
}
