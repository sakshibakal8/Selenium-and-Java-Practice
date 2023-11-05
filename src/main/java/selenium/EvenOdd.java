package selenium;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] s = {1,2,3,4,5,6,7,8,9};
		System.out.println("Even Numbers:");
		for(int i=0; i<s.length;i++) 
		{
			if(s[i]%2==0)
			{
				System.out.println(s[i]);
			}
		}
		
		System.out.println("Odd Numbers:");
		for(int i=0;i<s.length;i++)
		{
			if(s[i]%2!=0)
			{
				System.out.println(s[i]);
			}
		}
	}

}
