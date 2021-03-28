package uti;

public class Method2 {
	public static void main(String[] args) {
		//T(n) = O(nlog(n))
		int[] arr = {1, 2, 4, 4};
		int sum = 8;
		int firstNumber = 0;
		int secondNumber = 0;
		boolean isThereAPair = false;
		for(int i = 0; i < arr.length; i++) {
			if (binarySearch(arr, sum - arr[i])) {
				firstNumber = arr[i];
				secondNumber = sum - arr[i];
				isThereAPair = true;
			}
		}
		if(isThereAPair) {
			System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
		} else {
			System.out.println("A pair was not found");
		}
	}
	public static boolean binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < arr[mid]) {
				high = mid - 1;
			} else if (key == arr[mid]) {
				return true;
			} else {
				low = mid + 1;
			}
		}
		return false;
	}
}
