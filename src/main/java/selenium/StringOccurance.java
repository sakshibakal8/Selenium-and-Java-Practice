package selenium;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Find Occurance of each character
		String Flowers = "ppp";
		
		char[] ch = Flowers.toCharArray();
		
		Map<Character , Integer> hMap = new HashMap<Character, Integer>();
		
//		hMap.put('A',2);
//		hMap.put('A',4);
		
		for(int i =0;i<ch.length;i++) 
		{
//		 hMap.containsKey(ch[0]);
		 boolean b = hMap.containsKey(ch[i]);
		 if(b==false)
		 {

				hMap.put(ch[i],1);
		 }
			 		 
		
		else {
			 int m=hMap.get(ch[i]);
			 hMap.put(ch[i],m+1);
		}

		}
		System.out.println(hMap.get('p')+"Count i");
	}

}
