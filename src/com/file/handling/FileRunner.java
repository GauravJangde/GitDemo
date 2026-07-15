package com.file.handling;

import java.io.File;
import java.io.IOException;

public class FileRunner {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\gaura\\Desktop\\SDET with Jatin\\Java Module\\Java Practice\\demo.txt");
		if(file.exists()) {
			System.out.println(file.getName()+" File is present");
			System.out.println(file.getAbsolutePath());
		}
		else
		{
			System.out.println(file.getName()+" File is not present");
		}
		
		File newFile = new File("C:\\Users\\gaura\\Desktop\\SDET with Jatin\\Java Module\\Java Practice\\abc.txt");
		try {
			if(newFile.createNewFile()) {
				System.out.println("New File "+newFile.getName()+" is created successfully");
			}
			else {
				System.out.println("Cannot create new file as file "+newFile.getName()+" already exists!");
			}
			
		} catch (IOException e) {
			System.out.println("Cannot create file " +newFile.getName()+". Something went wrong!");
			e.printStackTrace();
		}
		
		if(newFile.delete()) {
			System.out.println("File "+newFile.getName()+" is deleted successfully");
		}
		else {
			System.out.println("Cannot delete the file as file not exists");
		}

	}

}
