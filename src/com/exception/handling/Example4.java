package com.exception.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Example4 {

	public static void main(String[] args) {
		File file = new File("demo.txt");
		FileReader fileReader;
		BufferedReader bufferReader = null;
		String data = null;
		try {
			 fileReader = new FileReader(file);
			 bufferReader = new BufferedReader(fileReader);
			 data = bufferReader.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				bufferReader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(data);

	}

}
