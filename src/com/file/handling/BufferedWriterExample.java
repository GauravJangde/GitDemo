package com.file.handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\gaura\\Desktop\\SDET with Jatin\\Java Module\\Java Practice\\demo.txt");
		try {
			FileWriter writer = new FileWriter(file,true);
			//writer.write("Hello, This is new String value entered\n");
			//writer.close();
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write("This string is written through buffered writter\n");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
