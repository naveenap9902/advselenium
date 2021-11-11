package TakesScreenshots;

import java.util.Date;

public class Fetchsysdate {
	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d);
		String d1 = d.toString();
		String d3 = d1.replaceAll(":","-");
		System.out.println(d3);		
}
}
