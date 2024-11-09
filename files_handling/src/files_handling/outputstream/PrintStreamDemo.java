package files_handling.outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
	
	public static void main(String[] args) {
		
		String str = "Iam from PrintStream class in java.io package. I have an autoFlush option by default.";		
		
		try {
			
			File f = new File("file4.txt");
			
			// creating printStream object.			
			PrintStream ps = new PrintStream(f);
			
			System.out.println("str text started wrting into file......");
			ps.print(str);
			
			ps.printf("\nIam %d years old.", 24);
			System.out.println("str data successfully written into file "+f.getName());
			
			ps.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
