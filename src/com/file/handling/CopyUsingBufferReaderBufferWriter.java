package com.file.handling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyUsingBufferReaderBufferWriter {

	public static void main(String[] args) {
		File sourceFile = new File("NewFile.txt");
		File destinationFile = new File("Destination.txt");
		try 
			(BufferedReader br = new BufferedReader(new FileReader(sourceFile));
			BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile)))
				{
			
				String line;
				while((line=br.readLine())!=null) {
					bw.write(line);
					bw.newLine();
				}
				
		}
		catch(Exception e) {
			
		}
		

	}

}
