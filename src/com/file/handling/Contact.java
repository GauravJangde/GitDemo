package com.file.handling;

import java.io.Serializable;

public class Contact implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String contactNumber;

	public Contact(String name, String contactNumber) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", contactNumber=" + contactNumber + "]";
	}

}
