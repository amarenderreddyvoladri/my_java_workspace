package files_handling.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ReaderDemo {
	public static void main(String[] args) {
		
		try {
			// create a file object.
			File f = new File("file5.txt");
			
			// creates a fis object.
			FileInputStream fis = new FileInputStream(f);
			
			// create a InputStreamReader obj.
			InputStreamReader isr = new InputStreamReader(fis);
			
			int i = isr.read();
			System.out.println("Data in the FileInputStream : ");
			while(i != -1) {
				System.out.print((char)i);
				i = isr.read();
			}
			
			isr.close();
			fis.close();
			
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}
