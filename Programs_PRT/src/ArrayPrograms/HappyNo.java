package ArrayPrograms;

public class HappyNo {	
		public static void main(String[] args) 
		{
			int no=121;
			int orginal=no;
			while(no>9)
			{
				int sum=0;
				while(no!=0)
				{
					int rem=no%10;
					sum=sum+rem;
					no=no/10;
				}
				no=sum;
			}
			if(no==1)
			{
				System.out.println(orginal+" it is happy no");
			}else {
				System.out.println(orginal+" is not happy no");
			}

		}
	}

