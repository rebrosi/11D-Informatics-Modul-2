package uti;

import java.util.HashSet;
import java.util.Set;

public class Method4 {
	public static void main(String[] args) {
		//T(n) = O(1)
		int[] arr = {1, 2, 4, 4};
		int sum = 8;
		int firstNumber = 0;
		int secondNumber = 0;
		boolean isThereAPair = false;
		Set <Integer> comp = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (comp.contains(sum - arr[i])) {
				firstNumber = arr[i];
				secondNumber = sum - arr[i];
				isThereAPair = true;
				break;
			} else {
				comp.add(sum - arr[i]);
			}
		}
		if(isThereAPair) {
			System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
		} else {
			System.out.println("A pair was not found");
		}
	}
}
