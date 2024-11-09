package files_handling.outputstream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {

		String data = "This is dummy text to work with ByteArrayOutputStream example.";

		ByteArrayOutputStream bout = new ByteArrayOutputStream();

		try {
			System.out.println("data begin to write......");
			bout.write(data.getBytes());
			System.out.println("data successfully written.....");

			System.out.println("written data is ...");
			System.out.println(bout.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block.
			e.printStackTrace();
		}

	}

}
