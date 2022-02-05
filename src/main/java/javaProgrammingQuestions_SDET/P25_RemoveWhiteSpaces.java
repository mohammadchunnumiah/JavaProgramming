package javaProgrammingQuestions_SDET;

public class P25_RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str = "Selenium    automation    with    Java    Language";
		System.out.println("Before removing the white space: " + str);
		str = str.replaceAll("\\s", "");
		System.out.println("After removing the white space: " + str);
	}
}
