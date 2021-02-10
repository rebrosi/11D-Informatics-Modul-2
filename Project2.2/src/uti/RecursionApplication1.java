package uti;

import java.util.Scanner;

public class RecursionApplication1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (odd(x) == 1) {
			System.out.println("The number is odd");
		} else if (odd(x) == 0) {
			System.out.println("The number is even");
		}
	}
	public static int odd(int x) {
		if (x == 1) {
			return 1;
		} else if (x == 0) {
			return 0;
		}
		return odd(x - 2);
	}
	public static int even(int x) {
		if (x == 1) {
			return 1;
		} else if (x == 0) {
			return 0;
		}
		return even(x - 2);
	}
}
