package uti;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
	//static String content;
	public static void main(String[] args) {
		//Scanner sc = new Scanner(Task1.class.getResorceAsStream("lemons.txt"));
		String path = "C:\\My things\\School\\Informatics\\workspace\\Project2.9\\src\\uti\\lemons.txt";
		String content = "";
        try {
            content = Files.readString(Paths.get(path));
            //System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String text = content.toUpperCase();
        String[] finalText = text.split("(?!^)");
		int vowelsCount = 0;
		int consonantsCount = 0;
		String[] vowels = { "A", "E", "I", "O", "U" };
		Set<String> vowelsSet = new HashSet<String>(Arrays.asList(vowels));
		String[] consonants = { "B", "C", "D", "F", "G", "J", "K", "L", "M", "N", "P", "Q", "S", "T", "V", "X", "Z", "H", "R", "W", "Y"};
		Set<String> consonantsSet = new HashSet<String>(Arrays.asList(consonants));
		for(int i = 0; i < finalText.length; i++) {
			if (vowelsSet.contains(finalText[i])) {
				vowelsCount++;
			} else if (consonantsSet.contains(finalText[i])) {
				consonantsCount++;
			}
		}
		System.out.println("The number of vowels is " + vowelsCount + " and the number of consonants is " + consonantsCount);
				
		}
	}

