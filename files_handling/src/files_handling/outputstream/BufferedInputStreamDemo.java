package files_handling.outputstream;

import java.io.BufferedInputStream;	
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamDemo {

	public static void main(String[] args) {

		try {

			File f = new File("file3.txt");
			// create file output stream to write onto file.
			FileInputStream fin = new FileInputStream(f);

			// create BufferedOutputStream bout to write into file using buffer.
			try (BufferedInputStream bin = new BufferedInputStream(fin, 1024)) {
				
				System.out.println("Content from File : " + f.getName());
				System.out.println("Avaliable bytes are  : "+bin.available());
				
				int i = bin.read();
				
				while (i != -1) {
					System.out.print((char) i);
					i = bin.read();
				}
				
				bin.close();
				fin.close();
			}			

		} catch (Exception e) {
			e.getStackTrace();
		}
		
	}
}
