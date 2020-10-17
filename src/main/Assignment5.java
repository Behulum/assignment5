package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("File: ");
			String fileName = scanner.next();
			linesWordsChars(fileName);
		}

	}

	private static void linesWordsChars(String fileName) {
		int numberOfLines = 0;
		int numberOfWords = 0;
		int numberOfChars = 0;

		File file = new File(fileName);
		try {
			Scanner fileScanner = new Scanner(file);
			while (fileScanner.hasNextLine()){
				numberOfLines++;
				String line = fileScanner.nextLine();
				numberOfWords += line.split(" ").length;
				numberOfChars += line.length();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Lines = "+numberOfLines);
		System.out.println("Words = "+numberOfWords);
		System.out.println("Chars = "+numberOfChars);

	}

}
