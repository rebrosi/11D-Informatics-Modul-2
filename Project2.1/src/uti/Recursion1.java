package uti;

import java.util.Scanner;

public class Recursion1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long result = 0;
		for(int j = 1; j <= x; j++) {
			result += j;
		}
		System.out.println(result);
		sc.close();
	}

}
