package ArrayPrograms;

public class SortarrayinDescendingOrder {
	public static void main(String[] args) 
	{
		//step1:- initialize the array int[]
		int[] arr= {40,20,30,10,50};
		//step2 this loop is for the number of swaps
		for(int i=0;i<arr.length;i++)
		{
			//step3;- this for loop is to compare the an number and swap
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		//step4:- print the array which is sorted
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
