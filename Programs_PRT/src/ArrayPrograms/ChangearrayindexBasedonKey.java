package ArrayPrograms;

import java.util.Scanner;

public class ChangearrayindexBasedonKey {
	public static void main(String[] args) 
	{
		int no[]= {10,20,30,40,50};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key");
		int key=sc.nextInt();
		for(int i=0;i<key;i++)
		{
			int temp=no[0];
			for(int j=0;j<no.length-1;j++)
			{
				no[j]=no[j+1];
			}
			no[no.length-1]=temp;
		}
		for(int i=0;i<no.length;i++)
		{
			System.out.print(no[i]+" ");
		}
	}
}
