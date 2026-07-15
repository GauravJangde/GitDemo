package com.student.management.system.opps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Runner3 {

	public static void main(String[] args) {
		
		File file = new File("Student.ser");
		if(file.exists()) {
			System.out.println("Data already exists, so deserializing the file");
			deserialize();
			
		}
		else {
			System.out.println("Data not found, so serializing the file first");
			Student s1 = new RegularStudent.RegularStudentBuilder("Uday", 17, "Pune", "8989898989")
					.withMarksObtainedInEnglish(88).withMarksObtainedInMath(89).withMarksObtainedInScience(92)
					.withRollNumber(22).build();
			// System.out.println(s1);

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
