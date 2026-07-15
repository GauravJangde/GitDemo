package com.student.management.system.opps;

public class RegularStudent extends Student {

	protected RegularStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		percentage = calculatePercentage();
		grade = calculateGrade();
	}

	@Override
	public double calculatePercentage() {
		// TODO Auto-generated method stub
		double percentage = totalMarks/3;
		return percentage;
		
	}

	public static class RegularStudentBuilder extends StudentBuilder{

		public RegularStudentBuilder(String name, int age, String address, String contactNumber) {
			super(name, age, address, contactNumber);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Student build() {
			Student s1 = new RegularStudent(this);
			return s1;
		}
		
	}
}
