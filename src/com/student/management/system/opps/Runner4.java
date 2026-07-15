package com.student.management.system.opps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Runner4 {

	public static void main(String[] args) {
		
		File file = new File("Student.ser");
		if(file.exists()) {
			System.out.println("Data already exists, so deserializing the file");
			deserialize();
			
		}
		else {
			System.out.println("**********************Student Management System**********************");
			System.out.println("No backup found (Student.ser).....Taking input from user.....");
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("How many student info you would like to store.....");
			int sizeOfStudentArray = scanner.nextInt();
			scanner.nextLine();
			Student studentArray[]=new Student[sizeOfStudentArray];
			
			for(int index=0;index<studentArray.length;index++) {
			System.out.println("Enter Student Name");
			String studentName = scanner.nextLine();
			System.out.println(studentName);
			
			System.out.println("Enter Student Age");
			int studentAge = scanner.nextInt();
			System.out.println(studentAge);
			scanner.nextLine();
			
			System.out.println("Enter Student Address");
			String studentAddress = scanner.nextLine();
			System.out.println(studentAddress);
			
			System.out.println("Enter parent's contact number");
			String contactNumber = scanner.nextLine();
			System.out.println(contactNumber);
			
			System.out.println("Enter Student Roll No");
			int rollNo = scanner.nextInt();
			System.out.println(rollNo);
			
			System.out.println("Enter Marks obtained in English");
			int marksObtainedInEnglish = scanner.nextInt();
			System.out.println(marksObtainedInEnglish);
			
			System.out.println("Enter Marks obtained in Math");
			int marksObtainedInMath = scanner.nextInt();
			System.out.println(marksObtainedInMath);
			
			System.out.println("Enter Marks obtained in Science");
			int marksObtainedInScience = scanner.nextInt();
			System.out.println(marksObtainedInScience);
			
			scanner.nextLine();
			System.out.println("Is student a sport student? Yes or No");
			String isSportStudent = scanner.nextLine();
			
			
			if(isSportStudent.equalsIgnoreCase("Yes")) {
				System.out.println("Enter sports score");
				int sportsScore = scanner.nextInt();
				System.out.println(sportsScore);
				scanner.nextLine();
				Student s2 = new SportStudent.SportStudentBuilder(studentName, studentAge, studentAddress, contactNumber).withSportsScore(sportsScore)
						.withMarksObtainedInEnglish(marksObtainedInEnglish).withMarksObtainedInMath(marksObtainedInMath).withMarksObtainedInScience(marksObtainedInScience)
						.withRollNumber(rollNo).build();
				System.out.println(s2);
				studentArray[index]=s2;
			}
			else if(isSportStudent.equalsIgnoreCase("No")) {
			
			Student s1 = new RegularStudent.RegularStudentBuilder(studentName, studentAge,studentAddress, contactNumber)
					.withMarksObtainedInEnglish(marksObtainedInEnglish).withMarksObtainedInMath(marksObtainedInMath).withMarksObtainedInScience(marksObtainedInScience)
					.withRollNumber(rollNo).build();
					System.out.println(s1);
					studentArray[index]=s1;
			}
			else {
				throw new IllegalArgumentException("Enter value in yes or no only for sport");
			}
			}
			/*
			Student s2 = new SportStudent.SportStudentBuilder("Raj", 15, "Mumbai", "6868686868").withSportsScore(92)
					.withMarksObtainedInEnglish(91).withMarksObtainedInMath(94).withMarksObtainedInScience(99)
					.withRollNumber(19).build();
			Student s3 = new SportStudent.SportStudentBuilder("Kunal", 15, "Delhi", "8788686868").withSportsScore(67)
					.withMarksObtainedInEnglish(82).withMarksObtainedInMath(94).withMarksObtainedInScience(77)
					.withRollNumber(20).build();
			// System.out.println(s2);

			Student studentArray[] = new Student[3];
			studentArray[0] = s1;
			studentArray[1] = s2;
			studentArray[2] = s3;
			
	*/		
			for(Student data:studentArray) {
				System.out.println(data);
			}
			serializedData(studentArray);
		}
		

		

	}

	public static void deserialize() {
		File SerializedFile = new File("Student.ser");
		FileInputStream fis;
		ObjectInputStream ois;
		Student[] data = null;
		try {
			fis = new FileInputStream(SerializedFile);
			ois = new ObjectInputStream(fis);
			data = (Student[]) ois.readObject();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Student s:data) {
			System.out.println(s);
		}
	}

	public static void serializedData(Student[] studentArray) {
		File SerializedFile = new File("Student.ser");
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(SerializedFile);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(studentArray);
			System.out.println("Data serialized successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
