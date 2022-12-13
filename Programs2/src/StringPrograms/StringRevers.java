package StringPrograms;

import java.util.Scanner;

public class StringRevers {

	public static void main(String[] args) {
		//Case1();
		//Case2();
		Case3();
		//Case4();
	}
	static void Case1 (){
		String str="thrinath";
		StringBuilder str2=new StringBuilder();
		str2.append(str);
		str2= str2.reverse();
		System.out.println("using String Build");
		System.out.println("Original word: "+str);
		System.out.println("Reversed word: "+ str2);
	}
	static void Case2() {
		String str= "Sai Govind Raju";
		char chars[]=str.toCharArray();
		System.out.println("\nusing charArry");
		System.out.println("Original word: "+str);
		System.out.println("Reversed word: ");
		for(int i=chars.length-1;i>=0;i--) {
			System.out.print(chars[i]);
		}
	}
	static void Case3() {
		String str;
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("\n\nEnter String to be Reversed");
		str=input.nextLine();
		String[] temp=str.split("");
		System.out.println("using split method");
		System.out.println("Original word: "+str);
		System.out.println("Reversed word: ");
		for(int i =temp.length-1;i>=0;i--) {
			System.out.print(temp[i]+"");
		}
	}
	static void Case4() {
		String original, reverse="";
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("\n\nEnter String to be reversed");
		original=input.nextLine();
		System.out.println("using charAt method");
		System.out.println("Original word: "+original);
		for(int i=original.length()-1;i>=0;i--) {
			reverse=reverse+original.charAt(i);
		}
		System.out.println("Reversed word: "+reverse);

	}

}
