package java_multithreading.InterThreadCommunication;

class BahubaliThread extends Thread{
	
	int total = 0;
	
	@Override	
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0 ; i <= 100 ; i++) {
			total += i;
		}
		
		System.out.println("2. BahubaliThread begins calicaulation...");
		
		synchronized (this) {
			this.notify();
		}
		System.out.println("3. BahubaliThread completed calicaulation	 ......");
	}
}

public class InterThread {
	
	public static void main(String[] args) throws InterruptedException {
		// by default main thread.
		
		BahubaliThread bt = new BahubaliThread();
		bt.start();
		
		//main thread.
//		Thread.sleep(10000);
		// train example for sleep method.
		
//		bt.join();
		// job mail example.
		
		Thread.sleep(10000);
		
		
		// here we want to execute 
//		bt.wait(); //we should not call wait() method directly.
		System.out.println("1. Wait() method called BahubaliThread from main thread.");
		synchronized (bt) {
			bt.notify();
		}
//		System.out.println("4. Main thread gets notification from Bahubalithread ....main executes....");
		
		System.out.println(bt.total);
	}
}
