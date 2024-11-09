package files_handling.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileOutputStreamDemo {

	public static void main(String[] args) {

		String data = "This is an dummy text to insert into a source as example.";

		// creating the outputstream.
		try {
			OutputStream out1 = new FileOutputStream("D://Dummy_Files_Practise_Folder/file1.txt");
			
			// it works on bytes of data only....
			// converts the string type data into bytes.
			byte[] byteArray = data.getBytes();

			// writes data to output stream
			out1.write(byteArray);

			System.out.println("Data successfully written into file.....");

			out1.close();
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Exception handled...!");
		}

	}
}
