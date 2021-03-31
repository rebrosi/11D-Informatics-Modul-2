package uti;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//T(n) = O(n)
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two strings");
		String first = sc.next();
		String second = sc.next();
		
		int index = -1;
		int count = 0;
		
		for (int i = 0; i < first.length(); i++) {
			if(first.charAt(i) == second.charAt(0) && count == 0) {
				index = i;
				count++;
			} else if (first.charAt(i) == second.charAt(count)) {
				count++;
			} else if (count != 0) {
				count = 0;
				index = -1;
				i--;
			}
			if (count == second.length()) {
				break;
			}
		}
		if (count != second.length()) {
			index = -1;
			count = 0;
		}
		
		if (index > -1) {
			System.out.println("matched at index " + index);
		} else {
			System.out.println("The second string is not a substring of the first one");
		}

	}

}
