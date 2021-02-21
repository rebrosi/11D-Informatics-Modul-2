package uti;

import java.util.Scanner;

public class Task2TestGenericStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Task2GenericStack<String> stack1 = new Task2GenericStack<>();
		for(int i = 0; i < 5; i++) {
			stack1.push(sc.next());
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(stack1.pop());
		}
	}
	
//	stack1.push("Berlin");
}