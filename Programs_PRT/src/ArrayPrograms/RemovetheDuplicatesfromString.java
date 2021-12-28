package ArrayPrograms;

import java.util.LinkedHashSet;

public class RemovetheDuplicatesfromString {
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
			System.out.print(word+" ");
		}
	}

}
