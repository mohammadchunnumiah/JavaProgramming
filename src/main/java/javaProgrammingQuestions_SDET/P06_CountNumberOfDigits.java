package javaProgrammingQuestions_SDET;

public class P06_CountNumberOfDigits {

	public static void main(String[] args) {

		int num = 845446689;
		int count = 0;

		while (num > 0) 
		{
			num = num / 10;
			count++;
		}
		System.out.println("Total number of digits: " + count);
	}
}
