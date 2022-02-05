package javaProgrammingQuestions_SDET;

import java.util.Scanner;

public class P27_CountTheWords {

	public static void main(String[] args) {

		//Approach-1: java built in function
		
	/*	String x = "Selenium WebDriver Java TestNG";
		String y[] = x.split(" ");
		System.out.println("Total word is: " + y.length); */

		
		//Approach-2: using scanner class
		
		System.out.println("Enter the string:");
		Scanner sc=new Scanner (System.in);
		
		String s = sc.nextLine(); // Welcome to Java

		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a string: " + count);
	}
}
