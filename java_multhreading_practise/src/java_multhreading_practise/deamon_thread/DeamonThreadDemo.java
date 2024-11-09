package java_multhreading_practise.deamon_thread;

class ThreadDemo extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub.
		if (Thread.currentThread().isDaemon()) {
			System.out.println("DEamon Thread working......");
		} else {
			System.out.println("User Thread working......");
		}
	}
}

public class DeamonThreadDemo {

	public static void main(String[] args) {
		
		ThreadDemo td1 = new ThreadDemo(), td2 = new ThreadDemo();

		td2.setDaemon(true);
		td1.start();
		td2.start();
	}
}

Number
