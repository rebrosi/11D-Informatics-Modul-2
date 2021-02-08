package uti;

import java.util.Scanner;

public class RecursioApplication2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		String str = dec2Bin(value); 
        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println(sbr);
        sc.close();
	}
	
	public static String dec2Bin(int value) {
		if (value == 0) {
			return "0";
		} 
		return value % 2 + dec2Bin(value / 2);
	}

}
