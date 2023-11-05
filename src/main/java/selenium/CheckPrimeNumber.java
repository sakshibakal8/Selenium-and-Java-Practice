package selenium;

import java.util.Scanner;

public class CheckPrimeNumber {
//It can be prime only if its devisible by one or its own
//	
public static boolean isPrime(int number)
{
	if(number<=1)
	{
		return false;
	}
	for(int i = 2; i<number;i++) 
	{
		if(number % i ==0)
		{
			return false;
		}
	}
	return true;
}
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = sc.nextInt();
		sc.close();
		
		if(isPrime(number))
		{
			System.out.println("Is a prime number");
		}
		else {
			System.out.println("IS not a prime number");
		}
		
	}

}

