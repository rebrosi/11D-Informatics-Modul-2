package uti;

import java.util.Scanner;

public abstract class Task2 {

	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Please enter a string: ");
	        String userString = input.next();

	        char[] precedent = new char[userString.length()];
	        precedent[0] = userString.charAt(0);
	        int len = 1;
	        for(int i = 1; i < userString.length(); i++){
	            if(userString.charAt(i) > precedent[len - 1]){
	                precedent[len] = userString.charAt(i);
	                len++;
	            }       
	        }

	        for(int i = 0; i < len; i++)
	            System.out.print(precedent[i]);

	    }
	
}
