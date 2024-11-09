package files_handling.input_stream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		// created byte array.
		byte[] arr = { 34, 67, 23, 89, 45, 33 };

		try {
			ByteArrayInputStream bin = new ByteArrayInputStream(arr);

			for (int i = 0; i < arr.length; i++) {
				int data = bin.read();
				System.out.print(data + ", ");
			}
			bin.close();
		} catch (Exception e) {
			System.out.println("Exception Handled....!!");
		}
	}
}
