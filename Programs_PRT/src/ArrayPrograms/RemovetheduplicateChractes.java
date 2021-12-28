package ArrayPrograms;

import java.util.LinkedHashSet;

public class RemovetheduplicateChractes 
{
	public static void main(String[] args) {
		String s="mangom";
		//step1:-declare hashset to store the 
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++)
		{
			//step2;-store every char of string into hashset
			set.add(s.charAt(i));
		}
		//step2:- print the characters which are there in set
		for(Character ch:set)
		{
			System.out.print(ch);
		}
	}
}

