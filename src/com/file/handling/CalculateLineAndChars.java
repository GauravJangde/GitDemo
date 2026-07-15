package com.file.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CalculateLineAndChars {

	public static void main(String[] args) {
		File file = new File("demo.txt");
		FileReader fr;
		BufferedReader br;
		String line;
		int lineCount = 0;
		int charCount = 0;
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while((line=br.readLine())!=null) {
				System.out.println(line);
				lineCount++;
				charCount = charCount+line.length();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Total lines are "+lineCount);
		System.out.print("Total chars are "+charCount);
		

	}

}
