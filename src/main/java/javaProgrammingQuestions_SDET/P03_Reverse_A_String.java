package javaProgrammingQuestions_SDET;

public class P03_Reverse_A_String {

	public static void main(String[] args) {

		String str = "MOHAMMAD MIAH";
//		String rev = "";

		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
