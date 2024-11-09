package files_handling.writer;

import java.io.StringWriter;

public class StringWriterDemo {
	public static void main(String[] args) {
		String data = "This is an example of string writer.";
		try {
			StringWriter sw = new StringWriter();
			sw.write(data);

			System.out.println("Data in the StringWriter Object is : " + sw);

		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
