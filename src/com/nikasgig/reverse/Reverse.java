package com.nikasgig.reverse;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		System.out.println("Welcome");
		String text;
		Scanner in = new Scanner(System.in);
		boolean var = true;
		
		while(var) { // do endless cycle
			System.out.print("Enter your text for reverse: ");
			text = in.nextLine();
		
			function(text);
		}
		
	}
	static void function(String text) {
		
		// We use StringBuffer for our task
		StringBuffer text2 = new StringBuffer(text);
		System.out.println(text2.reverse());
		
		
	}
	
}