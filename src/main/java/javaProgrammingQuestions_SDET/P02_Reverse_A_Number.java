package javaProgrammingQuestions_SDET;

public class P02_Reverse_A_Number {

public static void main(String[] args) {

// 1. Using algorithm
	int num = 1234;
	int rev = 0;

	while (num != 0) 
	{
		rev = rev * 10 + num % 10; 	// 0+1234%10=4  0+123%10=3 	0+12%10=2 	0+1%10=1
		num = num / 10; 	// 1234/10=123 	123/10=12 	12/10=1 	1/10=0
	}
	System.out.println("Reverse Number is: " + rev);

	
// 2. Using StringBuffer class
	int num1 = 1234;
	StringBuffer sb = new StringBuffer(String.valueOf(num1));
	StringBuffer rev1 = sb.reverse();
	System.out.println("Reverse Number is: " + rev1);

	
// 3. Using StringBuilder class
	int num2 = 1234;
	StringBuilder sbl=new StringBuilder(); sbl.append(num2); 
	StringBuilder rev2=sbl.reverse(); 
	System.out.println("Reverse Number is: " + rev2);

	}
}
