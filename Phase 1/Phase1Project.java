package com.packagephase1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Phase1Project {
	public static void main(String[] args) {
		System.out.println("Welcome to Virtual Repository developed by Tejaswi");
		boolean isPresent = true;;
		while(isPresent) {
		System.out.println("*************MAIN MENU*************");
		String[] arr = {"1. Retrieve Current FileName in Ascending Order",
                "2. Business Level Operation Menu",
                "3. Exit from the Application"};
		int[] arr1 = {1,2,3};
        int  slen = arr1.length;
        for(int i=0; i<slen;i++){
            System.out.println(arr[i]);
        }
        
        System.out.println("\nEnter your option:\t");
        Scanner sc = new Scanner(System.in);
        int  option =  sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("****************The Current Files are retrieved in Ascending Order**********************");
			retrieve();
			break;
		case 2:
			System.out.println("*****************BUSINESS LEVEL OPERATION MENU*******************");
			business();
			break;
		case 3:
			isPresent = false;
			System.out.println("Closing your application... \nThank you!");
			break;
		default:
			System.out.println("Incorrect option!!");
			break;
		}
		}
	}

	public static void retrieve() {
		String path = "C:\\Users\\jahna tejaswi.nune\\phase1demofiles";
		File file = new File(path);
		file.listFiles();
		File downloadDir[] = file.listFiles();
		Arrays.sort(downloadDir);
		for( File e : downloadDir) {
			if(e.isFile()) {
				System.out.println("File :"+e.getName());
			}
			else if(e.isDirectory()) {
				System.out.println(" This is my folder: "+e.getName());
			}
		}
	}
	public static void business() {
		String path = "C:\\Users\\jahna tejaswi.nune\\phase1demofiles";
		File file = new File(path);
		boolean type = true;
		while(type) {
			System.out.println("Enter your choice to do operations:\t");
			System.out.println(" 1: Add a file to the existing directory\n 2: Delete a file from the existing directory\n 3: Searching a file and showing it's content\n 4: Exit from Business Level Operation Menu");
			Scanner obj = new Scanner(System.in);
			int choice = obj.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Enter a file name:");
				String name = obj.next();
				if(new File(file,name).exists()){
                    System.out.println("file already exist");
                }else {
                    File folder1 = new File(file, name);
                    folder1.mkdir();
                    if (new File(file, name).exists()) {
                        System.out.println("file added successfully");
                    }
                }
				break;
			case 2:
				System.out.println("Enter a file name:");
				String name1 = obj.next();
				 boolean folder2 = new File(file, name1).exists();
                 if (folder2 == true) {
                     File folder3 = new File(file, name1);
                     folder3.delete();
                     System.out.println("File successfully deleted");
                 } else {
                     System.out.println("file does not exist");
                 }
                 break;
			case 3:
				String StringName="";
	  			try {
	  				String[] flist=file.list();
	  				int flag=0;
	  				System.out.println("Enter File Name:");
	  				StringName = obj.next();
	  				if(flist==null) {
	  					System.out.println("Empty Directory");
	  				}
	  				else {
	  					for(int i=0;i<flist.length;i++) {
	  						String filename = flist[i];
	  						if(filename.equalsIgnoreCase(StringName)) {
	  							System.out.println(filename+" Found");
	  							flag=1;
	  							break;
	  						}
	  					}
	  				}
	  				if(flag==0)
	  				{
	  					System.out.println("File Not Found");
	  				}
	  			}
	  			catch(Exception e) {
	  				System.out.println("Error");
	  			}
	  			break;
			case 4:
				type = false;
				System.out.println("Returning to main menu!");
			break;
			default:
				System.out.println("Incorrect option!!");
				break;
				
			}
			
		}
	}
}
