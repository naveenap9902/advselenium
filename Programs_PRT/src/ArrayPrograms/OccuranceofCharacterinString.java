package ArrayPrograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class OccuranceofCharacterinString {
	public static void main(String[] args) {
		String s="mango";
		HashMap<Character, Integer> a=new HashMap<Character,Integer>();
		char[] c = s.toCharArray();
		for(char x:c)
		{
			if(!a.containsKey(x))
			{
				a.put(x, 1);
			}else {
				int count=a.get(x);
				a.put(x, count+1);
			}
			
		}
		for(Entry<Character, Integer> en : a.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

}
