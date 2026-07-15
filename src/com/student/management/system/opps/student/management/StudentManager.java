package com.student.management.system.opps.student.management;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.student.management.system.opps.RegularStudent;
import com.student.management.system.opps.SportStudent;
import com.student.management.system.opps.Student;

public class StudentManager {
	
	public static void enrollStudent(Scanner scanner) {
		ArrayList<Student>student = new ArrayList<Student>();
		while(true) {
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

			if (isSportStudent.equalsIgnoreCase("Yes")) {
				System.out.println("Enter sports score");
				int sportsScore = scanner.nextInt();
				System.out.println(sportsScore);
				scanner.nextLine();
				Student s2 = new SportStudent.SportStudentBuilder(studentName, studentAge, studentAddress,
						contactNumber).withSportsScore(sportsScore)
						.withMarksObtainedInEnglish(marksObtainedInEnglish)
						.withMarksObtainedInMath(marksObtainedInMath)
						.withMarksObtainedInScience(marksObtainedInScience).withRollNumber(rollNo).build();
				System.out.println(s2);
				//studentArray[index] = s2;
				student.add(s2);
			} else if (isSportStudent.equalsIgnoreCase("No")) {

				Student s1 = new RegularStudent.RegularStudentBuilder(studentName, studentAge, studentAddress,
						contactNumber).withMarksObtainedInEnglish(marksObtainedInEnglish)
						.withMarksObtainedInMath(marksObtainedInMath)
						.withMarksObtainedInScience(marksObtainedInScience).withRollNumber(rollNo).build();
				System.out.println(s1);
				student.add(s1);
			} else {
				throw new IllegalArgumentException("Enter value in yes or no only for sport");
			}
			System.out.println("Student Info Added!!! Do you wish to Add another student (Yes/No)");
			String choice = scanner.nextLine();
			if(choice.equalsIgnoreCase("No")) {
				break;
			}
		}
		
		for (Student data : student) {
			System.out.println(data);
		}
		serializedStudentData(student);
	}
	
	public static void deserializeStudentData() {
		File SerializedFile = new File("Student.ser");
		FileInputStream fis;
		ObjectInputStream ois;
		ArrayList<Student> studentList = new ArrayList<Student>();
		try {
			fis = new FileInputStream(SerializedFile);
			ois = new ObjectInputStream(fis);
			studentList = (ArrayList<Student>) ois.readObject();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Student s : studentList) {
			System.out.println(s);
		}
	}

	public static void serializedStudentData(ArrayList<Student>student) {
		File SerializedFile = new File("Student.ser");
		ArrayList<Student>oldStudentList = new ArrayList<Student>();
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream(SerializedFile);
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			if(obj instanceof ArrayList<?>) {
				for(Object o: (ArrayList<?>)obj) {
					if(o instanceof Student) {
						oldStudentList.add((Student)o);
					}
				}
			}
		}
		catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		oldStudentList.addAll(student);
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream(SerializedFile);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(oldStudentList);
			System.out.println("Data serialized successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
