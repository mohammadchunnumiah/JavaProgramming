package javaProgrammingQuestions_SDET;

public class P26_CountCharacterOccurrences {

	public static void main(String[] args) {

		String str="Mohammad Chunnu Miah";
		
		int totalCount=str.length();

		int totalCount_afterRemove=str.replace("a", "").length();
		
		int totalcount_a=totalCount-totalCount_afterRemove;
		
		System.out.println("Number occurance of 'a' is: "+totalcount_a);
	}
}
