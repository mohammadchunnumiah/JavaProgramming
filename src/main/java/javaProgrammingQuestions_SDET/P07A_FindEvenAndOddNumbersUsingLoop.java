package javaProgrammingQuestions_SDET;

public class P07A_FindEvenAndOddNumbersUsingLoop {

	public static void main(String[] args) {

		// Find out EVEN number
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}

		System.out.println("===================================");
		// Find out ODD number

		for (int j = 1; j <= 10; j++) {
			if (j % 2 != 0) {
				continue;
			}
			System.out.println(j);
		}

	}

}
