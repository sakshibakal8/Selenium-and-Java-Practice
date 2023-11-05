package selenium;

import java.util.Arrays;

import javax.swing.text.AbstractDocument;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		System.out.println("Original Array");
		
		Arrays.sort(num);
		
		for(int i = num.length-1;i>=0;i--)
		{
			System.out.println(num[i]);
		}
		
	}



}
