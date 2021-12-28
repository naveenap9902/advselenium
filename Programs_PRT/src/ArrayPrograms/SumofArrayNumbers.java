package ArrayPrograms;

public class SumofArrayNumbers 
{
public static void main(String[] args) 
{
	//step1: declare two arrays
	int[] a= {10,20,30,40};
	int[] b= {1,2,3,4,5};
	//step2: get the maximun length of arrays
	int count=a.length;
	if(count<b.length)
	{
		count=b.length;
	}
	//step3: try and catch block to avoid exception(arrayIndex)
	for(int i=0;i<count;i++)
	{
		try {
			System.out.print(a[i]+b[i]+" ");
		}
		catch (Exception e) {
			//if legnth of array is greater than print the element from that array
			if(a.length>b.length)
				{
				System.out.print(a[i]+" ");
				}
			else
			{
				System.out.print(b[i]+" ");
			}
				}
	}
}
}
