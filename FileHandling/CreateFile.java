package filehandlingpackage;

import java.io.File;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		File myFile = new File("C:\\files\\data4.txt");
		
		try {
			if(myFile.createNewFile()) {
				System.out.println("File created successfully!!!");
			}
			else {
				System.out.println("Error while creating a file");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File error...");
		}
	}
}
