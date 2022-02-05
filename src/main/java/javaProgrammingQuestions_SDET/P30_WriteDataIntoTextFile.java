package javaProgrammingQuestions_SDET;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class P30_WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\MiahWorkspace\\AutomationJava\\TestToWrite.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Selenium with Java");
		bw.write("Selenium with Python");
		bw.write("Selenium with C#");

		System.out.println("Finished writing");
		bw.close();
	}
}
