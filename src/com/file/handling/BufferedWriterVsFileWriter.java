package com.file.handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterVsFileWriter {

	public static void main(String[] args) {
		
		bW();
		fW();

	}

	public static void bW() {
		File file = new File("C:\\Users\\gaura\\Desktop\\SDET with Jatin\\Java Module\\Java Practice\\demo.txt");
		try {
			FileWriter writer = new FileWriter(file,true);
			//writer.write("Hello, This is new String value entered\n");
			//writer.close();
			long startTime = System.nanoTime();
			
			BufferedWriter bw = new BufferedWriter(writer);
			for(int i=0;i<100;i++) {
			bw.write("This string is written through buffered writter\n");
			}
			bw.close();
			long endTime = System.nanoTime();
			long duration = endTime-startTime;
			System.out.println("Buffered writer took "+duration);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void fW() {
		File file = new File(
				"C:\\Users\\gaura\\Desktop\\SDET with Jatin\\Java Module\\Java Practice\\demo.txt");
		// System.out.println(file.exists());
		FileWriter writer;
		try {
			writer = new FileWriter(file,true);
			long startTime = System.nanoTime();
			for(int i=0;i<100;i++) {
			writer.write("This string is written through file writter\n");
			}
			writer.close();
			long endTime = System.nanoTime();
			long duration = endTime-startTime;
			System.out.println("File writer took "+duration);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
