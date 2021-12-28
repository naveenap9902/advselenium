package ArrayPrograms;

import java.util.LinkedHashSet;

public class printonlytheUUniqueString {
	public static void main(String[] args) {
		String s="hi welcome to tyss hi";
		//step1:-declare hashset to store the 
		String[] str = s.split(" ");
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			//step2;-store every String value into hashset
			set.add(str[i]);
		}
		for(String word:set)
		{		
			int count=0;
			//step3:- compare the string vaues in set with the array 
			for(int i=0;i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			//step4:- print the String  values with the count
			if(count==1) {
			System.out.print(word+" ");
	}
	}
	}
}
