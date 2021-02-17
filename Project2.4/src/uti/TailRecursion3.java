package uti;

import java.util.Scanner;

public class TailRecursion3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		int x = sc.nextInt();
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println(powRecursive(x,n));
		//System.out.println(optimizedPowRecursive(x,n,1));
	}

	public static int powRecursive(int x, int n) {

		return optimizedPowRecursive(x, n, 1);
	}
	private static int optimizedPowRecursive(int x, int n, int result) {
		if (n == 0) {
			return result;
		}

		return optimizedPowRecursive(x, n - 1, result * x);
	}

}
