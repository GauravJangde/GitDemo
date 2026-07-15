package com.file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\gaura\\Desktop\\SDET with Jatin\\Java Module\\Java Practice\\src\\NewDemo.txt");
		FileReader reader;
		int data = 0;
		try {
			reader = new FileReader(file);
			while(data!=-1) {
			data = reader.read();
			System.out.print((char)data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
