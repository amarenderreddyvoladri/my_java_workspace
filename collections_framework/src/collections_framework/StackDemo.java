package collections_framework;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		stack.push("Four");
		stack.push("Five");
		
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
		System.out.println(stack.peek());
		System.out.println(stack);
	}
}
