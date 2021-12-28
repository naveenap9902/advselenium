package ArrayPrograms;

public class AdditionofGropuedNumb {
	public static void main(String[] args) {
		String s="ab12c45#1";
		int sum=0;
		int gnum=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)//to get the number the string
			{
				int no = s.charAt(i)-48;
				gnum=gnum*10+no;
			}
			else
			{
				sum=sum+gnum;
				gnum=0;
			}
		}
	sum=sum+gnum;
	System.out.println(sum);
	}
}
