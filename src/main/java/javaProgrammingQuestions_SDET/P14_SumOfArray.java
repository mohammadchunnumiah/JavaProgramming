package javaProgrammingQuestions_SDET;

public class P14_SumOfArray {

	public static void main(String[] args) {

		// Initialize array
		int a[] = { 1, 2, 3, 4, 5 };
		int sum = 0;
		
		// Loop through the array to calculate sum of elements
		for (int i = 0; i < a.length; i++) 
		{
			sum = sum + a[i];
		}

		// Enhanced for loop
//		for (int value:a) 
//		{
//			sum=sum+value;
//		} 
		System.out.println("Sum of all the elements of an array: " + sum);
	}
}
