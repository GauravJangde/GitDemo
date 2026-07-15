package com.file.handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		File file = new File("demo.txt");
		PrintWriter pw;
		
		try {
			pw = new PrintWriter(file);
			pw.write("This text is written from print writer \n");
			pw.write("Name\tMarks\n");
			pw.format("%-10s %-3d%n","Abhi",69);
			pw.format("%-10s %-3d%n","Naresh",78);
			pw.format("%-10s %-3.2f%n","Suresh",69.68322);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
