package selenium;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,7,3,9,5,2,6,8,1};
		
		System.out.println("Array Before Sorting:" + Arrays.toString(a));
		
		int l = a.length;
		
		for(int i=0; i<l-1; i++)
		{
			for(int j=0; j<l-1 ;j++)
			{
				if(a[j]>a[j+1]) 
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		
		System.out.println("Array After Sorting:" + Arrays.toString(a));

	}

}
