package files_handling.input_stream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) {
		
		try {
			// creates a FileInputStream.
			// to read from file.
			FileInputStream fin = new FileInputStream("file2.txt");
			//creates a ObjectInputStream.
			try ( ObjectInputStream in = new ObjectInputStream(fin)) {
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
