package ArrayPrograms;

public class MinoflegtthStringvalues {
	public static void main(String[] args) {
		String arr[]= {"hello","windows123","Testyantra","mango"};
		String min=arr[0];
		for(int i=0;i<arr.length;i++)
		{	
			if(arr[i].length()<min.length())				
			{
				min=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(min.length()==arr[i].length())
			{
				System.out.println(arr[i]);
			}
		}
	}
}
