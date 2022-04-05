package javaProgrammingQuestions_SDET;

public class P17_FindMissingNumberInArray {

	public static void main(String[] args) {

		// Array should not have duplicates
		// Array no need to be sorted order
		// Values should be in range

		int a[] = { 1, 2, 4, 5 };

		// 1+2+4+5=12 sum1
		// 1+2+3+4+5=15 sum2

		int sum1 = 0;

		for (int i = 0; i < a.length; i++) 
		{
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of elements in array: " + sum1);

		int sum2 = 0;
		for (int i = 0; i <= 5; i++)
		{
			sum2 = sum2 + i;
		}
		System.out.println("Sum of range of elements in array: " + sum2);
		System.out.println("Missing number of elements: " + (sum2 - sum1));
	}
}
