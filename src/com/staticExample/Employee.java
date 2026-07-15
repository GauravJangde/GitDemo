package com.staticExample;

public class Employee {
	private String name;
	public static String companyName;
	
	static {
		companyName = "Infosis";
	}
	
	public Employee(String name) {
		this.name=name;
	}
}
