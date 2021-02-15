package uti;

public class TailRecursion2 {

	public static void main(String[] args) {
		System.out.println("Sum is " + optimiziedXMethod(5, 1));
		System.out.println("Sum is " + xMethod(5));

	}

	public static int optimiziedXMethod(int n, int result) {
		if (n == 1)
			return result;
		else
			return optimiziedXMethod(n - 1, result + n);
	}
	
	public static int xMethod(int n) {
	   	 if (n == 1)
	   		 return 1;
	   	 else
	   		 return n + xMethod(n - 1);
	}

}
