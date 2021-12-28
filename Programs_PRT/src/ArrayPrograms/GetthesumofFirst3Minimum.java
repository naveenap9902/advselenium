package ArrayPrograms;

public class GetthesumofFirst3Minimum {
	public static void main(String[] args) 
	{
		int[] arr= {40,20,30,10,50};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;				
				}
			}
		}
		int sumOfMin=0;
		for(int i=0;i<3;i++)
		{
			sumOfMin=sumOfMin+arr[i];
		}
		System.out.println(sumOfMin);
		}
}
