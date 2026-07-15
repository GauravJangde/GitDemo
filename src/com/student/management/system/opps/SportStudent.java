package com.student.management.system.opps;

public class SportStudent extends Student {
	private double sportsScore;
	private SportStudent(StudentBuilder studentBuilder) {
		super(studentBuilder);
		this.sportsScore = ((SportStudentBuilder)studentBuilder).sportsScore;
		percentage = calculatePercentage();
		grade = calculateGrade();
	}

	@Override
	public double calculatePercentage() {
		System.out.println("Total Marks "+getTotalMarks());
		System.out.println("Sports Marks "+sportsScore);
		double academicPercentage = getTotalMarks()/3;
		double finalPercentage = (academicPercentage*0.8) + (sportsScore*0.2);
		return finalPercentage;
	}
	
	public static class SportStudentBuilder extends StudentBuilder {
		private double sportsScore;
		public SportStudentBuilder(String name, int age, String address, String contactNumber) {
			super(name, age, address, contactNumber);
			// TODO Auto-generated constructor stub
		}
		
		public SportStudentBuilder withSportsScore(double sportsScore) {
			if(sportsScore>=0 && sportsScore<=100) {
				this.sportsScore = sportsScore;
			}
			return this;
		}

		@Override
		public Student build() {
			// TODO Auto-generated method stub
			Student s1 = new SportStudent(this);
			return s1;
		}
	}
}
