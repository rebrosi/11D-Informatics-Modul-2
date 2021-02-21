package uti;

import java.util.Scanner;

public class Task2TestGenericStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task2GenericStack<String> stack1 = new Task2GenericStack<>();
		System.out.println("Please enter 5 strings");
		stack1.push(sc.next());
		stack1.push(sc.next());
		stack1.push(sc.next());
		stack1.push(sc.next());
		stack1.push(sc.next());
		stack1.pop();
		stack1.pop();
		stack1.pop();
		stack1.pop();
		stack1.pop();
		
		Task2GenericStack<Integer> stack2 = new Task2GenericStack<>();
		stack2.push(1); // autoboxing 1 to new Integer(1)
		stack2.push(2);
		stack2.push(3);
	}
	
//	stack1.push("Berlin");
}