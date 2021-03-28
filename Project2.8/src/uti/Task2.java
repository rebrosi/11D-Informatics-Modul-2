package uti;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Stack;

public class Task2 {
	public static String content;
	public static void main(String[] args) {
		Stack<Character> brackets = new Stack<Character>();
		String path = "C:\\My things\\School\\Informatics\\workspace\\Project2.8\\src\\bracketsfile.txt";
		try {
            content = Files.readString(Paths.get(path));
            //System.out.println(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
		boolean areTheBracketsRight = true;
		for (int i = 0; i < content.length(); i++) {
			if (content.charAt(i) == '(' || content.charAt(i) == '{' ||  content.charAt(i) == '[') {
				brackets.push(content.charAt(i));
			} else if (content.charAt(i) == ')') {
				if (brackets.peek() == '(') {
					brackets.pop();
				} else {
					areTheBracketsRight = false;
					break;
				}
			} else if (content.charAt(i) == '}') {
				if (brackets.peek() == '{') {
					brackets.pop();
				} else {
					areTheBracketsRight = false;
					break;
				}
			} else if (content.charAt(i) == ']') {
				if (brackets.peek() == '[') {
					brackets.pop();
				} else {
					areTheBracketsRight = false;
					break;
				}
			}
		}
		if(areTheBracketsRight && brackets.isEmpty()) {
			System.out.println("Right brackets");
		} else {
			System.out.println("Wrong brackets");
		}
	}
}

