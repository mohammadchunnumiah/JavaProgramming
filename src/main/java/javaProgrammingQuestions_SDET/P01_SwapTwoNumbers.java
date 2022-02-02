package javaProgrammingQuestions_SDET;

public class P01_SwapTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swap the value a= " + a);
		System.out.println("Before swap the value b= " + b);
		a = a + b; // 10+20=30
		b = a - b; // 30-20=10
		a = a - b; // 30-10=20
		System.out.println("---------------------------");
		System.out.println("After swap the value a= " + a);
		System.out.println("After swap the value b= " + b);
	}
}
