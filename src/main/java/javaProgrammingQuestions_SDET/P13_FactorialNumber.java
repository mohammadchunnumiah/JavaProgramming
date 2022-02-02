package javaProgrammingQuestions_SDET;

public class P13_FactorialNumber {

	public static void main(String[] args) {

		int num = 5;
		long factorial = 1;

		// Approach-1: 5!=1*2*3*4*5=120
		for (int i = 1; i <= num; i++) 
		{
			factorial = factorial * i;
		}

		// Approach-2: 5!=5*4*3*2*1=120
//		for (int i = num; i >= 1; i--) 
//		{
//			factorial = factorial * i;
//		}

		System.out.println("Factorial of Number: " + factorial);

	}

}
