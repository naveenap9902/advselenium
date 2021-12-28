package ArrayPrograms;

import java.util.HashSet;

public class TestterwithIndex {
	public static void main(String[] args) {
		String s1="tester";
		HashSet<Character> set=new HashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			set.add(s1.charAt(i));
		}
		for(Character ch:set)
		{
			for(int i=0;i<s1.length();i++)
			{
				if(ch==s1.charAt(i))
				{
					System.out.println(ch+"--"+(i+1));
				}
			}
		}
	}
}
