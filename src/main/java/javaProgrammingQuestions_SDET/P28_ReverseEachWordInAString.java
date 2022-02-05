package javaProgrammingQuestions_SDET;

public class P28_ReverseEachWordInAString {

	public static void main(String[] args) {

		String str = "Welcome to Java Selenium";
		String words[] = str.split("\\s");

		String reversword = "";

		for (String w : words) 
		{
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();

			reversword = reversword + sb.toString() + " ";
		}
		System.out.println(reversword);
	}
}
