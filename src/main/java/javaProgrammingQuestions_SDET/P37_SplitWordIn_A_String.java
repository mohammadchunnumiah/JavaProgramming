package javaProgrammingQuestions_SDET;

public class P37_SplitWordIn_A_String {

	public static void main(String[] args) {

		String str = "I love Java Programming";

		String word[] = str.split(" ");

		for (Object w : word)   // Object data type can hold any kind of values (String, Integer, Char etc.)
			System.out.println(w);
	}
}
