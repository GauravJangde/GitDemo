package com.collections.list;

public class Contact {

	private String name;
	private String contactNumber;

	public Contact(String name, String contactNumber) {
		super();
		if (validateName(name)&&validateContactNumber(contactNumber)) {
			this.name = name;
			this.contactNumber = contactNumber;
		}
	}

	private boolean validateName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be null or empty");
		} else {
			return true;
		}
	}
	
	private boolean validateContactNumber(String contactNumber) {
		if(contactNumber==null || contactNumber.isEmpty() || contactNumber.length()!=10 || !contactNumber.matches("\\d{10}")) {
			throw new IllegalArgumentException("Contact number cannot be null or emply. Also it should be 10 digits");
		}
		else {
			return true;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (validateName(name)) {
			this.name = name;
		}
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		if(validateContactNumber(contactNumber)) {
			this.contactNumber = contactNumber;
		}
		
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", contactNumber=" + contactNumber + "]";
	}

}
