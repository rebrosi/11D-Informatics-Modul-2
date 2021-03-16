package uti;

import java.util.Scanner;
import java.util.Stack;

public class Task5Postfix {
	public static void main(String[] args) {
		// Check number of arguments passed
				System.out.println("Enter an expression: ");
				Scanner sc = new Scanner(System.in);
				String expression = sc.nextLine();
				try {
					System.out.println(evaluateExpression(expression));
				} catch (Exception ex) {
					System.out.println("Wrong expression: " + args[0]);
				}

			}

			/** Evaluate an expression */
			public static int evaluateExpression(String expression) {
		// Create Stack 
				Stack<Integer> stack = new Stack<Integer>();
		//Insert blanks around (, ), +, -, /, and * ( 7 + 9  ) * 6
				expression = insertBlanks(expression);
		//Extract operands and operators
				String[] tokens = expression.split(" ");
		//Phase 1: Scan tokens
				for (String token : tokens) {
					if (token.length() == 0) // Blank space
						continue; // Back to the while loop to extract the next token
					else if (token.charAt(0) == '+') {
						processAnOperator(stack, '+');
					} else if (token.charAt(0) == '-') {
						processAnOperator(stack, '-');
					} else if (token.charAt(0) == '*') {
						processAnOperator(stack, '*');
					} else if (token.charAt(0) == '/') {
						processAnOperator(stack, '/');
					} else { // An operand scanned
		//Push an operand to the stack
						stack.push(Integer.valueOf(token));
					}
				}
		//Return the result
				return stack.pop();

			}

			/**
			 * Process one operator: Take an operator from operatorStack and apply it on the
			 * operands in the operandStack
			 */
			public static void processAnOperator(Stack<Integer> stack, char op) {
				//char op = operatorStack.pop();
				int op1 = stack.pop();
				int op2 = stack.pop();
				if (op == '+')
					stack.push(op2 + op1);
				else if (op == '-')
					stack.push(op2 - op1);
				else if (op == '*')
					stack.push(op2 * op1);
				else if (op == '/')
					stack.push(op2 / op1);
			}

			public static String insertBlanks(String s) {
				String result = "";
				for (int i = 0; i < s.length(); i++) {
						if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '-'
							|| s.charAt(i) == '*' || s.charAt(i) == '/')
						result += " " + s.charAt(i) + " ";
					else
						result += s.charAt(i);
				}
				return result;
			}
}
