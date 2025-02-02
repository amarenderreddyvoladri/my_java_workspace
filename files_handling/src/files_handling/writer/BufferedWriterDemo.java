package files_handling.writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		
		String text = "This is dummy text to be written into the file.";
		
		try {
			File f = new File("file7.txt");
			
			FileWriter fw = new FileWriter(f, true);
			
			BufferedWriter bw = new BufferedWriter(fw, 1024);
			
			System.out.println("text started writing into file....");
			bw.write(text);
			bw.write("\n");
			bw.flush();
			System.out.println("Text successfully written into the file "+f.getName());
			
			bw.close();
			fw.close();
			
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
