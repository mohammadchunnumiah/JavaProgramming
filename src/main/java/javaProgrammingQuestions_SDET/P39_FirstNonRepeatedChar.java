package javaProgrammingQuestions_SDET;

public class P39_FirstNonRepeatedChar {
	
/*Write a function to take input as string and return first character of the input string that is not repeated

Example 1: 
Input: An interconnected healthcare universe
Output: o

Example 2: 
Input: Enhance patient safety and care
Output: h */
	

	public static void main(String[] args) {
		
		String s1 = "An interconnected healthcare universe";
//		String s1 = "Enhance patient safety and care";

		char chars[] = s1.toLowerCase().toCharArray();
		int count;

		for (int i = 0; i < chars.length; i++) 
		{
			count = 0;
			for (int j = i + 1; j < chars.length; j++) 
			{
				if (chars[i] == chars[j]) 
				{
					count++;
					break;
				}
			}
			if (count == 0) 
			{
				System.out.println(chars[i]);
				break;
			}
		}
	}
}