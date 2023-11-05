package selenium;

import java.util.Scanner;

public class ReverseString {
		
		// TODO Auto-generated method stub

		//Reverse a String
//		
		 public static void main(String[] args) {
//		        Scanner scanner = new Scanner(System.in);
//
//		        System.out.print("Enter a string: ");
//		        String input = scanner.nextLine();
//
//		        if (isPalindrome(input)) {
//		            System.out.println("The input is a palindrome.");
//		        } else {
//		            System.out.println("The input is not a palindrome.");
//		        }
//
//		        scanner.close();
//		    }
//		
//private static boolean isPalindrome(String input) {
//			// TODO Auto-generated method stub
//			return false;
//		}
       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string:");
		String string = sc.nextLine();
		sc.close();
//			 String string = "Sakshi";
		
		char[] c = string.toCharArray();
		String string2= "";
		
		for(int i=string.length()-1;i>=0;i--)
		{
//			string2+=c[i]; 		 
			string2 = string2+c[i];		}
		if(string.equals(string2))	
			{
			 System.out.println("Its Palindrome");
			}
		else {
			System.out.println("Not a Palindrome");
		}
		System.out.println(string2);
		
		
//		 public static boolean main1(String str) {
//			 str = str.replaceAll("\\s", "").toLowerCase();
//		return str.equals(new StringBuilder(str).reverse());
	}

}