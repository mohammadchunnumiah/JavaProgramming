package javaProgrammingQuestions_SDET;

public class P07_CountEvenAndOddDigits {

	public static void main(String[] args) {

		int num = 123247891;
		int even_count = 0;
		int odd_count = 0;

		while (num > 0) 
		{
			int remining = num % 10;

			if (remining % 2 == 0) 
			{
				even_count++;
			} 
			else 
			{
				odd_count++;
			}
			num = num / 10;
		}
		System.out.println("Total Even Number : " +even_count);
		System.out.println("Total Odd Number : " +odd_count);

	}

}
