package javaProgrammingQuestions_SDET;

public class P04_PalindromeNumber {

	public static void main(String[] args) {

		int num = 7570;
		int ori_num = num;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		if (ori_num == rev) {
			System.out.println(ori_num + " <-- Palindrom Number");
		} else {
			System.out.println(ori_num + " <-- Not a Palindrom Number");
		}
	}
}
