package oops.override;

public class OverrideDemo {
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.study();
		p.property();
		p.marry();
		
		System.out.println("---------------------------");
		
		Child c = new Child();
		c.study();
		c.marry();
		c.property();
	}
}
