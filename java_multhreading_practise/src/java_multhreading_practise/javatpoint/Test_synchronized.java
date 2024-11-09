package java_multhreading_practise.javatpoint;

import java.util.Scanner;

class Customer {

	// instance field.
	int amount = 10000;

	synchronized void withdraw(int amount) {

		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait();
			} catch (Exception e) {
			}
		}

		this.amount -= amount;

		System.out.println("withdraw completed...");
	}

	synchronized void deposit(int amount) {

		System.out.println("going to deposit...");
		this.amount += amount;
		System.out.println("deposit completed... ");
		notify();
	}
}

class Test_synchronized {
	public static void main(String args[]) {
		// scanner.
		Scanner sc = new Scanner(System.in);

		final Customer c = new Customer();
		
		Thread.currentThread().setPriority(1);
		
		System.out.println("Priority of main() thread : "+Thread.currentThread().getPriority());
		
		new Thread() {
			public void run() {
				System.out.println("Priority of this thread : "+Thread.currentThread().getPriority());

				c.withdraw(15000);
			}
		}.start();
		
		
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();

		sc.close();

	}
}
