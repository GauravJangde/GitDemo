package com.file.handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {
		File file = new File(
				"C:\\Users\\gaura\\Desktop\\SDET with Jatin\\Java Module\\Java Practice\\src\\NewDemo.txt");
		// System.out.println(file.exists());
		FileWriter writer;
		try {
			writer = new FileWriter(file,true);
			writer.write("I am writing into file from my java code...\n");
			writer.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
