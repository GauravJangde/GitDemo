package com.demo;

public class Person {
	private String name;
	private int id;
	
	public Person(){
		System.out.println("Default Constructor is called");
	}
	
	public Person(String name, int id) {
		System.out.println("Parameterised constructor is called");
		this.name = name;
		this.id = id;
	}
	
	public Person(Person other) {
		System.out.println("This is copy constructor");
		this.name = other.name;
		this.id = other.id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
