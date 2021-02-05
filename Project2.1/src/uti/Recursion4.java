package uti;

import java.util.Scanner;

public class Recursion4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		int n = sc.nextInt();
		//System.out.println(xNInteration(n, x));
		System.out.println(xNRecursion(n, x));
		
	}
	
	public static double xNInteration(int n, double x) {
		double result = 1;
		while (n > 0) {
			result *= x;
			n --;
		}
		return result;
	}
	
	public static double xNRecursion(int n, double x) {
		if (n == 0) {
			return 1;
		} else {
			return x * xNRecursion(n-1, x);
		}
	}

}
