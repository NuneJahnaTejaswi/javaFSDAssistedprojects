package filehandlingpackage;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Welcome to FileHandling Topic.";
		
		try {
			FileWriter output = new FileWriter("C:\\files\\data4.txt");
			output.write(data);
			System.out.println("Data is written successfully");
			output.close();
		} catch (IOException e) {
			
			System.out.println("File Write Error...");
		}
		
	}

}
