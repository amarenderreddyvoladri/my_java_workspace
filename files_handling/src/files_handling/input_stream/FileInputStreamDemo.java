package files_handling.input_stream;

import java.io.FileInputStream;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// create a array[] to store the read data.
//		byte[] data = new byte[100];

		// create InputStream Object.
		try {
			FileInputStream in = new FileInputStream("file1.txt");

			// read the first single byte and assign.
			int i = in.read();

			while (i != -1) {
				// just displaying data on console.
				System.out.print((char) i);

				// assigning the next byte to the variable.
				i = in.read(); // reading every single byte from the FileInputStream Object.
			}
			in.close();
		} catch (Exception e) {
			System.out.println("Exception handled !!");
		}
	}
}
