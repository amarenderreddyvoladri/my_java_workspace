package files_handling.writer;

import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {
	public static void main(String[] args) {

		String data = "This is the dummy text to be write into the file.";

		try {
			// create a file object.
			File f = new File("file6.txt");

			// creates a FileWriter Object.
			FileWriter fw = new FileWriter(f, true);

			System.out.println("data start writing into the file....");
			fw.write(data);
			System.out.println("data successfully written into the file " + f.getName());

			fw.close();

		} catch (Exception e) {
			System.out.println("exception handled...!");
		}
	}
}
