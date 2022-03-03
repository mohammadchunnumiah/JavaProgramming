package javaProgrammingQuestions_SDET;

public class P39_FirstNonRepeatedChar {

	public static void main(String[] args) {
		String s1 = "An interconnected healthcare universe";

		char[] chars = s1.toLowerCase().toCharArray();
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