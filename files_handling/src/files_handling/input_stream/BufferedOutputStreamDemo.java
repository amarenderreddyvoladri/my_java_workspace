package files_handling.input_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
	
	public static void main(String[] args) {
		
		String data = "This is a dummy text with buffer write ibto file. Its working successfully.";
		
		try {
			// create file output stream to write onto file.
			FileOutputStream fout = new FileOutputStream("file3.txt");
			
			// create BufferedOutputStream bout to write into file using buffer.
			try ( BufferedOutputStream bout = new BufferedOutputStream(fout, 1024)) {
				
				System.out.println("data started writing.......");
				bout.write(data.getBytes());
				System.out.println("data written successfully into file.......");
			}
			
		}catch(Exception e) {
			e.getStackTrace();
		}
	}
}
