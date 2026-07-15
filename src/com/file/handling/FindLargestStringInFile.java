package com.file.handling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FindLargestStringInFile {

	public static void main(String[] args) {
		File file = new File("NewFile.txt");
		FileReader fr;
		BufferedReader br;
		String line;
		String largestString="";
		try {
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			while((line=br.readLine())!=null) {
				String arr[]=line.split(" ");
				for(String word:arr) {
					if(word.length()>largestString.length()) {
						largestString=word;
					}
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Largest string from given file is: "+largestString);

	}

}
