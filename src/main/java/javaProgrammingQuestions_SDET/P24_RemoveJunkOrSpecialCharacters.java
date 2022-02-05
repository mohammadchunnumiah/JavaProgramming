package javaProgrammingQuestions_SDET;

public class P24_RemoveJunkOrSpecialCharacters {

	public static void main(String[] args) {

		String str = "Seleni&&um, Ja@@@@@va, %T#$est*N&G, >>>M@@av+n&";

		String s = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}
}
