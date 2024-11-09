package java_multithreading.Task;

public class TaskThread  {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int  i  = 0; i >=0 ; i++) {
			Red r = new Red();
			Thread t1 = new Thread(r);
			t1.start();
//			t1.setPriority(1);
			t1.join();
			
			Yellow y = new Yellow();
			Thread t2 = new Thread(y);
			t2.start();
//			t2.setPriority(5);
			t2.join();
			
			Green g = new Green();
			Thread t3 = new Thread(g);
			t3.start();
//			t3.setPriority(10);
			t3.join();
		}
		
	}

}

class Yellow implements Runnable{

	@Override
	public void run() {
		System.out.println("------------------");
		// TODO Auto-generated method stub
		for(int i = 0 ; i <= 5 ; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Yellow");
		}
	}
	
}

class Red extends Thread{

	@Override
	public void run() {
		System.out.println("------------------");
		// TODO Auto-generated method stub
		for(int i = 0 ; i <= 5; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Red");
		}
	}
	
}

class Green implements Runnable{
	

	@Override
	public void run() {
		System.out.println("------------------");
		// TODO Auto-generated method stub
		for(int i = 0 ; i <= 5 ; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Green");
		}
	}
	
}


