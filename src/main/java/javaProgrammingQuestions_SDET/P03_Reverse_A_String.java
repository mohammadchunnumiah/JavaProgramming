package javaProgrammingQuestions_SDET;

public class P03_Reverse_A_String {

	public static void main(String[] args) {

	// Approach1: using loop
		String str = "MOHAMMAD MIAH";
		String rev = "";

		int len = str.length();

		for (int i=len-1; i>=0; i--) 
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Revered string is: " + rev);

		
	// Approach2: Using StringBuffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Revered string is: " + sb.reverse());
	}
}
