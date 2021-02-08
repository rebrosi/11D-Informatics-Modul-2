package uti;

import java.math.BigInteger;
import java.util.Scanner;

public class DemoFactoriel {
	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a nonnegative integer: ");
		int n = input.nextInt();
		// Display factorial
		System.out.println("Factorial of " + n + " is " + factorialRecursive(n));
	}

	/** Return the factorial for the specified number */
	public static long factorialRecursive(int n) {
		if (n == 0) // Base case
			return 1;
		else
			return n * factorialRecursive(n - 1); // Recursive call
	}

	public static long factorialItearative(int n) {
		long product = 1;
		for (int j = 1; j <= n; j++)
			product *= j;
		return product;
	}
}
