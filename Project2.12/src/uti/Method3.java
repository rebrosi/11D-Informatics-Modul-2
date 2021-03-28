package uti;

public class Method3 {

	public static void main(String[] args) {
		//T(n) = O(n)
		int[] arr = {1, 2, 4, 4};
		int sum = 8;
		int firstNumber = 0;
		int secondNumber = 0;
		boolean isThereAPair = false;
		int low = 0;
		int high = arr.length - 1;
		while (high >= low) {
			if (arr[high] + arr[low] > sum) {
				high--;
			} else if (arr[high] + arr[low] < sum) {
				low++;
			} else {
				firstNumber = arr[low];
				secondNumber = arr[high];
				isThereAPair = true;
				break;
			}
		}
		if(isThereAPair) {
			System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
		} else {
			System.out.println("A pair was not found");
		}
	}

}
