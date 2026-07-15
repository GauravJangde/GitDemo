package com.student.management.system.opps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.student.management.system.opps.student.management.StudentManager;

public class Runner5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		File file = new File("Student.ser");
		if (file.exists()) {
			System.out.println("Data already exists, so deserializing the file");
			StudentManager.deserializeStudentData();

		} else {
			System.out.println("**********************Student Management System**********************");
			System.out.println("No backup found (Student.ser).....Taking input from user.....");
			
		}

		System.out.println("--------------------MAIN MENU--------------------");
		System.out.println("1. Enroll a new Student");
		System.out.println("2. Exit");
		System.out.println("Select an option");
		int option = scanner.nextInt();
		scanner.nextLine();
		
		switch(option) {
		case 1: StudentManager.enrollStudent(scanner);
		break;
		case 2: System.out.println("Good Bye");
		System.exit(0);
		}
		
		
	}

	

}
