package com.exception.handling;

public class Person {

	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		if(validateAge(age) && validateName(name)) {
		this.name = name;
		this.age = age;
	}}

	private boolean validateAge(int age) {
		if(age>=18 && age<=90) {
			return true;
		}
		else {
			try {
			throw new InvalidAgeException ("Invalid Age Entered");
			}
			catch(InvalidAgeException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			return false;
		}
	}
	
	private boolean validateName(String name) {
		if(name==null || name.trim().isEmpty()) {
			throw new InvalidNameException("Name cannot be null of empty");
		}
		else if(!name.matches("[a-zA-Z\\s]+")){
			throw new InvalidNameException("Name can only have alphabets");
		}
		return true;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(validateName(name)) {
		this.name = name;
	}}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(validateAge(age)) {
		this.age = age;
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	
	
	
}
