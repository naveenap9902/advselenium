package ArrayPrograms;

import java.util.LinkedHashSet;

public class PrintonlyUniqueChracter {
	public static void main(String[] args) {
		String s="mangom";
		//step1:-declare hashset to store the 
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			//step2:-store every char of string into hashset
			set.add(s.charAt(i));
		}
		for(Character ch:set)
		{		
			//step3:- compare the string with hashset values and give the count based on occurance
			int count=0;
			for (int i = 0; i < s.length(); i++) {
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			//step4:-print character with count(occurance)
			if(count==1)
			{
			System.out.print(ch);
		}
	}
}
}
