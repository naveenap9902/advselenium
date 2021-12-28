package ArrayPrograms;

public class SeparateNumberandZeroinArray {
	public static void main(String[] args) {
		int[] arr= {1,0,2,0,3,0,0,4};
		int[] abc=new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{		
			if(arr[i]==0)
			{
				count++;
			}
			else if (arr[i]>0) {
				abc[i]=arr[i];
				System.out.print(abc[i]+" ");
			}
		for(int j=0;j<count;j++)
			{
				abc[j]=0;
			}
		}
		for(int i=count;i<abc.length;i++)
		{
			System.out.print((abc[i]=0)+" ");
		}	
	}

}
