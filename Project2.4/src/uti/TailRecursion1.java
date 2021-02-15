package uti;

import java.util.Scanner;

public class TailRecursion1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(foo(x, y));
	}
	public static int foo (int x, int y){
		System.out.println("x: " + x + " y: " + y);
	   	if (y == 0)
	   		return x;
	   	else
	   		return foo(y, x % y);
	}

}
