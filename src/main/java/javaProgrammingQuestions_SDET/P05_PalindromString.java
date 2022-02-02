package javaProgrammingQuestions_SDET;

import java.util.Scanner;

public class P05_PalindromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");

		String str = sc.next();
		String ori_str = str;
		String rev = "";

		int len = str.length();

		for (int i=len-1; i>=0; i--) 
		{
			rev = rev + str.charAt(i);
		}

		if (ori_str.equals(rev)) 
		{
			System.out.println(ori_str + " --is a Palindrome String");
		} 
		else 
		{
			System.out.println(ori_str + " --is not a Palindrome String");
		}
	}
}

//Some Palindrome Words
// MADAM, NOON, NON, MINIM, TENET, WOW, SOLOS, ROTOR

