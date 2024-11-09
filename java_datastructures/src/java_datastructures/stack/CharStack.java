package java_datastructures.stack;

public class CharStack {
	// Implement Private Properties here
	private char charArray[];
	private int topOfStack;
	private static int counter;

	// Constrctor.
	public CharStack(int capacity) {
		// TODO Auto-generated constructor stub
		charArray = new char[capacity];
		topOfStack = -1;
		counter++;
	}

	public boolean isEmpty() {
		return topOfStack < 0;
	}

	public boolean isFull() {
		return topOfStack == charArray.length - 1;
	}

	public static int getInstanceCount() {
		return counter;
	}

	public void push(char ele) {
		if (!isFull()) {
			charArray[++topOfStack] = ele;
		} else {
			throw new IndexOutOfBoundsException("Stack is Full!");
		}
	}

	public char pop() {
		if (!isEmpty()) {
			return charArray[topOfStack--];
		} else {
			throw new IndexOutOfBoundsException("Stack is Empty!");
		}
	}

	public char peek() {
		if (!isEmpty()) {
			return charArray[topOfStack];
		} else {
			throw new IndexOutOfBoundsException("Stack is Empty!");
		}
	}

}
