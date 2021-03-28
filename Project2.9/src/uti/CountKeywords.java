package uti;

import java.util.*;
import java.io.*;

public class CountKeywords {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\My things\\School\\Informatics\\workspace\\Project2.8\\src\\uti\\BallComparator.java");
		if (file.exists()) {
			System.out.println("The number of keywords is " + countKeywords(file));
		} else {
			System.out.println("File does not exist");
		}

	}

	public static int countKeywords(File file) throws Exception {
// Array of all Java keywords + true, false and null
		String[] keywordString = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
				"const", "continue", "default", "do", "double", "else", "enum", "extends", "for", "final", "finally",
				"float", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native",
				"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
				"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
				"true", "false", "null" };
		Set<String> keywordSet = new HashSet<String>(Arrays.asList(keywordString));
		int count = 0;

		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String word = input.next();
			if (keywordSet.contains(word))
				count++;
		}
		return count;
	}
}
