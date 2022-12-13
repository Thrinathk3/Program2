package StringPrograms;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z;
		double a,b,c,d,e,s;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Select type of Triangle Area Calculation\n"
							+"1. With Height and berth values\n"
							+"2. With three side values");
		z=sc.nextInt();
		if (z==1) {
			System.out.println("enter Height value (h) :");
			a=sc.nextDouble();
			System.out.println("enter berth side value (b) :");
			b=sc.nextDouble();
			c=((a*b)/2);
			System.out.println("Area of Triangle(a) = "+c+"(in links)");
		}
		else if(z==2) {
		System.out.println("enter a side value:");
		a=sc.nextDouble();
		System.out.println("enter b side value:");
		b=sc.nextDouble();
		System.out.println("enter c side value:");
		c=sc.nextDouble();
		s= ((a+b+c)/2);
		//System.out.println("Semi peimeter (s) = "+s);
		d=(s*(s-a)*(s-b)*(s-c));
		//System.out.println("d="+d);
		e=Math.sqrt(d);
		System.out.println("Area of Triangle(a) = "+e+"(in links)");
		}
		else {
			System.out.println("Invalid Selection");
		}
	}

}
