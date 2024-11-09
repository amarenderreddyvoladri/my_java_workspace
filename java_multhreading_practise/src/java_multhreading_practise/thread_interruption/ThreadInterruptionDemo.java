package java_multhreading_practise.thread_interruption;

class ThreadInterruptionDemo extends Thread {

	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		} catch (InterruptedException e) {
			System.out.println("Exception handled " + e);
		}
		System.out.println("thread is running...");
	}

	public static void main(String args[]) {

		ThreadInterruptionDemo t1 = new ThreadInterruptionDemo();
		t1.start();

		System.out.println(t1.isInterrupted());
		t1.interrupt();
		System.out.println(t1.isInterrupted());
	}
}

/*
 * if we use interrupt() method + sleep() method on thread object then it stop
 * thread working. if we use it without any cause of interruption it behaves
 * normally without any exception.
 */
