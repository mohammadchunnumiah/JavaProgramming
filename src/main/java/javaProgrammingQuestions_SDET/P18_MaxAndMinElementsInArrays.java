package javaProgrammingQuestions_SDET;

public class P18_MaxAndMinElementsInArrays {

	public static void main(String[] args) {

		//Find out maximum value in array.
/*		int a[] = { 50, 30, 60, 30, 10, 5 };
		int max = a[0];

		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
		}
		System.out.println("Maximum element in array is : " + max);
*/		
		//Find out minimum value in array.
		int a[] = { 50, 30, 60, 30, 10, 5 };
		int min = a[0];

		for (int i = 1; i < a.length; i++) 
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println("Minimum element in array is : " + min);
}
}
