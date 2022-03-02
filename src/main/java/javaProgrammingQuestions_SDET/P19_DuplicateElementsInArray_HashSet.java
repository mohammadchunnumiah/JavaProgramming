package javaProgrammingQuestions_SDET;

import java.util.HashSet;

public class P19_DuplicateElementsInArray_HashSet {

	public static void main(String[] args) {

		String arr[] = { "java", "C", "C++", "Python", "Python", "jaava" };

		HashSet<String> langs = new HashSet();

		boolean flag = false;

		for (String l : arr) 
		{
			if (langs.add(l) == false) 
			{
				System.out.println("Found duplicate element: " + l);
				flag = true;
			}
		}
		if (flag = false) {
			System.out.println("Not found duplicate element: ");
		}

	}
}
