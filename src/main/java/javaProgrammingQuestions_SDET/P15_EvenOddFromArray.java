package javaProgrammingQuestions_SDET;

public class P15_EvenOddFromArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7};
		
/*		//Approach-1. Extracting even numbers
		
		System.out.println("Even numbers in array........");
		for (int i=0; i<a.length; i++)
		{
			if (a[i]%2==0)
				System.out.println(a[i]);
		}
		
		System.out.println("Odd numbers in array........");
		for (int i=0; i<a.length; i++)
		{
			if (a[i]%2!=0)
				System.out.println(a[i]);
		}
*/
		
		//Approach-2: Enhanched for loop
		System.out.println("Even numbers in array........");
		for (int value:a)
		{
			if (value%2==0)
				System.out.println(value);
		}
		System.out.println("Even numbers in array........");
		for (int value:a)
		{
			if (value%2!=0)
				System.out.println(value);
		}
	}
}
