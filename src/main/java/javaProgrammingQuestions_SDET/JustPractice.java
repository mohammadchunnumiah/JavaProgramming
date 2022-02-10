package javaProgrammingQuestions_SDET;

import java.util.Scanner;

public class JustPractice {

	public static void main(String[] args) {

//		Scanner sc=new Scanner (System.in);
//		System.out.println("Enter a Number");
//		
//		int num =sc.nextInt();


		int n=7570;
		int mn=n;
		int r=0;
		
		while(n!=0) {
			r=r*10 + n%10;
			n=n/10;
		}
		if(mn==r) {
			System.out.println(mn + " palindrom ");
		}
		else {
			System.out.println(mn + " not palindrom ");
		}
	}
}
