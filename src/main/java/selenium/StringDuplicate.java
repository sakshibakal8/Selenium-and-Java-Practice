package selenium;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.devtools.v116.audits.model.SourceCodeLocation;

public class StringDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String seoul = "chappal";
		
		char[] arr = seoul.toCharArray();
		
		Set<Character> ch = new HashSet<Character>();
		
		
		for(int i=0; i<=arr.length ;i++) 
		{
			boolean b=	ch.add(arr[i]);
			if(b==false)
			{
				System.out.println("It has duplicate characters");
			}
			
		}
		

	}

}
