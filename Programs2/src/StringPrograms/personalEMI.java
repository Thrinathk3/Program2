package StringPrograms;

import java.util.Scanner;

public class personalEMI {

	public static void main(String[] args) {
	
			float p ,t=0,te;
			float r, s, top, bot,z,emi,q,total,interest;
			System.out.println("EMI Calculator Prepared by Thrinath");
			System.out.println("Enter Principa Amount (P):");
			try (Scanner inputt = new Scanner(System.in)) {
				p =inputt.nextFloat();
				System.out.println("Enter Tenture (T):");
				te=inputt.nextFloat();
				System.out.println("Select Tenture Type\n1.Months\n2.Years");
				z=inputt.nextFloat();
				if(z==1)
				{
					t=te;
				}
				else if(z==2)
				{
					t=te*12;
				}
				else
				{
					System.out.println("invalid Tenture type");
					System.exit(0);
				}
				System.out.println("Enter Rate of Interest (R):");
				r =inputt.nextFloat();
			}

			if (r==0)
			{
				emi=p/t;
				total=emi*t;
				interest=total-p;
				System.out.println("Monthly EMI   : "+ Math.round(emi));
				System.out.println("\nTotal Interest: "+ Math.round(interest));
				System.out.println("\nTotal Payable : "+ Math.round(total));
			}
			else{
				s=r/12/100; //ROI converting
				z=1+s; 
				q= (float) Math.pow (z,t);
				top=p*s*q;
				bot=q-1;
				emi=top/bot;
				total=emi*t;
				interest=total-p;
				System.out.println("Monthly EMI   : "+ Math.round(emi));
				System.out.println("\nTotal Interest: "+ Math.round(interest));
				System.out.println("\nTotal Payable : "+ Math.round(total));
			}
		}
	}


