package javaProgrammingQuestions_SDET;

public class P38_JumpingAndContinueStatements {

	public static void main(String[] args) {

		// using break
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		
		

		System.out.println("--------------------------------");

		// using continue to skip some number
		// || is OR operator
		for (int j = 1; j <= 10; j++) {
			if (j == 5) {
//			if (j == 5 || j == 6 || j == 8) {    //using or (||) operator this time will skip 5, 6, 7
				continue;
			}
			System.out.println(j);
		}

	}

}
