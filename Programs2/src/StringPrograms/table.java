package StringPrograms;

import java.util.Scanner;

public class table {

	public static void main(String[] args) {
		
		//table1();
		number();
	}
	
	public static void table1() {
		int i,j;
		System.out.println("Enter Table which you want : ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		i = input.nextInt();
		for (j=1; j<=10;j++) {
			System.out.println(i + " x " +j+" = " +i*j);
		}
	}
	
	public static void number() {
		int i,j=2;
		System.out.println("Enter number to  calculate odd or even: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		i = input.nextInt();
		if(i%j==0) {
			System.out.println("The given number "+i+" is EVEN");
		}else {
			System.out.println("The given number "+i+" is ODD");
		}
	}

}
