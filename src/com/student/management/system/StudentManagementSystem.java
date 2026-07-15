package com.student.management.system;

import java.util.Scanner;

public class StudentManagementSystem {

	public static String studentName[] = new String[100];
	public static int studentAge[] = new int[100];
	public static double marksObtainedInEnglish[] = new double[100];
	public static double marksObtainedInMaths[] = new double[100];
	public static double marksObtainedInScience[] = new double[100];
	public static String studentGrade[] = new String[100];
	public static int studentRollNumber[] = new int[100];
	public static int index = 0;
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// Store information of student

		System.out.println("***Student Management System***");

		while(true) {
		int option;
		System.out.println("1. Add a student");
		System.out.println("2. Print student Details");
		System.out.println("3. Print all student Details");
		System.out.println("4. Exit");

		System.out.println("Enter an option from 1-4");
		option = scanner.nextInt();

		switch (option) {
		case 1:
			addStudent();
			break;

		case 2:
			printStudentInformation();
			break;

		case 3:
			printAllStudentInformation();
			break;

		case 4:
			exitApp();
			break;
		}
		}
		/*
		 * System.out.println("Enter Student Grade"); studentGrade = scanner.next();
		 */

		
		  
		 

	}

	private static void exitApp() {
		System.out.println("Exiting from the Application.....");
		System.exit(0);
	}

	private static void printAllStudentInformation() {
		System.out.println("printAllStudentInformation");
		for(int i=0;i<index;i++) {
			System.out.println("Student Name: "+studentName[i]);
			  System.out.println("Student Age: "+studentAge[i]);
			  System.out.println("Student Roll No: "+studentRollNumber[i]);
			  System.out.println("Marks Obtained:");
			  System.out.println("English: "+marksObtainedInEnglish[i]);
			  System.out.println("Maths: "+marksObtainedInMaths[i]);
			  System.out.println("Science: "+marksObtainedInScience[i]);
			  System.out.println("Student Grade: "+studentGrade[i]);
			  System.out.println("*************************************************");
		}

	}

	private static void printStudentInformation() {
		System.out.println("printStudentInformation");
		System.out.println("Enter the index");
		int userIndex = scanner.nextInt();
		System.out.println("Student Name: "+studentName[userIndex]);
		  System.out.println("Student Age: "+studentAge[userIndex]);
		  System.out.println("Student Roll No: "+studentRollNumber[userIndex]);
		  System.out.println("Marks Obtained:");
		  System.out.println("English: "+marksObtainedInEnglish[userIndex]);
		  System.out.println("Maths: "+marksObtainedInMaths[userIndex]);
		  System.out.println("Science: "+marksObtainedInScience[userIndex]);
		  System.out.println("Student Grade: "+studentGrade[userIndex]);
	}

	public static void addStudent() {
		System.out.println("Enter student name");
		studentName[index] = scanner.next();

		System.out.println("Enter student age");
		studentAge[index] = scanner.nextInt();

		System.out.println("Enter student Roll number");
		studentRollNumber[index] = scanner.nextInt();

		System.out.println("Enter marks for English");
		marksObtainedInEnglish[index] = scanner.nextDouble();

		System.out.println("Enter marks for Maths");
		marksObtainedInMaths[index] = scanner.nextDouble();

		System.out.println("Enter marks for Science");
		marksObtainedInScience[index] = scanner.nextDouble();

		double totalMarksObtained = marksObtainedInEnglish[index] + marksObtainedInMaths[index]
				+ marksObtainedInScience[index];
		double percentageObtained = totalMarksObtained / 3;

		if (percentageObtained >= 95) {
			studentGrade[index] = "A+";
		} else if (percentageObtained >= 90) {
			studentGrade[index] = "A";
		} else if (percentageObtained >= 85) {
			studentGrade[index] = "B+";
		} else if (percentageObtained >= 80) {
			studentGrade[index] = "B";
		} else if (percentageObtained >= 75) {
			studentGrade[index] = "C+";
		} else if (percentageObtained >= 70) {
			studentGrade[index] = "C";
		} else if (percentageObtained >= 65) {
			studentGrade[index] = "D";
		} else {
			studentGrade[index] = "F";
		}
		index = index+1;
		System.out.println("Student information stored successfully!");
	}
}
