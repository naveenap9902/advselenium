package ArrayPrograms;

import java.util.TreeSet;

public class SorttheStringinDescending {
	public static void main(String[] args) {
		String[] arr= {"india","usa","japan","nepal"};
		TreeSet<String> set=new TreeSet<String>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		System.out.println(set.descendingSet());	
	}
}
