package ArrayPrograms;

public class MaximumLengthString {
	public static void main(String[] args) {
		String arr[]= {"hello","windows","Testyantra"};
		int legthMax=0;
		for(int i=0;i<arr.length;i++)
		{
			int actlegth=arr[i].length();
			if(legthMax<actlegth)
			{
				legthMax=actlegth;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(legthMax==arr[i].length())
			{
				System.out.println(arr[i]);
			}
		}
	}
}
