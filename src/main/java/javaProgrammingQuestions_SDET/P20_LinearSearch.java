package javaProgrammingQuestions_SDET;

public class P20_LinearSearch {

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 50, 40 };

		int search_elm = 40;
		boolean flag = false;

		for (int i = 0; i < a.length; i++) 
		{
			if (search_elm == a[i]) 
			{
				System.out.println("Element found at position: " + i);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Element not found");
		}
	}

}
