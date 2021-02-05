package uti;

import java.util.Scanner;

public class Recursion3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//System.out.println(twoNInteration(n));
		System.out.println(twoNRecursion(n));
		sc.close();

	}
	
	public static long twoNInteration(int n) {
		long result = 1;
		while (n > 0) {
			result *= 2;
			n--;
		}
		return result;
	}
	
	public static long twoNRecursion(int n) {
		if (n == 0) {
			return 1;
		} else {
			return 2 * twoNRecursion(n-1);
		}
	}
}
