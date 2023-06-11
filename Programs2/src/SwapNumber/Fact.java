package SwapNumber;

import java.util.Scanner;

public class Fact {
	@SuppressWarnings({ "resource" })
	public static void main(String[] agrs) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to calculate Factorial:");
		if(sc.hasNextInt())
		{
			int n=sc.nextInt();
			if(n>=0) {
				double fact=factorial(n);
				System.out.printf("The Factorial of %d is:"+fact,n);
			}
			else {
				System.out.println("input must be>0");
			}
		}
		else {
			
			System.out.println("Not a valid input");
		}

	}
	
	public static double factorial(int n) {
		double result = 1;
		if(n==0) {
			return result;
		}
		else {
			for(int i=1;i<=n;i++) {
				result*=i;
			}
			
		}
		return result;
	}
	
}
