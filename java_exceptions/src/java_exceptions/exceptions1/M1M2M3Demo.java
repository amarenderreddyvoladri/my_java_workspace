package java_exceptions.exceptions1;

public class M1M2M3Demo {

	public void m1() {

		System.out.println("Hello iam stated!");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e + "InterrupedException occured here....");
			e.printStackTrace();
		} finally {
			System.out.println("Hello iam ended!");

		}

	}

	public void m2() {
		m1();
	}

	public void m3() {
		m2();
	}

	public static void main(String[] args) {
		M1M2M3Demo s = new M1M2M3Demo();
		s.m3();

	}
}
