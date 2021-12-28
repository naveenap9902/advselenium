package ArrayPrograms;

public class SortStringCompareTo {
	public static void main(String[] args) {
		//step1 :- Declare the string values
		String[] arr= {"hi","ko","hello","world","testyantra"};
		//step2;-this loop is for the swaps
		for (int i = 0; i < arr.length; i++) 
		{
			//step3:-
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {		
		System.out.print(arr[i]+" ");
	}
	}
}
