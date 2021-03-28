package uti;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, String> map = new HashMap<String, String>();
		map.put("Bulgaria", "Sofia");
		map.put("Germany", "Berlin");
		map.put("Switzerland", "Bern");
		map.put("Slovakia", "Bratislava");
		map.put("Egypt", "Cairo");
		map.put("Ireland", "Dublin");
		map.put("India", "New Delhi");
		map.put("France", "Paris");
		map.put("Italy", "Rome");
		map.put("Sweden", "Stockholm");
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		int points = 0;
		for (Entry<String, String> entry : entrySet) {
			System.out.println("Which is the capital of " + entry.getKey());
			String capital = sc.nextLine();
			if (capital.equals(entry.getValue())) {
				System.out.println("You are right! You get one point");
				points++;
			} else {
				System.out.println("You are wrong! You lose one point");
				points--;
			}
		}
		System.out.println("Your final score is " + points);
	}
}
