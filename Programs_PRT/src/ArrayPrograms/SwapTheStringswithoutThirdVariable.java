package ArrayPrograms;

public class SwapTheStringswithoutThirdVariable {
	public static void main(String[] args) {
		String s1="abcd";
		String  s2="xyz";
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("this is s1 = "+s1);
		System.out.println("this is s2 ="+s2);
	}                                                                                                                     
}
