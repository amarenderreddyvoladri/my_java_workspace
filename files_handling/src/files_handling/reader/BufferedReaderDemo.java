package files_handling.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		
		try {
			
			File f = new File("file7.txt");
			
			FileReader fr = new FileReader(f);
			
			BufferedReader br = new BufferedReader(fr, 1024);
			
			System.out.println("Data from the File "+f.getName()+" is : ");
			
			int i = br.read();
			while(i != -1) {
				System.out.print((char) i);
				i = br.read();
			}
		
			br.close();
			fr.close();
			
		}catch(IOException e) {
			e.getStackTrace();
		}
	}
}
