package uti;

public class Method1 {

	public static void main(String[] args) {
		// T(n) = O(n^2)
		int[] arr = {1, 2, 4, 4};
		int sum = 8;
		int firstNumber = 0;
		int secondNumber = 0;
		boolean isThereAPair = false;
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					firstNumber = arr[i];
					secondNumber = arr[j];
					isThereAPair = true;
				}
			}
		}
		if(isThereAPair) {
			System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
		} else {
			System.out.println("A pair was not found");
		}
	}

}
