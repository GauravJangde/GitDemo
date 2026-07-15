package com.file.handling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ContactRunner {

	public static void main(String[] args) {
		Contact contactOne = new Contact("Uday","9876512345");
		System.out.println(contactOne);
		try {
			FileOutputStream fos = new FileOutputStream("contact.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(contactOne);
			System.out.println("Contact object is serialized");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
