package com.student.management.system.opps;

import java.io.Serializable;

import com.student.management.system.exceptions.InvalidAddressException;
import com.student.management.system.exceptions.InvalidContactNumberException;

public abstract class Person implements Serializable {
	public static final long serialVersionUID=1L;
	protected String name;
	protected int age;
	protected String address;
	protected String contactNumber;
	private static int personCounter=0;

	public Person(String name, int age, String address, String contactNumber) {
		super();
		if (validateContactNumber(contactNumber) && validateAddress(address)) {
			this.name = name;
			this.age = age;
			this.address = address;
			this.contactNumber = contactNumber;
			personCounter++;
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
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (validateAddress(address)) {
			this.address = address;
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

	private boolean validateAddress(String address) {
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

	private boolean validateContactNumber(String contactNumber) {
		if (contactNumber.matches("\\d{10}")) {
			return true;
		} else {
			try {
			throw new InvalidContactNumberException("Contact Number needs to be a number");
			}
			catch(InvalidContactNumberException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			return false;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", contactNumber=" + contactNumber
				+ "]";
	}

	protected boolean updateInformation(String newAddress, String newContactNumber) {
		if (validateAddress(newAddress) && validateContactNumber(newContactNumber)) {
			this.address = newAddress;
			this.contactNumber = newContactNumber;
			System.out.println("Updated address and contact number");
			return true;
		}
		else {
			return false;
		}
	}
	
	protected boolean updateInformation(String newAddress) {
		if (validateAddress(newAddress) ) {
			this.address = newAddress;
			System.out.println("Updated address");
			return true;
		}
		else {
			return false;
		}
	}
	
	protected boolean updateInformation(String newContactNumber, boolean update) {
		if (validateContactNumber(newContactNumber)) {
			this.contactNumber = newContactNumber;
			System.out.println("Updated contact number");
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int getTotalPersonCount() {
		return personCounter;
	}

}
