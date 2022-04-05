package javaProgrammingQuestions_SDET;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class P29_ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		// Approach1: using FileReader & BufferReader

		FileReader fr = new FileReader("C:\\Users\\MiahWorkspace\\AutomationJava\\Test.txt");
		BufferedReader br = new BufferedReader(fr);

		String str;

		while ((str = br.readLine()) != null) 
		{
			System.out.println(str);
		}
		br.close();  

//===============================================================		
		
		//Approach2: use Scanner class
	/*	
		File file = new File("C:\\Users\\MiahWorkspace\\AutomationJava\\Test.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) 
		{
			System.out.println(sc.nextLine());
		} 
		*/

//===============================================================	
		
		//Approach3: Use Delimiter with Scanner class
		
/*		File file = new File("C:\\Users\\MiahWorkspace\\AutomationJava\\Test.txt");
		Scanner sc = new Scanner(file);
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());  */
		
	}
}
