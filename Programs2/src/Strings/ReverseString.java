package Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String:");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String str=input.nextLine();
		ReverseString l = new ReverseString();
		//l.charMethod(str);
		l.buildMethod(str);
		
	}
	
	public void charMethod(String str) {
		char[] chars =str.toCharArray();
		System.out.println("Reversed String:");
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
	}
	
	public void buildMethod(String str) {
		StringBuilder str2 = new StringBuilder();
		str2.append(str);
		str2 = str2.reverse();
		System.out.println("Reversed String:\n"+str2);
	}

}
