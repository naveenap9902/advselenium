package Prorams;

import java.util.LinkedHashSet;
public class PrinttheUniqueStringValues {
	public static void main(String[] args) {
		String s="hi hello bye hi";
		String[] s1 = s.split(" ");
		LinkedHashSet< String> set=new LinkedHashSet<String>();
		for(int i=0;i<s1.length;i++)
		{
			set.add(s1[i]);
		}
		for(String str:set)
		{
			int count=0;
			for(int i=0;i<s1.length;i++)
			{
				if(str.equals(s1[i]))
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(str+" "+count);
			}
		}
	}
}
