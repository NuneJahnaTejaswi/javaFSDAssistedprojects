package filehandlingpackage;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		String data = "Adding some data to existing data";
		try {
			FileWriter output = new FileWriter("C:\\files\\data1.txt", true);
			output.write(data);
			System.out.println("Data appended successfully");
			output.close();
		} catch (IOException e) {
			System.out.println("File Append Error...");
		}

	}

}
