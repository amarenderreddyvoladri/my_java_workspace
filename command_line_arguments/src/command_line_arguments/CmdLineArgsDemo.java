package command_line_arguments;

public class CmdLineArgsDemo {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("Command Line arguments are :");
		for(String s : args) {
			System.out.println(Integer.parseInt(s));
		}
		
		System.out.println("Sum of two Number is : "+(a+b));
		
	}
}
