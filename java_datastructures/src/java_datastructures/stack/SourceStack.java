package java_datastructures.stack;

public class SourceStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CharStack charstack = new CharStack(5);

		charstack.push('a');
		charstack.push('e');
		charstack.push('i');
		charstack.push('o');
		charstack.push('u');

		System.out.println("Top of the Stack : " + charstack.peek());

		charstack.pop();

		System.out.println("Top of the Stack after one remove: " + charstack.peek());

		System.out.println("Number of CharStack instance created : " + CharStack.getInstanceCount());

		charstack.pop();
		charstack.pop();
		System.out.println("Top of the Stack after one remove: " + charstack.peek());

		System.out.println("Number of CharStack instance created : " + CharStack.getInstanceCount());

	}

}
