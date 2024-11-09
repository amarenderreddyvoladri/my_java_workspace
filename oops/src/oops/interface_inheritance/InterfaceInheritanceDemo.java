package oops.interface_inheritance;

interface A{
	
}
interface B extends A{
	
}
interface C extends B{
	
}
interface X{
	void m1();
}
interface Y{
	void m1();
}
interface Z extends X, Y{
	
}

class XYZ extends Demo implements X,Y{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Method m1() implemented in XYZ Class.");
	}
	
}

class Demo{}

public class InterfaceInheritanceDemo {
	
}
