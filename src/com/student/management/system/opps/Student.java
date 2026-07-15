package com.student.management.system.opps;

import java.nio.InvalidMarkException;
import java.util.Objects;

import com.exception.handling.InvalidAgeException;
import com.student.management.system.exceptions.InvalidAddressException;
import com.student.management.system.exceptions.InvalidMarksException;

public abstract class Student extends Person {

	private final int rollNumber;
	private final double marksObtainedInEnglish;
	private final double marksObtainedInMaths;
	private final double marksObtainedInScience;
	protected final double totalMarks;
	protected double percentage;
	protected String grade;
	private static int studentCount = 0;

	

	protected Student(StudentBuilder studentBuilder) {
		super(studentBuilder.name, studentBuilder.age, studentBuilder.address, studentBuilder.contactNumber);
		this.rollNumber = studentBuilder.rollNumber;
		this.marksObtainedInEnglish = studentBuilder.marksObtainedInEnglish;
		this.marksObtainedInMaths = studentBuilder.marksObtainedInMaths;
		this.marksObtainedInScience = studentBuilder.marksObtainedInScience;
		totalMarks = calculateTotalMarks();
		
		studentCount++;
	}

	private boolean validateRollNo(int rollNumber) {
		if (rollNumber >= 1 && rollNumber <= 100) {
			return true;
		} else {
			System.err.println("Invalid RollNumber entered");
			return false;
		}
	}

	private boolean validateMarks(double marksForTheSubject) {
		if (marksForTheSubject >= 100 || marksForTheSubject < 0) {
			try {
				throw new InvalidMarksException("Student marks is invalid.. Marks need to be less than or equall to 100 and greater than 0");
			}
			catch(InvalidMarkException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			return false;
		} else {
			return true;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalMarks() {
		return totalMarks;
	}

	public double getPercentage() {
		return percentage;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 10 && age <= 25) {
			this.age = age;
		} else {
			System.out.println("Invalid Age entered");
		}
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public double getMarksObtainedInEnglish() {
		return marksObtainedInEnglish;
	}

	public double getMarksObtainedInMaths() {
		return marksObtainedInMaths;
	}

	public double getMarksObtainedInScience() {
		return marksObtainedInScience;
	}

	public String getGrade() {
		return grade;
	}

	public String getAddress() {
		return address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public final double calculateTotalMarks() {
		double totalMarks = marksObtainedInEnglish + marksObtainedInMaths + marksObtainedInScience;
		return totalMarks;
	}

	public abstract double calculatePercentage();

	public final String calculateGrade() {
		String grade;
		if (percentage == 0) {
			grade = "Grade cannot be calculated";
		} else {
			grade = GradePolicy.calculateGrade(percentage);
		}
		return grade;
	}

	public boolean updateInformation(String newAddress, String newContactNumber) {
		System.out.println("Requesting Parent Approval");
		boolean parentApprovalStatus = parentApproval();
		if (parentApprovalStatus) {
			if (super.updateInformation(newAddress, newContactNumber)) {
				System.out.println("Notifying the parent ...");
				return true;
			} else {
				System.err.println("No Approval from Parent");
				return false;
			}
		}
		return false;
	}

	public boolean updateInformation(String newAddress) {
		System.out.println("Requesting Parent Approval");
		boolean parentApprovalStatus = parentApproval();
		if (parentApprovalStatus) {
			if (super.updateInformation(newAddress)) {
				System.out.println("Notifying the parent ...");
				return true;
			} else {
				System.err.println("No Approval from Parent");
				return false;
			}
		}
		return false;
	}

	public boolean updateInformation(String newContactNumber, boolean update) {
		System.out.println("Requesting Parent Approval");
		boolean parentApprovalStatus = parentApproval();
		if (parentApprovalStatus) {
			if (super.updateInformation(newContactNumber, update)) {
				System.out.println("Notifying the parent ...");
				return true;
			} else {
				System.err.println("No Approval from Parent");
				return false;
			}
		}
		return false;
	}

	private boolean parentApproval() {
		return true; // dummy approval method
	}

	public void displayStudentInfo() {
		System.out.println("-----Student Information-----");
		System.out.println("NAME: " + name);
		System.out.println("AGE: " + age);
		System.out.println("ADDRESS: " + address);
		System.out.println("CONTACT NUMBER: " + contactNumber);
		System.out.println("ROLL NUMBER: " + rollNumber);
		System.out.println("ENGLISH MARKS: " + marksObtainedInEnglish);
		System.out.println("MATHS MARKS: " + marksObtainedInMaths);
		System.out.println("SCIENCE MARKS: " + marksObtainedInScience);
		System.out.println("-----------------------------------------");
		System.out.println("TOTAL MARKS: " + totalMarks);
		System.out.println("PERCENTAGE: " + percentage + "%");
		System.out.println("GRADE: " + grade);
		System.out.println("=========================================");
	}

	public static int getTotalStudentCount() {
		return studentCount;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
				+ ", rollNumber=" + rollNumber + ", marksObtainedInEnglish=" + marksObtainedInEnglish
				+ ", marksObtainedInMaths=" + marksObtainedInMaths + ", marksObtainedInScience="
				+ marksObtainedInScience + ", totalMarks=" + totalMarks + ", percentage=" + percentage + ", grade="
				+ grade + "]";
	}

	public static abstract class StudentBuilder {
		// Mandatory
		private String name;
		private int age;
		private String address;
		private String contactNumber;
		// Optional
		private int rollNumber;
		private double marksObtainedInEnglish;
		private double marksObtainedInMaths;
		private double marksObtainedInScience;

		public StudentBuilder(String name, int age, String address, String contactNumber) {
			if (validateAge(age) && validateAddress(address) && validateContactNumber(contactNumber)) {
				this.name = name;
				this.age = age;
				this.address = address;
				this.contactNumber = contactNumber;
			}
		}

		public final boolean validateAge(int age) {
			if (age < 21 && age >= 10) {
				return true;
			} else {
				try {
					throw new InvalidAgeException("Student Age needs to be less than 21 and greater than 10");
				}
				catch(InvalidAgeException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
				return false;
			}
		}

		public final boolean validateAddress(String address) {
			if (address.isEmpty() || address == null) {
				try {
				throw new InvalidAddressException("Address cannot be empty or null");
				}
				catch(InvalidAddressException e) {
					System.err.println(e.getMessage());
					e.printStackTrace();
				}
				return false;
			} else {
				return true;
			}
		}

		public final boolean validateContactNumber(String contactNumber) {
			if (contactNumber != null && contactNumber.matches("\\d{10}")) {
				return true;
			} else {
				System.err.println("Invalid contact number");
				return false;
			}
		}

		public StudentBuilder withRollNumber(int rollNumber) {
			this.rollNumber = rollNumber;
			return this;
		}

		public StudentBuilder withMarksObtainedInEnglish(double marksObtainedInEnglish) {
			this.marksObtainedInEnglish = marksObtainedInEnglish;
			return this;
		}

		public StudentBuilder withMarksObtainedInMath(double marksObtainedInMaths) {
			this.marksObtainedInMaths = marksObtainedInMaths;
			return this;
		}

		public StudentBuilder withMarksObtainedInScience(double marksObtainedInScience) {
			this.marksObtainedInScience = marksObtainedInScience;
			return this;
		}

		public abstract Student build();

	}

}
