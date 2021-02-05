package uti;

public class Recursion2 {

	public static void main(String[] args) {
		
		long n = 1234567;
		while (n > 0) {
			System.out.print(n % 10);
			n /= 10;
		}
	}

}
