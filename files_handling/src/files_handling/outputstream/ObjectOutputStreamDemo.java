package files_handling.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) {

		String text = "My name is Amarender Reddy Voladri. Iam from Hyderabad.";

		int num = 56;

		try {
			// creates the file stream.
			FileOutputStream fout = new FileOutputStream("file2.txt");
			// creates the object stream from file.
			try ( ObjectOutputStream out = new ObjectOutputStream(fout)) {
				// write the string to file in object format.
				out.writeObject(text);
				// write the integer into file using....
				out.writeInt(num);
			}

		} catch (Exception e) {
			e.getStackTrace();
		}
		
		try {
			// creates a FileInputStream.
			// to read from file.
			FileInputStream fin = new FileInputStream("file2.txt");
			
			try (//creates a ObjectInputStream.
			ObjectInputStream in = new ObjectInputStream(fin)) {
				// display the file data on console.
				System.out.println("String data : "+in.readObject());
				System.out.println("Integer data : "+in.readInt());
			}
			
			System.out.println("-------------------------------------");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
