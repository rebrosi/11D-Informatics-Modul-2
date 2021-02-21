package uti;

import java.util.Scanner;

public class Task1TestGenericStack {
	public static void main(String[] args) {
		// Create a Scanner
		//Task1GenericStack<String> stack1 = new Task1GenericStack<>();
		String[] stack1 = new String[3];
//		stack1.push("London");
//		stack1.push("Paris");
//		stack1.push("Berlin");
//		System.out.println(stack1.peek());
//		System.out.println(stack1.pop());
//		System.out.println(stack1.peek());
		
		Task1GenericStack<Integer> stack2 = new Task1GenericStack<>();
		stack2.push(1); // autoboxing 1 to new Integer(1)
		stack2.push(2);
		stack2.push(3);
	}
	
//	stack1.push("Berlin");
}