package com.file.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		
		File file = new File("demo.txt");
		FileReader fr;
		BufferedReader br;
		String line;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while((line=br.readLine())!=null) {
				System.out.println(line);
				
			}
			br.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
