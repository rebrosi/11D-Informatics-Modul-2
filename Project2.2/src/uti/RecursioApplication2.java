package uti;

import java.util.Scanner;

public class RecursioApplication2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		String str = dec2Bin(value);
        System.out.println(str);
        sc.close();
	}
	
	public static String dec2Bin(int value) {
		if (value == 1) {
			return "1";
		} 
		return dec2Bin(value / 2) + value % 2;
	}

}
