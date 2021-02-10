package uti;

import java.util.Scanner;

public class RecursionApplication3 {
	public static int numberOfMoves = 0;
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of disks: ");
		int n = input.nextInt();
		// Find the solution recursively
		System.out.println("The moves are:");
		moveDisks(n, 'A', 'B', 'C');
		System.out.println("The number of moves is " + numberOfMoves);
	}

	/**
	 * The method for finding the solution to move n disks from fromTower to toTower
	 * with auxTower
	 */
	public static void moveDisks(int n, char fromTower, char toTower, char auxTower) {
		if (n == 1) { // Stopping condition
			System.out.println("Move disk " + n + " from "+ fromTower + " to " + toTower);
			numberOfMoves++;
		}else {
			
			moveDisks(n - 1, fromTower, auxTower, toTower);
			System.out.println("Move disk " + n + " from " + fromTower + " to " + toTower);
			numberOfMoves++;
			moveDisks(n - 1, auxTower, toTower, fromTower);
		}
	}
}