package com.student.management.system.opps;

public class Runner {

	public static void main(String[] args) {

		/*
		 * Person s1 = new Student("Nitin",18,"Address 1","9833443388",26,70,75,81);
		 * ((Student)s1).calculateTotalMarks(); ((Student)s1).calculatePercentage();
		 * ((Student)s1).calculateGrade(); ((Student)s1).displayStudentInfo();
		 * s1.updateInformation("Old City, Pune", "6878686868");
		 * ((Student)s1).displayStudentInfo(); s1.updateInformation("Akola");
		 * s1.updateInformation("8834883322", true); ((Student)s1).displayStudentInfo();
		 */
		
		
		Teacher t1 = new Teacher ("Pawan",23,"Mumbai","9837473838","T101","Java",11);
		t1.displayTeacherInformation();
		t1.updateInformation("New City, Banglore", "8877887788");
		t1.displayTeacherInformation();
		t1.updateInformation("Kolkata");
		t1.displayTeacherInformation();
		
		System.out.println("Total Person joined today " +Person.getTotalPersonCount());
		System.out.println("Total Student joined today "+Student.getTotalStudentCount());
		System.out.println("Total Teacher joined today "+Teacher.getTotalTeacherCount());

	}

}
