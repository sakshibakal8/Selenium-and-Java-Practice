package selenium;

import java.util.Arrays;

public class Ana {

	public static Boolean toAnagram(String str1 , String str2) 
	{

		 str1 =str1.replaceAll("\\s", "").toLowerCase();
		 str2 =str2.replaceAll("\\s", "").toLowerCase();

		 
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
    return Arrays.equals(ch1, ch2);
	}

	public static void main(String args[]) 
	{
		boolean b1 =toAnagram("Sa k  shi", "Siksha");
		System.out.println(b1);
		
	}
}
