package uti;

import java.util.Scanner;

public class TailRecursion4 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3};
		System.out.println(average(array, 0, 0));
	}
	public static double average(int[] array, int i, int sum) {
		if (i == array.length) {
			return (double) (sum / array.length);
		} else {
			return average(array, i + 1, sum + array[i]);
		}
	}
}
