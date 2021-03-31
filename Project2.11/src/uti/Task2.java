package uti;

import java.util.LinkedList;
import java.util.Scanner;

public abstract class Task2 {

	public static void main(String[] args) {
			//T(n) = O(n^2)
	        Scanner input = new Scanner(System.in);
	        System.out.println("Please enter a string: ");
	        String userString = input.next();
	        
	        LinkedList <Character> max = new LinkedList<>();
	        LinkedList <Character> list = new LinkedList<>();
	        for(int i = 0; i < userString.length(); i++){
	        	list.add(userString.charAt(i));
	        	for (int j = i + 1; j < userString.length(); j++) {
	        		if (userString.charAt(j) > list.getLast()) {
	        			list.add(userString.charAt(j));
	        		}
	        	}
	        	if(list.size() > max.size()) {
	        		max.clear();
	        		max.addAll(list);
	        	}
	        	list.clear();
	        }
	        System.out.println(max.toString());
	        
	    }
	
}
