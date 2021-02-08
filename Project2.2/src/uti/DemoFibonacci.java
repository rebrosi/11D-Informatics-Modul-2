package uti;

import java.util.Scanner;

public class DemoFibonacci {

	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an index for a Fibonacci number: ");
		int index = input.nextInt();
		// Find and display the Fibonacci number
		System.out.println("The Fibonacci number at index " + index + " is " + fib(index));
	}

	/** The method for finding the Fibonacci number */
	public static long fib(long index) {
		if (index == 0) // Base case
			return 0;
		else if (index == 1) // Base case
			return 1;
		else // Reduction and recursive calls
			return fib(index - 1) + fib(index - 2);
	}

	public static int fibonacciLoop(int nthNumber) {
		// use loop
		int previouspreviousNumber, previousNumber = 0, currentNumber = 1;

		for (int i = 1; i < nthNumber; i++) {
			previouspreviousNumber = previousNumber;
			previousNumber = currentNumber;
			currentNumber = previouspreviousNumber + previousNumber;
		}
		return currentNumber;
	}
}
