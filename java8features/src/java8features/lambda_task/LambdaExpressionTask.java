package java8features.lambda_task;

@FunctionalInterface
interface DemoInterface {
	boolean isEven(int n);
}

class Demo implements DemoInterface {

	@Override
	public boolean isEven(int n) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

public class LambdaExpressionTask{
	DemoInterface di = (num) -> num%2==0;
	
	iterator()
	
}
