package java_multithreading.pack1;

//using thread class.
class JavaThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i <= 10 ; i++) {	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Java");
		}
	}
}

public class Test{
	public static void main(String[] args) throws InterruptedException {
		
		JavaThread jt = new JavaThread();
		jt.start();// to begin the user defined thread.
		jt.join();
		System.out.println("----------------------------------------");
		
		PythonThread pt = new PythonThread();
		Thread t1 = new Thread(pt);
		t1.start();
		t1.join();
		
		System.out.println("----------------------------------------");
		
		AngularThread at = new AngularThread();
		Thread t3 = new Thread(at);
		t3.start();
		t3.join();
		
		
		for(int i = 0; i <= 10 ; i++) {
			System.out.println("main()");
		}
	
	}
}

class PythonThread extends Programming implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// Runnable is Functional Interface it has only one method called run() which is abstract. That should be compulsory implemented to override 
		for(int i = 0; i <= 10 ; i++) {
			System.out.println("python");
		}		
	}	
}

// Programming class is used to get the best approach of thread.
class Programming{
	
}

// thread priority
class AngularThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i <= 10 ; i++) {
			System.out.println("Angular");
		}
	}
	
}

