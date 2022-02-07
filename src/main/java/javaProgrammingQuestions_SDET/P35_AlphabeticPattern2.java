package javaProgrammingQuestions_SDET;

public class P35_AlphabeticPattern2 {

	public static void main(String[] args) {

//		A 
//		B B 
//		C C C 
//		D D D D 
//		E E E E E 
//		F F F F F F 
			
		int alpha = 65; // 65 is for 'UPPER' letter
	 // int alpha=97; //97 is for 'lower' letter

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) alpha + " ");
			}
			alpha++;
			System.out.println();
		}
	}
}
