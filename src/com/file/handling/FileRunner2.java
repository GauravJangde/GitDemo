package com.file.handling;

import java.io.File;

public class FileRunner2 {

	public static void main(String[] args) {
		
		File file = new File("demo.txt");
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println("Can read the file: "+file.canRead());
		System.out.println("Can write the file: "+file.canWrite());
		System.out.println("Can execute the file: "+file.canExecute());
		
		File directory = new File("Logs");
		directory.mkdir();
		System.out.println(directory.isDirectory());

	}

}
