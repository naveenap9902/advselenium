package ArrayPrograms;

import java.util.TreeSet;

public class SortStringInAscending {
	public static void main(String[] args) {
		String arr[]= {"we","india","usa","japan"};
		TreeSet<String> set = new TreeSet<String>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
		}
		System.out.println(set);
		
	}

}
