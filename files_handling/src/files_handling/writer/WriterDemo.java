package files_handling.writer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class WriterDemo {
	public static void main(String[] args) {

		String data = "This is the line that is written into the file.";

		try {
			// creating a file object.
			File f = new File("file5.txt");

			// creating FileOuputStream Object.
			FileOutputStream fout = new FileOutputStream(f);

			// creating the writer object.
			OutputStreamWriter out = new OutputStreamWriter(fout);

			System.out.println("data begin to start write.....");
			out.write(data);
			System.out.println("data successfully written into the file.");

			out.close();
			fout.close();
		} catch (Exception e) {
			System.out.println("Exception handled...");
		}
	}
}
