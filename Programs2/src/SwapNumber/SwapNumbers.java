package SwapNumber;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		System.out.println("Enter x and y:");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.println("Before swaping\nx="+x+"\ny="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After swaping\nx="+x+"\ny="+y);

	}

}
