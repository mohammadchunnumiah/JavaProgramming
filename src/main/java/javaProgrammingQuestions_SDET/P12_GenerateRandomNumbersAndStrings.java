package javaProgrammingQuestions_SDET;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class P12_GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {

		// 1. Generate Random Number
		Random rand = new Random();
		int rand_int = rand.nextInt(1000); // range 1 and less than 1000
		System.out.println("Result-1: " + rand_int);

		// 2. Generate Random Decimal number
		double rand_dbl = rand.nextDouble(); // range 0.0 and less than 1.0
		System.out.println("Result-2: " + rand_dbl);

		// 3. Math
		System.out.println("Result-3: " + Math.random());

		// 4. Generate random digits of number
		String randNum = RandomStringUtils.randomNumeric(10);
		System.out.println("Result-4: " + randNum);

		// 5. Generate random string
		String ranStr = RandomStringUtils.randomAlphabetic(10);
		System.out.println("Result-5: " + ranStr);
	}
}

//YouTube link: https://www.youtube.com/watch?v=PXtJtJZdsbU&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=12
// download Apache Lang3 jar: https://commons.apache.org/proper/commons-lang/download_lang.cgi