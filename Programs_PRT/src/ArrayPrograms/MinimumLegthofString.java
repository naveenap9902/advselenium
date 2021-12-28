package ArrayPrograms;

public class MinimumLegthofString {
	public static void main(String[] args) 
	{
		String[] arr={"usa","india","japan","uk"};
		int[] abc=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			abc[i]=arr[i].length();
		}
		for(int i=0;i<abc.length;i++)
		{
			for(int j=i+1;j<abc.length;j++)
			{
				if(abc[i]>abc[j])
				{
					int temp=abc[i];
					abc[i]=abc[j];
					abc[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
		if(abc[0]==arr[i].length())
		{
			System.out.println(arr[i]);
		}		
	}
	}
}

