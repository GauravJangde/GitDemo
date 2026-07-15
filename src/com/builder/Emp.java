package com.builder;

public class Emp {
	private final String name;
	private final int empId;
	private final double salary;
	
	
	private Emp(String name, int empId, double salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}


	public String getName() {
		return name;
	}

	public int getEmpId() {
		return empId;
	}

	public double getSalary() {
		return salary;
	}


	@Override
	public String toString() {
		return "Emp [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}
	
	
	public static class Builder{
		private String name;
		private int empId;
		private double salary;
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder empId(int empId) {
			this.empId = empId;
			return this;
		}
		
		public Builder salary(double salary) {
			this.salary = salary;
			return this;
		}
		
		public Emp build() {
			Emp e1 = new Emp(name,empId,salary);
			return e1;
		}
	}
	
}
