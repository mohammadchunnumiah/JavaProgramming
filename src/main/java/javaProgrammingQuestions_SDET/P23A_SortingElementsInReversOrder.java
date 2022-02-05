package javaProgrammingQuestions_SDET;

import java.util.Arrays;
import java.util.Collections;

public class P23A_SortingElementsInReversOrder {

	public static void main(String[] args) {

		// Sorting elements in Descending order
		Integer a[] = { 40, 90, 30, 50, 20, 10, 70 };
		System.out.println("Arrays elements before descending order " + Arrays.toString(a));
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Arrays elements after descending order " + Arrays.toString(a));
	}

}
