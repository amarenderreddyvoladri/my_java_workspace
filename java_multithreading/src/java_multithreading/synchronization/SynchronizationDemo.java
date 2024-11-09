package java_multithreading.synchronization;

class MyMath {
	// Instance method.
	public synchronized void printMulTable(int num) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + "*" + i + " = " + num * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// Static method.
	public static synchronized void printSquares() {
		for (int i = 10; i <= 100; i+=10) {
			System.out.println(i + "*" + i + " = " + i * i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class NTR extends Thread {

	MyMath m;

	public NTR(MyMath m) {
		this.m = m;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		m.printMulTable(10);
	}
}

class RAM extends Thread {

	MyMath m;

	public RAM(MyMath m) {
		this.m = m;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		m.printMulTable(11);
	}
}

class ARJUN extends Thread {

	MyMath m;

	public ARJUN(MyMath m) {
		this.m = m;
	}

	// it is not instance but not synchronized.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		MyMath.printSquares();
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		NTR ntr = new NTR(mm);
		RAM ram = new RAM(mm);
		ARJUN arjun = new ARJUN(mm);

		// start the thread.
		ntr.start();
		ram.start();
		arjun.start();

	}
}
