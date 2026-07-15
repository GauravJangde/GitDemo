package com.file.handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ContactRunner2 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("contact.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Contact data = (Contact)ois.readObject();
			System.out.println(data);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
