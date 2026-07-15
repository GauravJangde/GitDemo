package com.student.management.system.opps;

import com.exception.handling.InvalidAgeException;
import com.student.management.system.exceptions.InvalidEmployeeIDException;
import com.student.management.system.exceptions.InvalidSubjectException;

public final class Teacher extends Person {

	private String empID;
	private String subject;
	private int yearsOfExperience;
	private double salary;
	private static final double BASE_SALARY = 30000;
	private static final double EXPERIENCE_BONUS = 2000;
	private static int teacherCount = 0;
	
	

	public Teacher(String name, int age, String address, String contactNumber, String empID, String subject, int yearsOfExperience) {
		super(name, age, address, contactNumber);
		if (validateAge(age) && validateContactNumber(contactNumber) && validateAddress(address) && validateEmpID(empID)
				&& validateSubject(subject) && validateYearsOfExperience(yearsOfExperience)) {
		this.empID = empID;
		this.subject = subject;
		this.yearsOfExperience = yearsOfExperience;
		calculateSalary();
		teacherCount++;
	}}



	public boolean validateAge(int age) {
		if (age >= 21 && age <= 65) {
			return true;
		} else {
			try {
				throw new InvalidAgeException("Teacher Age needs to be greater than 21 and less than 65");
			}
			catch(InvalidAgeException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			return false;
		}
	}

	public boolean validateContactNumber(String contactNumber) {
		if (contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			System.err.println("Invalid Teacher Contact Number");
			return false;
		}
	}

	public boolean validateAddress(String address) {
		if (!address.isEmpty()) {
			return true;
		} else {
			System.err.println("Invalid Teacher Address");
			return false;
		}
	}

	public boolean validateEmpID(String empID) {
		if (empID.matches("T\\d{3}")) {
			return true;
		} else {
			try {
				throw new InvalidEmployeeIDException("Invalid Employee ID, use format T-XXX");
			}
			catch(InvalidEmployeeIDException e){
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			
			return false;
		}
	}

	public boolean validateSubject(String subject) {
		if (!subject.isEmpty()) {
			return true;
		} else {
			try {
				throw new InvalidSubjectException("Subject cannot be empty");
			}
			catch(InvalidSubjectException e){
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			
			return false;
		}
	}


	public boolean validateYearsOfExperience(int yearsOfExp) {
		if (yearsOfExp >= 0 && yearsOfExp <= 35) {
			return true;
		} else {
			System.err.println("Invalid Year of Experience");
			return false;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (validateAge(age)) {
			this.age = age;
		}
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if (validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
		}
	}

	public String getEmpID() {
		return empID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		if (validateSubject(subject)) {
			this.subject = subject;
		}
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		if (validateYearsOfExperience(yearsOfExperience)) {
			this.yearsOfExperience = yearsOfExperience;
		}
	}

	public double getSalary() {
		return salary;
	}
	
	protected final void calculateSalary() {
		salary = BASE_SALARY+(yearsOfExperience*EXPERIENCE_BONUS);
	}
	
	public boolean updateInformation(String newAddress, String newContactNumber) {
		System.out.println("Notifying HR for Approval");
		
		boolean hrApproval = getHRApproval();
		if(hrApproval) {
			if(super.updateInformation(newAddress, newContactNumber)) {
				System.out.println("Notifying the Teacher that Information is updated");
				return true;
			}
		}
		return false;
		
	}
	
	public boolean updateInformation(String newAddress) {
		System.out.println("Notifying HR for Approval");
		
		boolean hrApproval = getHRApproval();
		if(hrApproval) {
			if(super.updateInformation(newAddress)) {
				System.out.println("Notifying the Teacher that Information is updated");
				return true;
			}
		}
		return false;
		
	}
	
	public boolean updateInformation(String newContactNumber, boolean update) {
		System.out.println("Notifying HR for Approval");
		
		boolean hrApproval = getHRApproval();
		if(hrApproval) {
			if(super.updateInformation(newContactNumber, update)) {
				System.out.println("Notifying the Teacher that Information is updated");
				return true;
			}
		}
		return false;
		
	}
	

	private boolean getHRApproval() {
		System.out.println("HR Approved the request");
		return true;
	}



	public void displayTeacherInformation() {
		System.out.println("------------------Teacher Information------------------");
		System.out.println("NAME: "+name);
		System.out.println("AGE: "+age);
		System.out.println("EMP ID: "+empID);
		System.out.println("CONTACT NUMBER: "+contactNumber);
		System.out.println("ADDRESS: "+address);
		System.out.println("SUBJECT: "+subject);
		System.out.println("YEARS OF EXP: "+yearsOfExperience);
		System.out.println("Salary: $ "+salary);
		System.out.println("=======================================================");
	}
	
	public static int getTotalTeacherCount() {
		return teacherCount;
	}
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + ", contactNumber=" + contactNumber + ", address=" + address
				+ ", empID=" + empID + ", subject=" + subject + ", yearsOfExperience=" + yearsOfExperience + ", salary="
				+ salary + "]";
	}
	
	

}
