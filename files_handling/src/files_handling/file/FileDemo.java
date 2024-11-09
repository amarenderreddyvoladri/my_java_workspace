package files_handling.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	
	public static void main(String[] args) {
		
		File f  = new File("file5.txt");
		
		boolean flag;
		
		try {
			
			flag = f.createNewFile();
			
			if(flag) {
				System.out.println("New file "+f.getName()+" is created.");
			}
			else{
				System.out.println("File "+f.getName()+" is already exist at particular location.");			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
