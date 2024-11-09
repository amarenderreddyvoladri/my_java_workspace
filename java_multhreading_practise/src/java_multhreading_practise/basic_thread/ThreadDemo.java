package java_multhreading_practise.basic_thread;

//Thread - 1
class Thread1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// our business logic here...
		System.out.println("Iam from Thread 1");
		for (int j = 1; j <= 10; j++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 1 : " + j);
		}
	}
}

//Thread - 2
class Thread2 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// our business logic here...
		System.out.println("Iam from Thread 2");
		for (int k = 11; k <= 20; k++) {
			System.out.println("Thread 2 : " + k);
		}
	}
}

//Thread - 3
class Thread3 extends Thread implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// our business logic here...
		System.out.println("Iam from Thread 3");
		for (int k = 21; k <= 30; k++) {
			System.out.println("Thread 3 : " + k);
		}
	}
}

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {

		// creating objects for both threads here...

		// Thread - 1
		Thread1 t1 = new Thread1();
//		t1.run(); // here it act as a normal method.
		t1.start();
//		t1.join();

		// Thread - 2
		Thread2 t21 = new Thread2();
		Thread t2 = new Thread(t21);
		t2.setPriority(10);
		t2.setPriority(7);
		t2.start();
//		t2.join();

		// Thread - 3
		Thread3 t3 = new Thread3();
		t3.setPriority(Thread.MAX_PRIORITY);
		t3.start();
		t3.join();

	}
}

/*
 * Multi-Threading in java. --------------------------- Two types of creation of
 * threads in java. start() -> run() method to start thread. Thread.sleep()
 * method.
 * 
 * here i want to run the thread t2 after the successful completion thread 1. it
 * can be achieved through t1.join() method.
 * 
 * i want to start the particular thread at first irrespective of its
 * declarations then rest of all...
 * 
 */